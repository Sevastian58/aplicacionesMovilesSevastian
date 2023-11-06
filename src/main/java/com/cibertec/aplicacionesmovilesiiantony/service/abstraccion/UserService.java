package com.cibertec.aplicacionesmovilesiiantony.service.abstraccion;

import com.cibertec.aplicacionesmovilesiiantony.model.User;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<User> listAll();
    ResponseEntity<?> login(Map<String, String> requestMap);
    ResponseEntity<String> signUp(Map<String, String> requestMap);
    ResponseEntity<?> updatePassword(Map<String, String> requestMap);
    ResponseEntity<?> updateUser(Map<String, String> requestMap);

}
