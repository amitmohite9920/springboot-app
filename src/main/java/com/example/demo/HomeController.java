```java
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
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
                        }

                        body {
                            font-family: Arial, Helvetica, sans-serif;
                            min-height: 100vh;
                            background:
                                radial-gradient(circle at top left, #243b55, transparent 40%),
                                radial-gradient(circle at bottom right, #141e30, transparent 40%),
                                #0f172a;
                            color: white;
                        }

                        /* Header */

                        header {
                            padding: 25px 8%;
                            display: flex;
                            justify-content: space-between;
                            align-items: center;
                            border-bottom: 1px solid rgba(255,255,255,0.1);
                            backdrop-filter: blur(10px);
                        }

                        .logo {
                            font-size: 24px;
                            font-weight: bold;
                        }

                        .logo span {
                            color: #38bdf8;
                        }

                        .status {
                            display: flex;
                            align-items: center;
                            gap: 8px;
                            background: rgba(34,197,94,0.15);
                            border: 1px solid rgba(34,197,94,0.4);
                            padding: 8px 15px;
                            border-radius: 25px;
                            color: #4ade80;
                            font-size: 14px;
                        }

                        .dot {
                            width: 9px;
                            height: 9px;
                            background: #22c55e;
                            border-radius: 50%;
                            box-shadow: 0 0 10px #22c55e;
                        }

                        /* Hero */

                        .hero {
                            text-align: center;
                            padding: 80px 20px 50px;
                        }

                        .hero h1 {
                            font-size: 52px;
                            margin-bottom: 20px;
                            background: linear-gradient(90deg, #38bdf8, #818cf8, #c084fc);
                            -webkit-background-clip: text;
                            -webkit-text-fill-color: transparent;
                        }

                        .hero p {
                            color: #cbd5e1;
                            font-size: 19px;
                            max-width: 700px;
                            margin: auto;
                            line-height: 1.7;
                        }

                        /* Main container */

                        .container {
                            width: 90%;
                            max-width: 1100px;
                            margin: auto;
                        }

                        /* Deployment card */

                        .deployment {
                            background: rgba(255,255,255,0.06);
                            border: 1px solid rgba(255,255,255,0.12);
                            border-radius: 20px;
                            padding: 30px;
                            margin-bottom: 35px;
                            backdrop-filter: blur(15px);
                            box-shadow: 0 20px 50px rgba(0,0,0,0.25);
                        }

                        .deployment h2 {
                            margin-bottom: 25px;
                            font-size: 25px;
                        }

                        .pipeline {
                            display: flex;
                            align-items: center;
                            justify-content: space-between;
                            gap: 10px;
                            flex-wrap: wrap;
                        }

                        .step {
                            flex: 1;
                            min-width: 120px;
                            text-align: center;
                            padding: 18px 10px;
                            background: rgba(255,255,255,0.06);
                            border-radius: 15px;
                            border: 1px solid rgba(255,255,255,0.1);
                            transition: 0.3s;
                        }

                        .step:hover {
                            transform: translateY(-6px);
                            background: rgba(56,189,248,0.12);
                            border-color: #38bdf8;
                        }

                        .step-icon {
                            font-size: 30px;
                            margin-bottom: 10px;
                        }

                        .step-title {
                            font-weight: bold;
                            font-size: 14px;
                        }

                        .arrow {
                            font-size: 25px;
                            color: #38bdf8;
                        }

                        /* Technology cards */

                        .section-title {
                            text-align: center;
                            margin: 50px 0 25px;
                            font-size: 28px;
                        }

                        .cards {
                            display: grid;
                            grid-template-columns: repeat(auto-fit, minmax(200px, 1fr));
                            gap: 20px;
                        }

                        .card {
                            padding: 25px;
                            border-radius: 18px;
                            background: rgba(255,255,255,0.06);
                            border: 1px solid rgba(255,255,255,0.1);
                            transition: 0.3s;
                        }

                        .card:hover {
                            transform: translateY(-8px);
                            box-shadow: 0 15px 35px rgba(0,0,0,0.3);
                        }

                        .card-icon {
                            font-size: 40px;
                            margin-bottom: 15px;
                        }

                        .card h3 {
                            margin-bottom: 8px;
                        }

                        .card p {
                            color: #94a3b8;
                            font-size: 14px;
                            line-height: 1.5;
                        }

                        /* Status */

                        .success-box {
                            margin-top: 35px;
                            padding: 25px;
                            text-align: center;
                            border-radius: 15px;
                            background: rgba(34,197,94,0.08);
                            border: 1px solid rgba(34,197,94,0.3);
                        }

                        .success-box h2 {
                            color: #4ade80;
                            margin-bottom: 10px;
                        }

                        .success-box p {
                            color: #cbd5e1;
                        }

                        /* Footer */

                        footer {
                            margin-top: 70px;
                            padding: 25px;
                            text-align: center;
                            border-top: 1px solid rgba(255,255,255,0.1);
                            color: #64748b;
                        }

                        /* Responsive */

                        @media (max-width: 700px) {

                            .hero h1 {
                                font-size: 36px;
                            }

                            .pipeline {
                                flex-direction: column;
                            }

                            .arrow {
                                transform: rotate(90deg);
                            }

                            .step {
                                width: 100%;
                            }

                        }

                    </style>
                </head>

                <body>

                    <header>

                        <div class="logo">
                            DevOps<span>App</span> 🚀
                        </div>

                        <div class="status">
                            <div class="dot"></div>
                            Application Online
                        </div>

                    </header>


                    <section class="hero">

                        <h1>Spring Boot DevOps Dashboard</h1>

                        <p>
                            A complete CI/CD deployment running through
                            GoCD, Docker, Docker Hub, GitOps, ArgoCD
                            and Kubernetes.
                        </p>

                    </section>


                    <div class="container">


                        <!-- Deployment Pipeline -->

                        <div class="deployment">

                            <h2>⚡ Deployment Pipeline</h2>

                            <div class="pipeline">

                                <div class="step">
                                    <div class="step-icon">💻</div>
                                    <div class="step-title">GitHub</div>
                                </div>

                                <div class="arrow">→</div>

                                <div class="step">
                                    <div class="step-icon">🚀</div>
                                    <div class="step-title">GoCD</div>
                                </div>

                                <div class="arrow">→</div>

                                <div class="step">
                                    <div class="step-icon">🐳</div>
                                    <div class="step-title">Docker</div>
                                </div>

                                <div class="arrow">→</div>

                                <div class="step">
                                    <div class="step-icon">📦</div>
                                    <div class="step-title">Docker Hub</div>
                                </div>

                                <div class="arrow">→</div>

                                <div class="step">
                                    <div class="step-icon">🔄</div>
                                    <div class="step-title">GitOps</div>
                                </div>

                                <div class="arrow">→</div>

                                <div class="step">
                                    <div class="step-icon">⚓</div>
                                    <div class="step-title">ArgoCD</div>
                                </div>

                                <div class="arrow">→</div>

                                <div class="step">
                                    <div class="step-icon">☸️</div>
                                    <div class="step-title">Kubernetes</div>
                                </div>

                            </div>

                        </div>


                        <!-- Technologies -->

                        <h2 class="section-title">
                            🛠 Technology Stack
                        </h2>

                        <div class="cards">

                            <div class="card">

                                <div class="card-icon">☕</div>

                                <h3>Spring Boot</h3>

                                <p>
                                    Java based backend application
                                    running on port 8080.
                                </p>

                            </div>


                            <div class="card">

                                <div class="card-icon">🐳</div>

                                <h3>Docker</h3>

                                <p>
                                    Application packaged into a
                                    portable container image.
                                </p>

                            </div>


                            <div class="card">

                                <div class="card-icon">🚀</div>

                                <h3>GoCD</h3>

                                <p>
                                    Continuous integration and
                                    continuous delivery pipeline.
                                </p>

                            </div>


                            <div class="card">

                                <div class="card-icon">⚓</div>

                                <h3>ArgoCD</h3>

                                <p>
                                    GitOps continuous delivery tool
                                    managing Kubernetes deployments.
                                </p>

                            </div>


                            <div class="card">

                                <div class="card-icon">☸️</div>

                                <h3>Kubernetes</h3>

                                <p>
                                    Container orchestration platform
                                    running the application.
                                </p>

                            </div>


                            <div class="card">

                                <div class="card-icon">📦</div>

                                <h3>Docker Hub</h3>

                                <p>
                                    Container registry storing
                                    application images.
                                </p>

                            </div>

                        </div>


                        <!-- Success -->

                        <div class="success-box">

                            <h2>✅ Deployment Successful</h2>

                            <p>
                                Your Spring Boot application is running
                                successfully on Kubernetes.
                            </p>

                        </div>

                    </div>


                    <footer>

                        Spring Boot DevOps Project •
                        GoCD • Docker • GitOps • ArgoCD • Kubernetes

                    </footer>

                </body>

                </html>
                """;
    }
}
```

