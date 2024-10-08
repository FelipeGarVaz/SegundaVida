package com.segunda.vida.segunda_vida.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model) {
        // Lógica de autenticación
        boolean isAuthenticated = authenticateUser(username, password);

        if (isAuthenticated) {
            return "redirect:/home"; // Redirige a la página principal si es exitoso
        } else {
            model.addAttribute("error", "Usuario o contraseña incorrectos");
            return "login"; // Devuelve a la página de login si hay error
        }
    }

    private boolean authenticateUser(String username, String password) {
        // Aquí iría la lógica para verificar el usuario y contraseña
        return username.equals("admin") && password.equals("admin"); // Ejemplo de validación
    }
}