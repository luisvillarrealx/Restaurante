package com.restaurante.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class ContactoController {

    @RequestMapping("/contacto/contacto")
    public String inicio(Model model) {

        return "/contacto/contacto";
    }

}
