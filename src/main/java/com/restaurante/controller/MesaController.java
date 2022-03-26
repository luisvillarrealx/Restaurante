package com.restaurante.controller;

import com.tienda.domain.Mesa;
import com.tienda.service.MesaService;
//import com.tienda.service.CategoriaService; en mesa
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
@Slf4j
public class MesaController {

    @Autowired
    private MesaService mesaService;

    @RequestMapping("/mesa/listado")
    public String inicio(Model model) {

        var mesasDB = mesaService.getMesas(false);
        model.addAttribute("mesasDB", mesasDB);

        return "/mesa/listado";
    }

    @GetMapping("/mesa/nuevo")
    public String nuevoMesa(Mesa mesa, Model model) {

        var mesas = categoriaService.getCategorias(true);  //.getMesas
        model.addAttribute("mesas", mesas);

        return "/mesa/modifica";
    }

    @PostMapping("/mesa/guardar")
    public String guardarMesa(Mesa mesa) {
        mesaService.save(mesa);
        return "redirect:/mesa/listado";
    }

    @GetMapping("/mesa/modificar/{id_mesa}") // idMesa
    public String modificarMesa(Mesa mesa, Model model) {
        var respuesta = mesaService.getMesa(mesa);
        var mesas = mesaService.getMesas(true);
        //Mesa respuesta = mesaService.getMesa(mesa);
        model.addAttribute("mesa", respuesta);
        model.addAttribute("mesas", mesas);
        return "/mesa/modifica";
    }

    @GetMapping("/mesa/eliminar/{id_mesa}")
    public String eliminarMesa(Mesa mesa) {
        mesaService.delete(mesa);
        return "redirect:/mesa/listado";
    }
}
