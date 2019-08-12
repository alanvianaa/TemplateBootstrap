package com.alanviana.clinica.controller;

import com.alanviana.clinica.model.Cadastro;
import com.alanviana.clinica.repository.Cadastros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class InicioController {

    @Autowired //injetar o repositório no controller
    private Cadastros cadastros;


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


    @GetMapping("/cadastro")
    public ModelAndView listar(){

        ModelAndView modelAndView = new ModelAndView("cadastro");
        modelAndView.addObject("cadastros",cadastros.findAll());

        modelAndView.addObject(new Cadastro());

        return modelAndView;
    }

    @PostMapping("/cadastro")
    public String salvar(Cadastro cadastro) {
        this.cadastros.save(cadastro);
        return "redirect:/cadastros";
    }


}
