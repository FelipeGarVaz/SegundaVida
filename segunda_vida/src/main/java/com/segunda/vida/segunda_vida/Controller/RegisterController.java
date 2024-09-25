package com.segunda.vida.segunda_vida.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterController {

    @GetMapping("/register")
    public String showRegisterPage() {
        return "register"; // Deberías crear un archivo `register.html` similar al de login
    }
}
