```java
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
                    margin: 0;
                    padding: 0;
                    box-sizing: border-box;
                    font-family: Arial, Helvetica, sans-serif;
                }

                body {
                    min-height: 100vh;
                    background:
                        radial-gradient(circle at top left, #1e3a8a, transparent 35%),
                        radial-gradient(circle at bottom right, #312e81, transparent 35%),
                        #020617;
                    color: #ffffff;
                    display: flex;
                    justify-content: center;
                    align-items: center;
                    padding: 30px;
                }

                .container {
                    width: 100%;
                    max-width: 1100px;
                    background: rgba(15, 23, 42, 0.88);
                    border: 1px solid rgba(255,255,255,0.12);
                    border-radius: 24px;
                    padding: 45px;
                    box-shadow: 0 25px 80px rgba(0,0,0,0.45);
                    backdrop-filter: blur(15px);
                }

                .badge {
                    display: inline-block;
                    background: rgba(34,197,94,0.15);
                    color: #4ade80;
                    border: 1px solid rgba(74,222,128,0.35);
                    padding: 8px 16px;
                    border-radius: 50px;
                    font-size: 14px;
                    font-weight: bold;
                    margin-bottom: 20px;
                }

                h1 {
                    font-size: 46px;
                    margin-bottom: 12px;
                    background: linear-gradient(90deg, #60a5fa, #a78bfa, #22d3ee);
                    -webkit-background-clip: text;
                    -webkit-text-fill-color: transparent;
                }

                .subtitle {
                    color: #94a3b8;
                    font-size: 18px;
                    margin-bottom: 40px;
                }

                .success {
                    background: rgba(34,197,94,0.08);
                    border: 1px solid rgba(34,197,94,0.25);
                    border-radius: 16px;
                    padding: 20px;
                    margin-bottom: 35px;
                    color: #86efac;
                    font-size: 18px;
                }

                .pipeline {
                    display: grid;
                    grid-template-columns: repeat(5, 1fr);
                    gap: 15px;
                    margin-bottom: 40px;
                }

                .stage {
                    background: rgba(30,41,59,0.8);
                    border: 1px solid rgba(148,163,184,0.15);
                    border-radius: 16px;
                    padding: 22px 12px;
                    text-align: center;
                    transition: transform 0.25s, border-color 0.25s;
                }

                .stage:hover {
                    transform: translateY(-6px);
                    border-color: #60a5fa;
                }

                .icon {
                    font-size: 36px;
                    margin-bottom: 12px;
                }

                .stage h3 {
                    font-size: 16px;
                    margin-bottom: 7px;
                }

                .stage p {
                    font-size: 12px;
                    color: #94a3b8;
                }

                .arrow {
                    display: flex;
                    align-items: center;
                    justify-content: center;
                    color: #38bdf8;
                    font-size: 25px;
                }

                .info {
                    display: grid;
                    grid-template-columns: repeat(3, 1fr);
                    gap: 18px;
                }

                .info-card {
                    background: rgba(30,41,59,0.65);
                    padding: 22px;
                    border-radius: 16px;
                    border: 1px solid rgba(148,163,184,0.12);
                }

                .info-card span {
                    display: block;
                    color: #64748b;
                    font-size: 13px;
                    margin-bottom: 8px;
                }

                .info-card strong {
                    font-size: 17px;
                    color: #e2e8f0;
                }

                .footer {
                    margin-top: 35px;
                    text-align: center;
                    color: #64748b;
                    font-size: 13px;
                }

                @media (max-width: 800px) {
                    h1 {
                        font-size: 34px;
                    }

                    .pipeline {
                        grid-template-columns: 1fr;
                    }

                    .info {
                        grid-template-columns: 1fr;
                    }

                    .container {
                        padding: 25px;
                    }
                }
            </style>
        </head>

        <body>

            <div class="container">

                <div class="badge">● DEPLOYMENT SUCCESSFUL</div>

                <h1>DevOps Deployment Dashboard</h1>

                <p class="subtitle">
                    Spring Boot application successfully deployed through a modern CI/CD pipeline.
                </p>

                <div class="success">
                    ✓ Application is running successfully
                    <br>
                    <small>Build → Container → Kubernetes → GitOps</small>
                </div>

                <div class="pipeline">

                    <div class="stage">
                        <div class="icon">☕</div>
                        <h3>Spring Boot</h3>
                        <p>Application</p>
                    </div>

                    <div class="stage">
                        <div class="icon">🔨</div>
                        <h3>GoCD</h3>
                        <p>CI Pipeline</p>
                    </div>

                    <div class="stage">
                        <div class="icon">🐳</div>
                        <h3>Docker</h3>
                        <p>Container</p>
                    </div>

                    <div class="stage">
                        <div class="icon">☸️</div>
                        <h3>Kubernetes</h3>
                        <p>Orchestration</p>
                    </div>

                    <div class="stage">
                        <div class="icon">🚀</div>
                        <h3>ArgoCD</h3>
                        <p>GitOps</p>
                    </div>

                </div>

                <div class="info">

                    <div class="info-card">
                        <span>APPLICATION</span>
                        <strong>Spring Boot 3.x</strong>
                    </div>

                    <div class="info-card">
                        <span>BUILD TOOL</span>
                        <strong>Maven</strong>
                    </div>

                    <div class="info-card">
                        <span>DEPLOYMENT</span>
                        <strong>Kubernetes + ArgoCD</strong>
                    </div>

                </div>

                <div class="footer">
                    Built with Spring Boot • Automated with GoCD • Deployed with GitOps
                </div>

            </div>

        </body>
        </html>
        """;
    }
}
```

