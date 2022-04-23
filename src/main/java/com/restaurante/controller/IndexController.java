package com.restaurante.controller;

import com.restaurante.service.MesaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class IndexController {

    /*@Autowired
    private MesaService mesaService;*/

    @GetMapping("/")

    public String page(Model model) {
        log.info("Utilizando la Arquitectura Modelo Vista Controlador (MVC)");

        /*var mesasDB = mesaService.getMesas(true);
        model.addAttribute("mesasDB", mesasDB);*/

        return "index";
    }
}
