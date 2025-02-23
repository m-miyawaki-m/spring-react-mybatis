package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The main application class for the Spring Boot application.
 * This class is responsible for bootstrapping the application.
 * 
 * It uses the {@link SpringBootApplication} annotation to mark it as a Spring Boot application.
 * The {@link MapperScan} annotation is used to specify the package to scan for MyBatis mapper interfaces.
 * 
 * @author [Your Name]
 * @see SpringApplication
 */

@SpringBootApplication
@MapperScan("com.example.mapper")
public class App {

    /**
     * The main method that serves as the entry point for the Spring Boot application.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
