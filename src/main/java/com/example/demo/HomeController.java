package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Hello from GoCD + SonarQube + Trivy + ArgoCD!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is running successfully.";
    }

    @GetMapping("/version")
    public String version() {
        return "Version 1.0";
    }
}
