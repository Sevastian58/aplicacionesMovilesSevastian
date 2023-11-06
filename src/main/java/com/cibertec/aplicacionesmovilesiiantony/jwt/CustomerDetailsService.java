package com.cibertec.aplicacionesmovilesiiantony.jwt;

import com.cibertec.aplicacionesmovilesiiantony.model.User;
import com.cibertec.aplicacionesmovilesiiantony.model.mapper.DTOUser;
import com.cibertec.aplicacionesmovilesiiantony.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;

@Service
public class CustomerDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepo;

    private User user;
    private DTOUser dtoUser;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //username debe ser el login del objeto usuario;
        user = userRepo.iniciarSesion(username);

        if(!Objects.isNull(user)){
            return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), new ArrayList<>());

        }
        else{
            throw new UsernameNotFoundException("Usuario no encontrado");
        }
    }

    public User getUserDetail(){
        return user;
    }


}
