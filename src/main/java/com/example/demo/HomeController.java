cat > HomeController.java <<'EOF'
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "/", produces = "text/html")
    public String home() {
        return """
        <!DOCTYPE html>
        <html lang="en">
        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>DevOps Deployment Dashboard</title>
            <style>
                * {
                    box-sizing: border-box;
                    margin: 0;
                    padding: 0;
                    font-family: Arial, sans-serif;
                }

                body {
                    min-height: 100vh;
                    background: linear-gradient(135deg, #020617, #0f172a, #1e1b4b);
                    color: white;
                    display: flex;
                    align-items: center;
                    justify-content: center;
                    padding: 30px;
                }

                .container {
                    width: 100%;
                    max-width: 1100px;
                    padding: 45px;
                    border-radius: 25px;
                    background: rgba(15, 23, 42, 0.92);
                    border: 1px solid rgba(255,255,255,0.12);
                    box-shadow: 0 25px 80px rgba(0,0,0,0.5);
                }

                .status {
                    display: inline-block;
                    padding: 8px 16px;
                    border-radius: 30px;
                    background: rgba(34,197,94,0.15);
                    color: #4ade80;
                    border: 1px solid rgba(74,222,128,0.3);
                    margin-bottom: 20px;
                    font-size: 14px;
                    font-weight: bold;
                }

                h1 {
                    font-size: 46px;
                    margin-bottom: 15px;
                }

                .gradient {
                    background: linear-gradient(90deg, #60a5fa, #a78bfa, #22d3ee);
                    -webkit-background-clip: text;
                    -webkit-text-fill-color: transparent;
                }

                .subtitle {
                    color: #94a3b8;
                    font-size: 18px;
                    margin-bottom: 35px;
                }

                .success {
                    padding: 20px;
                    border-radius: 15px;
                    background: rgba(34,197,94,0.08);
                    border: 1px solid rgba(34,197,94,0.25);
                    color: #86efac;
                    margin-bottom: 35px;
                    font-size: 18px;
                }

                .pipeline {
                    display: grid;
                    grid-template-columns: repeat(5, 1fr);
                    gap: 15px;
                }

                .card {
                    padding: 25px 15px;
                    text-align: center;
                    border-radius: 16px;
                    background: rgba(30,41,59,0.8);
                    border: 1px solid rgba(148,163,184,0.15);
                    transition: 0.3s;
                }

                .card:hover {
                    transform: translateY(-7px);
                    border-color: #60a5fa;
                }

                .icon {
                    font-size: 38px;
                    margin-bottom: 12px;
                }

                .card h3 {
                    font-size: 17px;
                    margin-bottom: 7px;
                }

                .card p {
                    color: #94a3b8;
                    font-size: 13px;
                }

                .info {
                    margin-top: 35px;
                    display: grid;
                    grid-template-columns: repeat(3, 1fr);
                    gap: 15px;
                }

                .info-card {
                    padding: 20px;
                    border-radius: 15px;
                    background: rgba(30,41,59,0.6);
                }

                .label {
                    display: block;
                    color: #64748b;
                    font-size: 12px;
                    margin-bottom: 8px;
                }

                .value {
                    font-size: 17px;
                    font-weight: bold;
                }

                footer {
                    text-align: center;
                    color: #64748b;
                    margin-top: 35px;
                    font-size: 13px;
                }

                @media (max-width: 800px) {
                    .pipeline,
                    .info {
                        grid-template-columns: 1fr;
                    }

                    h1 {
                        font-size: 34px;
                    }

                    .container {
                        padding: 25px;
                    }
                }
            </style>
        </head>

        <body>

        <div class="container">

            <div class="status">● DEPLOYMENT SUCCESSFUL</div>

            <h1>
                <span class="gradient">DevOps Deployment Dashboard</span>
            </h1>

            <p class="subtitle">
                Spring Boot application deployed through an automated CI/CD pipeline.
            </p>

            <div class="success">
                ✓ Application is running successfully
                <br>
                <small>Build → Container → Kubernetes → GitOps</small>
            </div>

            <div class="pipeline">

                <div class="card">
                    <div class="icon">☕</div>
                    <h3>Spring Boot</h3>
                    <p>Application</p>
                </div>

                <div class="card">
                    <div class="icon">⚙️</div>
                    <h3>GoCD</h3>
                    <p>Continuous Integration</p>
                </div>

                <div class="card">
                    <div class="icon">🐳</div>
                    <h3>Docker</h3>
                    <p>Containerization</p>
                </div>

                <div class="card">
                    <div class="icon">☸️</div>
                    <h3>Kubernetes</h3>
                    <p>Orchestration</p>
                </div>

                <div class="card">
                    <div class="icon">🚀</div>
                    <h3>ArgoCD</h3>
                    <p>GitOps Deployment</p>
                </div>

            </div>

            <div class="info">

                <div class="info-card">
                    <span class="label">BUILD</span>
                    <span class="value">Maven + Java 17</span>
                </div>

                <div class="info-card">
                    <span class="label">CONTAINER</span>
                    <span class="value">Docker</span>
                </div>

                <div class="info-card">
                    <span class="label">DEPLOYMENT</span>
                    <span class="value">Kubernetes + ArgoCD</span>
                </div>

            </div>

            <footer>
                Spring Boot • GoCD • Docker • Kubernetes • ArgoCD
            </footer>

        </div>

        </body>
        </html>
        """;
    }
}
EOF
