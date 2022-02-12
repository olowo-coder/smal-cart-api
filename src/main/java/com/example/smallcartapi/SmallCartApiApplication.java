package com.example.smallcartapi;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
        title="Supermarket API",
        version = "1.0.1",
        contact = @Contact(
                name = "Example API Support",
                url = "http://exampleurl.com/contact",
                email = "lanre@example.com"),
        license = @License(
                name = "LanreBest 1.0",
                url = "https://www.example.org/licenses/LICENSE-2.0.html")))
public class SmallCartApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmallCartApiApplication.class, args);
    }

}
