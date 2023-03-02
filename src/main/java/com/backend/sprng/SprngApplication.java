package com.backend.sprng;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@ComponentScan(basePackages = {"com.backend.sprng"})
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@OpenAPIDefinition
@Slf4j
public class SprngApplication {

    public static void main(String[] args) {
        SpringApplication.run(SprngApplication.class, args);
    }
}
