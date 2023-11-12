package com.cibertec.aplicacionesmovilesiiantony.controller;

import com.cibertec.aplicacionesmovilesiiantony.model.Rol;
import com.cibertec.aplicacionesmovilesiiantony.model.User;
import com.cibertec.aplicacionesmovilesiiantony.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl servicio;


    @GetMapping("/list")
    public ResponseEntity<?> index() {

        List<User> lista =  servicio.listAll();

        return ResponseEntity.ok(lista);
    }

    @PostMapping("/save")
    public ResponseEntity<String> registrarUsuario(@RequestBody Map<String, String> requestMap){
        try{
            servicio.signUp(requestMap);
            return ResponseEntity.ok().body("Usuario registrado");
        }catch(Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.badRequest().body("Error en el registro");
    }

    @PutMapping ("/update")
    public ResponseEntity<String> modicarUsuario(@RequestBody Map<String, String> requestMap){
        try{
            servicio.updateUser(requestMap);
            return ResponseEntity.ok().body("Usuario modificado");
        }catch(Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.badRequest().body("Error en la modificacion del usuario");
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> requestMap){
        try{
            return servicio.login(requestMap);
        }catch(Exception e){
            e.printStackTrace();
        }

        return ResponseEntity.badRequest().body("Algo salio mal");
    }

    @PutMapping("/forgotPassword")
    public ResponseEntity<?> updatePassword(@RequestBody Map<String, String> requestMap){
        try{
            return servicio.updatePassword(requestMap);
        }catch(Exception e){
            e.printStackTrace();
        }

        return ResponseEntity.badRequest().body("Algo salio mal");
    }


    @GetMapping  ("/find/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Integer id){
        User user;
        try{
           user = servicio.findById(id);
           if(user!=null){
               return ResponseEntity.ok(user);
           }
           else{
               return ResponseEntity.ok("Usuario no encontrado");
           }
        }catch(Exception e){
            e.printStackTrace();
        }

        return ResponseEntity.badRequest().body("Algo salio mal");
    }

    @DeleteMapping ("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id){
        try{
            servicio.deleteForId(id);
            return ResponseEntity.ok("Usuario Eliminado");
        }catch(Exception e){
            e.printStackTrace();
        }

        return ResponseEntity.badRequest().body("Algo salio mal");
    }
}
