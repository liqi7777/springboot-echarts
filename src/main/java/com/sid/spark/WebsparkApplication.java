package com.sid.spark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sid")
public class WebsparkApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebsparkApplication.class, args);
    }

}
