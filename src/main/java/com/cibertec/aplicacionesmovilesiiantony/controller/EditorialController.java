package com.cibertec.aplicacionesmovilesiiantony.controller;

import com.cibertec.aplicacionesmovilesiiantony.model.Editorial;
import com.cibertec.aplicacionesmovilesiiantony.service.impl.EditorialServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/editorial")
public class EditorialController {

    @Autowired
    private EditorialServiceImpl servicio;

    @GetMapping("/list")
    public ResponseEntity<?> index() {

        List<Editorial> lista =  servicio.listarTodo();

        return ResponseEntity.ok(lista);
    }

    @PostMapping("/save")
    public ResponseEntity<String> registrarEditorial(@RequestBody Editorial editorial){
        try{
            servicio.save(editorial);
            return ResponseEntity.ok().body("Editorial registrada");
        }catch(Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.badRequest().body("Error en el registro");
    }

    @PutMapping("/update")
    public ResponseEntity<String> modicarEditorial(@RequestBody Editorial editorial){
        try{
            servicio.update(editorial);
            return ResponseEntity.ok().body("Editorial modificada");
        }catch(Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.badRequest().body("Error en la modificacion de la editorial");
    }

    @GetMapping  ("/find/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Integer id){
        Editorial editorial;
        try{
            editorial = servicio.findByInd(id);
            if(editorial!=null){
                return ResponseEntity.ok(editorial);
            }
            else{
                return ResponseEntity.ok("Editorial no encontrada");
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
            return ResponseEntity.ok("Editorial Eliminada");
        }catch(Exception e){
            e.printStackTrace();
        }

        return ResponseEntity.badRequest().body("Algo salio mal");
    }
}
