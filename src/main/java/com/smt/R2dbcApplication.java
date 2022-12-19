package com.smt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.smt")
@EnableAutoConfiguration
public class R2dbcApplication {
    public static void main(String[] args) {
        SpringApplication.run(R2dbcApplication.class, args);
    }
}