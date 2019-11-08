package org.apache.custos.rest.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class GatewayInitializer {

    public static void main(String[] args) {
        SpringApplication.run(GatewayInitializer.class, args);
    }
}
