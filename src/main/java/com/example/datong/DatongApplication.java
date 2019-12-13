package com.example.datong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.datong.controller"})//扫描控制层
@ComponentScan(basePackages = {"com.example.datong.service"})//扫描业务层
@MapperScan("com.example.datong.dao")
public class DatongApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatongApplication.class, args);
    }

}
