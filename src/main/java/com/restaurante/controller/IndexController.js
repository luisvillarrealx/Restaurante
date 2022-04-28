/*package com.restaurante.controller;

import com.restaurante.service.MesaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class IndexController {

    @GetMapping("/")

    public String page(Model model) {
        log.info("Utilizando la Arquitectura Modelo Vista Controlador (MVC)");

        return "index";
    }
}*/

const express = require('express');
const router = express.Router();

module.exports = function() {
    router.get('/', (res) => {
        res.send('index1');
    });
    return router;
};