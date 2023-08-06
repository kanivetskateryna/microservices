package com.epam.javacc.microservices;

import com.netflix.config.DynamicPropertyFactory;
import com.netflix.config.DynamicStringProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ConfigPropertiesController {

    private final DynamicStringProperty propertyOneWithDynamic
            = DynamicPropertyFactory.getInstance()
            .getStringProperty("archaius.properties.one", "not found!");

    @GetMapping("/property-from-dynamic-management")
    public String getPropertyValue() {
        return propertyOneWithDynamic.getName() + ": " + propertyOneWithDynamic.get();
    }

    public static void main(String[] args) {
        SpringApplication.run(ConfigPropertiesController.class, args);
    }
}