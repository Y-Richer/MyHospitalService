package com.richer.myhospital;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.richer.myhospital.dao")
@SpringBootApplication
public class MyhospitalApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyhospitalApplication.class, args);
    }

}
