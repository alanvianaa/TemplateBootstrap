package com.alanviana.clinica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class InicioController {
    @GetMapping("/")
    public String inicio() {
        return "index";
    }

   @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/charts")
    public String charts() {
        return "charts";
    }
}
