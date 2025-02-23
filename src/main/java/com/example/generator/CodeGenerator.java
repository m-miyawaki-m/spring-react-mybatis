package com.example.generator;

import java.util.Collections;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DateType;

/**
 * CodeGenerator is responsible for generating code based on the database schema.
 * It uses MyBatis-Plus's FastAutoGenerator to automate the generation of entity,
 * mapper, service, and controller classes.
 */
public class CodeGenerator {

    private static final String URL = "jdbc:oracle:thin:@//192.168.3.9:1521/orclpdb1";
    private static final String USERNAME = "hr";
    private static final String PASSWORD = "hr";
    private static final String PACKAGE_NAME = "com.example";
    private static final String OUTPUT_DIR = System.getProperty("user.dir") + "/src/main/java";

    /**
     * The main method to execute the code generation.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        FastAutoGenerator.create(URL, USERNAME, PASSWORD)
                .globalConfig(builder -> {
                    builder.author("m-miyawaki") // Set the author name
                            .enableSwagger() // Enable Swagger annotations
                            .dateType(DateType.TIME_PACK) // Use Java 8/11 date types
                            .commentDate("yyyy-MM-dd") // Set the date format for comments
                            .outputDir(OUTPUT_DIR); // Set the output directory
                })
                .packageConfig(builder -> {
                    builder.parent(PACKAGE_NAME) // Set the base package name
                            .entity("entity") // Set the package for entities
                            .mapper("mapper") // Set the package for mappers
                            .service("service") // Set the package for services
                            .serviceImpl("service.impl") // Set the package for service implementations
                            .controller("controller") // Set the package for controllers
                            .pathInfo(Collections.singletonMap(OutputFile.xml,
                                    System.getProperty("user.dir") + "/src/main/resources/mapper")); // Set the path for mapper XML files
                })
                .strategyConfig(builder -> {
                    builder.addInclude("EMPLOYEES") // Specify the table to generate code for
                            .addTablePrefix("T_") // Remove table prefix
                            .entityBuilder().enableLombok(); // Enable Lombok for entities
                })
                .execute();
    }
}
