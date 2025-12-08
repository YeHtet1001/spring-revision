package com.revision.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProfileBootDemoApplication implements CommandLineRunner {

    @Value("${app.name}")
    private String appName;

    @Override
    public void run(String... args) throws Exception {

        System.out.println(appName);

    }

    public static void main(String[] args) {

        SpringApplication.run(ProfileBootDemoApplication.class, args);

    }

}
