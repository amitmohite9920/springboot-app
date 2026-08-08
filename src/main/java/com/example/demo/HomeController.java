cat > HomeController.java <<'EOF'
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "<html><body>"
                + "<h1>Spring Boot Application</h1>"
                + "<h2>Deployment Successful!</h2>"
                + "<p>GoCD -> Docker -> Kubernetes -> ArgoCD</p>"
                + "</body></html>";
    }
}
EOF
