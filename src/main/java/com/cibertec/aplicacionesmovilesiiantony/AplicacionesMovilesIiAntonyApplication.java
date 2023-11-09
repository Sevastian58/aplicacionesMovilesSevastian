package com.cibertec.aplicacionesmovilesiiantony;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.cibertec.aplicacionesmovilesiiantony.model")

public class AplicacionesMovilesIiAntonyApplication {

    public static void main(String[] args) {
        SpringApplication.run(AplicacionesMovilesIiAntonyApplication.class, args);
    }

}
