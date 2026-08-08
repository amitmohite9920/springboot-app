cd ~/springboot-app

cat > src/main/java/com/example/demo/HomeController.java <<'EOF'
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
                    <title>Spring Boot DevOps</title>

                    <style>
                        * {
                            margin: 0;
                            padding: 0;
                            box-sizing: border-box;
                        }

                        body {
                            font-family: Arial, sans-serif;
                            min-height: 100vh;
                            background: linear-gradient(135deg, #020617, #0f172a, #1d4ed8);
                            color: white;
                            display: flex;
                            justify-content: center;
                            align-items: center;
                            padding: 30px;
                        }

                        .container {
                            width: 100%;
                            max-width: 1100px;
                            background: rgba(255,255,255,0.10);
                            border: 1px solid rgba(255,255,255,0.2);
                            border-radius: 25px;
                            padding: 50px;
                            text-align: center;
                            box-shadow: 0 25px 60px rgba(0,0,0,0.4);
                        }

                        .rocket {
                            font-size: 70px;
                            margin-bottom: 15px;
                        }

                        h1 {
                            font-size: 48px;
                            margin-bottom: 15px;
                        }

                        .subtitle {
                            font-size: 20px;
                            color: #bfdbfe;
                            margin-bottom: 30px;
                        }

                        .success {
                            display: inline-block;
                            background: #16a34a;
                            padding: 14px 28px;
                            border-radius: 30px;
                            font-size: 18px;
                            font-weight: bold;
                            margin-bottom: 40px;
                            box-shadow: 0 8px 25px rgba(22,163,74,0.4);
                        }

                        .pipeline {
                            background: rgba(0,0,0,0.25);
                            border-radius: 20px;
                            padding: 30px;
                            margin-bottom: 35px;
                        }

                        .pipeline h2 {
                            font-size: 28px;
                            margin-bottom: 25px;
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
                            color: #0f172a;
                            padding: 14px 18px;
                            border-radius: 12px;
                            font-weight: bold;
                            box-shadow: 0 5px 15px rgba(0,0,0,0.25);
                        }

                        .arrow {
                            font-size: 25px;
                            color: #93c5fd;
                        }

                        .cards {
                            display: grid;
                            grid-template-columns: repeat(4, 1fr);
                            gap: 20px;
                        }

                        .card {
                            background: rgba(255,255,255,0.08);
                            border: 1px solid rgba(255,255,255,0.15);
                            border-radius: 18px;
                            padding: 25px 15px;
                            transition: 0.3s;
                        }

                        .card:hover {
                            transform: translateY(-8px);
                            background: rgba(255,255,255,0.15);
                        }

                        .icon {
                            font-size: 42px;
                            margin-bottom: 12px;
                        }

                        .card h3 {
                            margin-bottom: 10px;
                        }

                        .card p {
                            color: #bfdbfe;
                            font-size: 14px;
                            line-height: 1.5;
                        }

                        .footer {
                            margin-top: 35px;
                            color: #93c5fd;
                            font-size: 14px;
                        }

                        @media (max-width: 800px) {
                            .container {
                                padding: 30px 20px;
                            }

                            h1 {
                                font-size: 36px;
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

                            <h2>⚡ CI/CD Pipeline</h2>

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
                                <p>Application packaged into a Docker container</p>
                            </div>

                            <div class="card">
                                <div class="icon">☸️</div>
                                <h3>Kubernetes</h3>
                                <p>Application deployed and running inside pods</p>
                            </div>

                            <div class="card">
                                <div class="icon">🔄</div>
                                <h3>ArgoCD</h3>
                                <p>GitOps based continuous deployment</p>
                            </div>

                        </div>

                        <div class="footer">
                            GitHub → GoCD → Docker → Docker Hub → GitOps → ArgoCD → Kubernetes
                        </div>

                    </div>

                </body>
                </html>
                """;
    }
}
EOF
