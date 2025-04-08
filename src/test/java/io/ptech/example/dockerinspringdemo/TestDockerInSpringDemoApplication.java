package io.ptech.example.dockerinspringdemo;

import org.springframework.boot.SpringApplication;

public class TestDockerInSpringDemoApplication {

    public static void main(String[] args) {
        SpringApplication.from(DockerInSpringDemoApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
