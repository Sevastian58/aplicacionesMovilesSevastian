package com.cibertec.aplicacionesmovilesiiantony.controller;

import com.cibertec.aplicacionesmovilesiiantony.model.Autor;
import com.cibertec.aplicacionesmovilesiiantony.service.impl.AutorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/autor")
public class AutorController {

    @Autowired
    private AutorServiceImpl servicio;

    @GetMapping("/list")
    public ResponseEntity<?> index() {

        List<Autor> lista =  servicio.listarTodo();

        return ResponseEntity.ok(lista);
    }

    @PostMapping("/save")
    public ResponseEntity<String> registrarAutor(@RequestBody Autor autor){
        try{
            servicio.save(autor);
            return ResponseEntity.ok().body("Autor registrado");
        }catch(Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.badRequest().body("Error en el registro");
    }

    @PutMapping("/update")
    public ResponseEntity<String> modicarAutor(@RequestBody Autor autor){
        try{
            servicio.update(autor);
            return ResponseEntity.ok().body("Autor modificado");
        }catch(Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.badRequest().body("Error en la modificacion del autor");
    }


    @GetMapping  ("/find/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Integer id){
        Autor autor;
        try{
            autor = servicio.findByInd(id);
            if(autor!=null){
                return ResponseEntity.ok(autor);
            }
            else{
                return ResponseEntity.ok("Autor no encontrado");
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
            return ResponseEntity.ok("Autor Eliminado");
        }catch(Exception e){
            e.printStackTrace();
        }

        return ResponseEntity.badRequest().body("Algo salio mal");
    }
}
