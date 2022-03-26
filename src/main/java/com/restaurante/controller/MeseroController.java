package com.restaurante.controller;

import com.restaurante.domain.Mesero;
import com.restaurante.service.MeseroService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
@Slf4j
public class MeseroController {

    @Autowired
    private MeseroService meseroService;

    @GetMapping("/mesero/listado")
    public String page(Model model) {

        var meserosDB = meseroService.getMeseros(false);
        model.addAttribute("meserosDB", meserosDB);

        return "/mesero/listado";
    }

    @GetMapping("/mesero/nuevo")
    public String nuevoMesero(Mesero mesero) {
        return "/mesero/modifica";
    }

    @PostMapping("/mesero/guardar")
    public String guardarMesero(Mesero mesero) {
        meseroService.save(mesero);
        return "redirect:/mesero/listado";
    }

    @GetMapping("/mesero/modificar/{id_mesero}")
    public String modificarMesero(Mesero mesero, Model model) {
        var respuesta = meseroService.getMesero(mesero);
        model.addAttribute("mesero", respuesta);
        return "/mesero/modifica";
    }

    @GetMapping("/mesero/eliminar/{id_mesero}")
    public String eliminarMesero(Mesero mesero) {
        meseroService.delete(mesero);
        return "redirect:/mesero/listado";
    }
}
