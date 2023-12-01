package com.cibertec.aplicacionesmovilesiiantony.controller;

import com.cibertec.aplicacionesmovilesiiantony.model.*;
import com.cibertec.aplicacionesmovilesiiantony.service.impl.LibroServiceImpl;
import com.cibertec.aplicacionesmovilesiiantony.service.impl.PrestamoHasLibroServiceImpl;
import com.cibertec.aplicacionesmovilesiiantony.service.impl.PrestamoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/prestamoLibro")
public class PrestamoHasLibroController {

    @Autowired
    private LibroServiceImpl libroService;

    @Autowired
    private PrestamoHasLibroServiceImpl prestamoHasLibroService;

    @Autowired
    private PrestamoServiceImpl prestamoService;

    @ResponseBody
    @PostMapping("/registrarPrestamoLibro")
    public HashMap<String, Object> registrarPrestamoLibro(@RequestBody PrestamoHasLibro obj){
        HashMap<String, Object> mapSalida = new HashMap<String, Object>();
        Libro l = new Libro();
        l=libroService.findByInd(obj.getLibro().getIdLibro());

        if(l!=null){

            //generamos un prestamo
            Prestamo p = new Prestamo();
            Alumno a = new Alumno();
            a.setIdAlumno(obj.getPrestamo().getAlumno().getIdAlumno());
            p.setAlumno(a);
            p.setFechaRegistro(new Date());

            Prestamo prestamoSalida = prestamoService.guardarPrestamo(p);

            if(prestamoSalida != null){
                if(l.getCantidad()<=0){
                    mapSalida.put("mensaje", "No hay libros disponibles ");
                }else{

                    //modificamos con el prestamo recien registrado
                    PrestamoHasLibroPK newId = new PrestamoHasLibroPK();
                    newId.setIdPrestamo(prestamoSalida.getIdPrestamo());
                    newId.setIdLibro(obj.getLibro().getIdLibro());

                    obj.setPrestamoHasLibroPK(newId);
                    obj.setPrestamo(prestamoSalida);


                    PrestamoHasLibro salida = prestamoHasLibroService.registrarPrestamoHasLibro(obj);
                    if(salida != null){
                        mapSalida.put("mensaje", "Se presto el libro con id " + obj.getLibro().getIdLibro());
                        mapSalida.put("data", salida);
                    }else{
                        mapSalida.put("mensaje", "Hubo un error al registrar el libro");
                    }
                }
            }else{
                mapSalida.put("mensaje", "Error al crear el prestamo");
            }



        }else{
            mapSalida.put("mensaje", "el libro no existe");
        }



        return  mapSalida;
    }


    @GetMapping("/listarLibros")
    public List<Libro> listarlibros(){
        return prestamoHasLibroService.listarLibros();
    }

    @GetMapping("/listarAlumnos")
    public List<Alumno> listarAlumnos(){
        return prestamoHasLibroService.listarAlumnos();
    }


    @GetMapping("/listarPrestamos")
    public List<PrestamoHasLibro> listarPrestamos(){
        return prestamoHasLibroService.listarTodo();
    }

}
