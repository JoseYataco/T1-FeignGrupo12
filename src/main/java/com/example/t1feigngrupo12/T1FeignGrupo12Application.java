package com.example.t1feigngrupo12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class T1FeignGrupo12Application {

    public static void main(String[] args) {
        SpringApplication.run(T1FeignGrupo12Application.class, args);
    }

}
