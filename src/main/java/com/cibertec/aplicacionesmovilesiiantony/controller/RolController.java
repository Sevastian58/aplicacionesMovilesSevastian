package com.cibertec.aplicacionesmovilesiiantony.controller;

import com.cibertec.aplicacionesmovilesiiantony.model.Rol;
import com.cibertec.aplicacionesmovilesiiantony.service.impl.RolServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rol")
public class RolController {

    @Autowired
    private RolServiceImpl rolService;

    @GetMapping("listAll")
    public ResponseEntity<?> listarTodo(){
        List<Rol> lista = rolService.listAll();
        return ResponseEntity.ok(lista);
    }
}
