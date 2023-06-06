package com.example.lojavirtualbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "com.example.lojavirtualbackend.model")
@SpringBootApplication
public class LojaVirtualBackEndApplication {

    public static void main(String[] args) {
        SpringApplication.run(LojaVirtualBackEndApplication.class, args);
    }

}
