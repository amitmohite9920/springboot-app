package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "<html>"
                + "<head>"
                + "<title>Spring Boot DevOps Application</title>"
                + "<style>"
                + "body { font-family: Arial; background: #f4f7fb; text-align: center; padding: 80px; }"
                + ".box { background: white; width: 600px; margin: auto; padding: 40px; border-radius: 15px; box-shadow: 0 5px 20px rgba(0,0,0,0.15); }"
                + "h1 { color: #1976d2; }"
                + ".success { color: green; font-size: 22px; font-weight: bold; }"
                + ".pipeline { background: #eef5ff; padding: 20px; margin-top: 25px; border-radius: 10px; }"
                + "</style>"
                + "</head>"
                + "<body>"
                + "<div class='box'>"
                + "<h1>Spring Boot DevOps Application</h1>"
                + "<p class='success'>Application Deployed Successfully!</p>"
                + "<div class='pipeline'>"
                + "<h2>CI/CD Pipeline</h2>"
                + "<p>GoCD → Docker → Docker Hub</p>"
                + "<p>GitHub → GitOps → ArgoCD → Kubernetes</p>"
                + "</div>"
                + "<p>Spring Boot Application is Running</p>"
                + "</div>"
                + "</body>"
                + "</html>";
    }
}
EOF
