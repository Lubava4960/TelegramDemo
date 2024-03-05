package com.example.telegramdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TelegramDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TelegramDemoApplication.class, args);
    }

}
