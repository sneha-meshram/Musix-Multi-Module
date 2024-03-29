package com.stackroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.PropertySource;

@EnableDiscoveryClient
@SpringBootApplication
public class TrackServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrackServiceApplication.class, args);
    }

}
