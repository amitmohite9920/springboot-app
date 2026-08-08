package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

```
@GetMapping("/")
public String home() {
    return """
            <!DOCTYPE html>
            <html lang="en">
            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Spring Boot DevOps</title>

                <style>
                    * {
                        margin: 0;
                        padding: 0;
                        box-sizing: border-box;
                    }

                    body {
                        font-family: Arial, Helvetica, sans-serif;
                        min-height: 100vh;
                        background: linear-gradient(135deg, #0f172a, #1e3a8a, #2563eb);
                        color: white;
                        display: flex;
                        align-items: center;
                        justify-content: center;
                        padding: 30px;
                    }

                    .container {
                        width: 100%;
                        max-width: 1000px;
                        background: rgba(255, 255, 255, 0.12);
                        border: 1px solid rgba(255, 255, 255, 0.2);
                        backdrop-filter: blur(15px);
                        border-radius: 25px;
                        padding: 50px;
                        text-align: center;
                        box-shadow: 0 25px 60px rgba(0, 0, 0, 0.35);
                    }

                    .rocket {
                        font-size: 70px;
                        margin-bottom: 20px;
                    }

                    h1 {
                        font-size: 48px;
                        margin-bottom: 15px;
                    }

                    .subtitle {
                        font-size: 20px;
                        color: #dbeafe;
                        margin-bottom: 30px;
                    }

                    .success {
                        display: inline-block;
                        padding: 12px 25px;
                        border-radius: 30px;
                        background: #16a34a;
                        font-size: 18px;
                        font-weight: bold;
                        margin-bottom: 40px;
                        box-shadow: 0 8px 20px rgba(22, 163, 74, 0.35);
                    }

                    .pipeline {
                        background: rgba(0, 0, 0, 0.25);
                        border-radius: 18px;
                        padding: 30px;
                        margin-bottom: 35px;
                    }

                    .pipeline h2 {
                        margin-bottom: 25px;
                        font-size: 28px;
                    }

                    .flow {
                        display: flex;
                        justify-content: center;
                        align-items: center;
                        gap: 12px;
                        flex-wrap: wrap;
                    }

                    .step {
                        background: white;
                        color: #1e293b;
                        padding: 14px 20px;
                        border-radius: 12px;
                        font-weight: bold;
                        box-shadow: 0 6px 15px rgba(0, 0, 0, 0.2);
                    }

                    .arrow {
                        font-size: 25px;
                        font-weight: bold;
                    }

                    .cards {
                        display: grid;
                        grid-template-columns: repeat(4, 1fr);
                        gap: 18px;
                    }

                    .card {
                        background: rgba(255, 255, 255, 0.1);
                        border: 1px solid rgba(255, 255, 255, 0.15);
                        border-radius: 16px;
                        padding: 25px 15px;
                        transition: transform 0.3s;
                    }

                    .card:hover {
                        transform: translateY(-8px);
                        background: rgba(255, 255, 255, 0.18);
                    }

                    .icon {
                        font-size: 40px;
                        margin-bottom: 12px;
                    }

                    .card h3 {
                        margin-bottom: 8px;
                    }

                    .card p {
                        color: #dbeafe;
                        font-size: 14px;
                    }

                    .footer {
                        margin-top: 35px;
                        color: #bfdbfe;
                        font-size: 14px;
                    }

                    @media (max-width: 800px) {
                        .container {
                            padding: 30px 20px;
                        }

                        h1 {
                            font-size: 34px;
                        }

                        .cards {
                            grid-template-columns: repeat(2, 1fr);
                        }
                    }

                    @media (max-width: 500px) {
                        .cards {
                            grid-template-columns: 1fr;
                        }

                        .flow {
                            flex-direction: column;
                        }

                        .arrow {
                            transform: rotate(90deg);
                        }
                    }
                </style>
            </head>

            <body>

                <div class="container">

                    <div class="rocket">🚀</div>

                    <h1>Spring Boot DevOps</h1>

                    <p class="subtitle">
                        Automated CI/CD Deployment Platform
                    </p>

                    <div class="success">
                        ✓ Application Deployed Successfully
                    </div>

                    <div class="pipeline">

                        <h2>CI/CD Pipeline</h2>

                        <div class="flow">

                            <div class="step">💻 GitHub</div>
                            <div class="arrow">→</div>

                            <div class="step">🚀 GoCD</div>
                            <div class="arrow">→</div>

                            <div class="step">🐳 Docker</div>
                            <div class="arrow">→</div>

                            <div class="step">📦 Docker Hub</div>
                            <div class="arrow">→</div>

                            <div class="step">🔄 GitOps</div>
                            <div class="arrow">→</div>

                            <div class="step">⚓ ArgoCD</div>
                            <div class="arrow">→</div>

                            <div class="step">☸ Kubernetes</div>

                        </div>

                    </div>

                    <div class="cards">

                        <div class="card">
                            <div class="icon">☕</div>
                            <h3>Spring Boot</h3>
                            <p>Java application running successfully</p>
                        </div>

                        <div class="card">
                            <div class="icon">🐳</div>
                            <h3>Docker</h3>
                            <p>Application packaged as a container</p>
                        </div>

                        <div class="card">
                            <div class="icon">☸️</div>
                            <h3>Kubernetes</h3>
                            <p>Application deployed and running in pods</p>
                        </div>

                        <div class="card">
                            <div class="icon">🔄</div>
                            <h3>ArgoCD</h3>
                            <p>GitOps based continuous deployment</p>
                        </div>

                    </div>

                    <div class="footer">
                        Spring Boot → GoCD → Docker → GitHub → ArgoCD → Kubernetes
                    </div>

                </div>

            </body>
            </html>
            """;
}
```

}

