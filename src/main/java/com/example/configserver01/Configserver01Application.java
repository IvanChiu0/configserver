package com.example.configserver01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Configserver01Application {

    public static void main(String[] args) {
        SpringApplication.run(Configserver01Application.class, args);
    }

}
