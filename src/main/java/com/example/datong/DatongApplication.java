package com.example.datong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.datong.service","com.example.datong.controller"})
public class DatongApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatongApplication.class, args);
    }

}
