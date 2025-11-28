package ru.yandex.practicum.catsgram.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;

@SpringBootApplication
public class CatsgramApplication {
    public static void main(String[] args) {
        SpringApplication.run(CatsgramApplication.class, args);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}