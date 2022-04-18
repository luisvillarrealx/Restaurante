package com.restaurante.controller;

import com.restaurante.domain.Platillo;
import com.restaurante.service.PlatilloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
@Slf4j

public class PlatilloController {

    @Autowired
    private PlatilloService platilloService;

    @RequestMapping("/platillo/listado")
    public String inicio(Model model) {
        var platillosDB = platilloService.getPlatillos(false);
        model.addAttribute("platillosDB", platillosDB);

        return "/platillo/listado";
    }

    @GetMapping("/platillo/nuevo")
    public String nuevoPlatillo(Platillo platillo, Model model) {

        var platillosDB = platilloService.getPlatillos(true); // en ArticuloController es var _categorias_
        model.addAttribute("platillosDB", platillosDB);

        return "/platillo/modifica";
    }

    @PostMapping("/platillo/guardar")
    public String guardarPlatillo(Platillo platillo) {
        platilloService.save(platillo);
        return "redirect:/platillo/listado";
    }

    @GetMapping("/platillo/modificar/{id_platillo}") // idPlatillo
    public String modificarPlatillo(Platillo platillo, Model model) {
        var respuesta = platilloService.getPlatillo(platillo);
        //var categorias = categoriaService.getCategorias(true); categorias = entrada, plato fuerte, postre, bebida, licor

        model.addAttribute("platillo", respuesta);
        //model.addAttribute("categorias", categorias);
        return "/platillo/modifica";
    }

    @GetMapping("/platillo/eliminar/{id_platillo}")
    public String eliminarPlatillo(Platillo platillo) {
        platilloService.delete(platillo);
        return "redirect:/platillo/listado";
    }
}
