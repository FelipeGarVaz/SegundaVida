package com.segunda.vida.segunda_vida.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PasswordResetController {

    @GetMapping("/forgot-password")
    public String showForgotPasswordPage() {
        return "forgot-password"; // Archivo `forgot-password.html` para la recuperación
    }
}
