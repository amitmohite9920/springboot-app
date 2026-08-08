package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return """
                <!DOCTYPE html>
                <html>
                <head>
                    <title>Spring Boot DevOps Application</title>
                    <style>
                        body {
                            margin: 0;
                            font-family: Arial, sans-serif;
                            background: #f4f6f8;
                        }

                        .container {
                            max-width: 800px;
                            margin: 100px auto;
                            background: white;
                            padding: 40px;
                            text-align: center;
                            border-radius: 12px;
                            box-shadow: 0 4px 15px rgba(0,0,0,0.15);
                        }

                        h1 {
                            color: #1976d2;
                        }

                        .success {
                            color: #2e7d32;
                            font-size: 20px;
                            font-weight: bold;
                        }

                        .box {
                            margin-top: 30px;
                            padding: 20px;
                            background: #f1f8e9;
                            border-radius: 8px;
                        }

                        .tech {
                            margin-top: 25px;
                            font-size: 18px;
                        }
                    </style>
                </head>

                <body>

                    <div class="container">

                        <h1>🚀 Spring Boot DevOps Application</h1>

                        <p class="success">
                            Application Deployed Successfully!
                        </p>

                        <div class="box">
                            <h2>CI/CD Pipeline Working</h2>

                            <p>
                                GoCD → Docker → Docker Hub → GitOps → ArgoCD → Kubernetes
                            </p>
                        </div>

                        <div class="tech">
                            <p>☕ Spring Boot</p>
                            <p>🐳 Docker</p>
                            <p>☸ Kubernetes</p>
                            <p>🔄 ArgoCD</p>
                            <p>🚀 GoCD</p>
                        </div>

                    </div>

                </body>
                </html>
                """;
    }
}
