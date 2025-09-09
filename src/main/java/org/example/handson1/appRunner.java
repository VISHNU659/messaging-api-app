package org.example.handson1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class appRunner {

    public static void main(String[] args) {
        SpringApplication.run(appRunner.class, args);
        System.out.println("Its up");
    }
}