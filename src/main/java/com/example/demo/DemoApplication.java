package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(DemoApplication.class);
        application.addInitializers(new TestApplicationContextInitializer());
        application.run(args);
    }

}
