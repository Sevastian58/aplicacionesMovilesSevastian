package com.cibertec.aplicacionesmovilesiiantony.controller;

import com.cibertec.aplicacionesmovilesiiantony.model.Libro;
import com.cibertec.aplicacionesmovilesiiantony.service.impl.LibroServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/libro")
public class LibroController {

    @Autowired
    private LibroServiceImpl servicio;

    @GetMapping("/list")
    public ResponseEntity<?> index() {

        List<Libro> lista =  servicio.listarTodo();

        return ResponseEntity.ok(lista);
    }

    @PostMapping("/save")
    public ResponseEntity<String> registrarLibro(@RequestBody Libro libro){
        try{
            servicio.save(libro);
            return ResponseEntity.ok().body("Libro registrado");
        }catch(Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.badRequest().body("Error en el registro");
    }

    @PutMapping("/update")
    public ResponseEntity<String> modicarLibro(@RequestBody Libro libro){
        try{
            servicio.update(libro);
            return ResponseEntity.ok().body("Libro modificado");
        }catch(Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.badRequest().body("Error en la modificacion del libro");
    }


    @GetMapping  ("/find/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Integer id){
        Libro libro;
        try{
            libro = servicio.findByInd(id);
            if(libro!=null){
                return ResponseEntity.ok(libro);
            }
            else{
                return ResponseEntity.ok("Libro no encontrado");
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        return ResponseEntity.badRequest().body("Algo salio mal");
    }

    @DeleteMapping ("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id){
        try{
            servicio.delete(id);
            return ResponseEntity.ok("Libro Eliminado");
        }catch(Exception e){
            e.printStackTrace();
        }

        return ResponseEntity.badRequest().body("Algo salio mal");
    }

}
