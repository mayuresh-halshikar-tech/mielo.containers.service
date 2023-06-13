package org.mielo.containers.service;

import org.mielo.containers.EnableContainerManagement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableContainerManagement(profiles = {"mysql", "mssql"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
