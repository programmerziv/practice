package com.ziv.anno;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AopApplication {


    public static void main(String[] args) {
        SpringApplication.run(AopApplication.class,args);
    }
}
