package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.demo.dao"})
@ComponentScan(basePackages = {"com.example.demo"})
public class ZucheApplication {
    public static void main(String[] args){
        SpringApplication.run(ZucheApplication.class,args);
    }
}
