package com.teobyte123.ecommerce.product_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    
    @GetMapping("/health") //maps http GET request to /health endpoint
    public String healthCheck() { //returns text when URL is accessed
        return "Product Service is up"; //text thats returned
    }
}
