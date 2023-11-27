package com.cibertec.aplicacionesmovilesiiantony;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EntityScan(basePackages = "com.cibertec.aplicacionesmovilesiiantony.model")

public class AplicacionesMovilesIiAntonyApplication implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(AplicacionesMovilesIiAntonyApplication.class, args);
    }
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedMethods("HEAD", "GET", "PUT", "POST", "DELETE", "PATCH");
    }

}
