package com.example.datong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.example.datong.controller")
@ComponentScan("com.example.datong.service")
@MapperScan("com.example.datong.dao")
@SpringBootApplication
public class DatongApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatongApplication.class, args);
    }

}
