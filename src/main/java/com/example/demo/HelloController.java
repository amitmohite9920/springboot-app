package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <title>DevOps Deployment Platform</title>

                    <style>
                        * {
                            margin: 0;
                            padding: 0;
                            box-sizing: border-box;
                        }

                        body {
                            font-family: Arial, Helvetica, sans-serif;
                            min-height: 100vh;
                            background: linear-gradient(135deg, #0f172a, #1e293b, #0f172a);
                            color: #ffffff;
                        }

                        .navbar {
                            height: 70px;
                            display: flex;
                            align-items: center;
                            justify-content: space-between;
                            padding: 0 7%;
                            border-bottom: 1px solid rgba(255,255,255,0.1);
                            background: rgba(15,23,42,0.8);
                        }

                        .logo {
                            font-size: 24px;
                            font-weight: bold;
                            color: #38bdf8;
                        }

                        .status {
                            display: flex;
                            align-items: center;
                            gap: 8px;
                            font-size: 14px;
                            color: #86efac;
                        }

                        .dot {
                            width: 10px;
                            height: 10px;
                            background: #22c55e;
                            border-radius: 50%;
                            box-shadow: 0 0 12px #22c55e;
                        }

                        .hero {
                            text-align: center;
                            padding: 75px 20px 45px;
                        }

                        .badge {
                            display: inline-block;
                            padding: 8px 18px;
                            border-radius: 30px;
                            background: rgba(56,189,248,0.12);
                            border: 1px solid rgba(56,189,248,0.35);
                            color: #7dd3fc;
                            font-size: 14px;
                            margin-bottom: 25px;
                        }

                        h1 {
                            font-size: 52px;
                            line-height: 1.1;
                            margin-bottom: 20px;
                            background: linear-gradient(90deg, #38bdf8, #818cf8, #c084fc);
                            -webkit-background-clip: text;
                            -webkit-text-fill-color: transparent;
                        }

                        .subtitle {
                            max-width: 750px;
                            margin: auto;
                            color: #cbd5e1;
                            font-size: 19px;
                            line-height: 1.7;
                        }

                        .success {
                            margin: 30px auto;
                            display: inline-block;
                            padding: 13px 25px;
                            border-radius: 30px;
                            background: rgba(34,197,94,0.12);
                            border: 1px solid rgba(34,197,94,0.4);
                            color: #86efac;
                            font-weight: bold;
                        }

                        .pipeline {
                            max-width: 1100px;
                            margin: 20px auto 60px;
                            padding: 0 20px;
                        }

                        .pipeline-title {
                            text-align: center;
                            font-size: 28px;
                            margin-bottom: 30px;
                        }

                        .steps {
                            display: grid;
                            grid-template-columns: repeat(6, 1fr);
                            gap: 15px;
                        }

                        .step {
                            background: rgba(255,255,255,0.06);
                            border: 1px solid rgba(255,255,255,0.1);
                            border-radius: 14px;
                            padding: 22px 10px;
                            text-align: center;
                            transition: 0.3s;
                        }

                        .step:hover {
                            transform: translateY(-7px);
                            border-color: #38bdf8;
                            background: rgba(56,189,248,0.1);
                        }

                        .icon {
                            font-size: 35px;
                            margin-bottom: 12px;
                        }

                        .step h3 {
                            font-size: 15px;
                            margin-bottom: 7px;
                        }

                        .step p {
                            color: #94a3b8;
                            font-size: 12px;
                        }

                        .cards {
                            max-width: 1100px;
                            margin: auto;
                            padding: 0 20px 70px;
                            display: grid;
                            grid-template-columns: repeat(3, 1fr);
                            gap: 20px;
                        }

                        .card {
                            padding: 28px;
                            border-radius: 18px;
                            background: rgba(255,255,255,0.06);
                            border: 1px solid rgba(255,255,255,0.1);
                        }

                        .card h2 {
                            margin-bottom: 12px;
                            color: #7dd3fc;
                        }

                        .card p {
                            color: #cbd5e1;
                            line-height: 1.6;
                        }

                        .footer {
                            text-align: center;
                            padding: 25px;
                            border-top: 1px solid rgba(255,255,255,0.1);
                            color: #64748b;
                            font-size: 14px;
                        }

                        @media (max-width: 900px) {
                            .steps {
                                grid-template-columns: repeat(3, 1fr);
                            }

                            .cards {
                                grid-template-columns: 1fr;
                            }

                            h1 {
                                font-size: 40px;
                            }
                        }

                        @media (max-width: 600px) {
                            .steps {
                                grid-template-columns: repeat(2, 1fr);
                            }

                            h1 {
                                font-size: 32px;
                            }

                            .subtitle {
                                font-size: 16px;
                            }
                        }
                    </style>
                </head>

                <body>

                    <nav class="navbar">
                        <div class="logo">⚡ DevOps Platform</div>

                        <div class="status">
                            <span class="dot"></span>
                            Production Healthy
                        </div>
                    </nav>

                    <section class="hero">

                        <div class="badge">
                            🚀 CONTINUOUS DELIVERY PLATFORM
                        </div>

                        <h1>Spring Boot DevOps Application</h1>

                        <p class="subtitle">
                            A production-style application deployed through an automated
                            CI/CD and GitOps pipeline running on Kubernetes.
                        </p>

                        <div class="success">
                            ✓ Deployment Successful
                        </div>

                    </section>

                    <section class="pipeline">

                        <h2 class="pipeline-title">
                            CI/CD Pipeline
                        </h2>

                        <div class="steps">

                            <div class="step">
                                <div class="icon">🔄</div>
                                <h3>GoCD</h3>
                                <p>Continuous Integration</p>
                            </div>

                            <div class="step">
                                <div class="icon">☕</div>
                                <h3>Maven</h3>
                                <p>Build & Package</p>
                            </div>

                            <div class="step">
                                <div class="icon">🐳</div>
                                <h3>Docker</h3>
                                <p>Containerization</p>
                            </div>

                            <div class="step">
                                <div class="icon">📦</div>
                                <h3>Docker Hub</h3>
                                <p>Image Registry</p>
                            </div>

                            <div class="step">
                                <div class="icon">🔀</div>
                                <h3>ArgoCD</h3>
                                <p>GitOps Deployment</p>
                            </div>

                            <div class="step">
                                <div class="icon">☸️</div>
                                <h3>Kubernetes</h3>
                                <p>Container Orchestration</p>
                            </div>

                        </div>

                    </section>

                    <section class="cards">

                        <div class="card">
                            <h2>⚙️ Automated Delivery</h2>
                            <p>
                                Source code changes trigger an automated build,
                                container creation and deployment workflow.
                            </p>
                        </div>

                        <div class="card">
                            <h2>☸️ Kubernetes Ready</h2>
                            <p>
                                The application is packaged as a container and
                                deployed on a Kubernetes cluster.
                            </p>
                        </div>

                        <div class="card">
                            <h2>🔐 GitOps Workflow</h2>
                            <p>
                                ArgoCD continuously synchronizes the desired
                                application state from the Git repository.
                            </p>
                        </div>

                    </section>

                    <footer class="footer">
                        Spring Boot • GoCD • Docker • Docker Hub • ArgoCD • Kubernetes
                        <br><br>
                        DevOps Deployment Demo | Production Ready 🚀
                    </footer>

                </body>
                </html>
                """;
    }
}
