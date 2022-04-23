package com.restaurante.controller;

import com.restaurante.domain.Proveedor;
import com.restaurante.service.ProveedorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
@Slf4j

public class ProveedorController {

    @Autowired
    private ProveedorService proveedorService;

    @RequestMapping("/proveedor/listado")
    public String inicio(Model model) {
        var proveedoresDB = proveedorService.getProveedores();
        model.addAttribute("proveedoresDB", proveedoresDB);

        return "/proveedor/listado";
    }

    @GetMapping("/proveedor/nuevo")
    public String nuevoProveedor(Proveedor proveedor, Model model) {

        var proveedoresDB = proveedorService.getProveedores();
        model.addAttribute("proveedoresDB", proveedoresDB);

        return "/proveedor/modifica";
    }

    @PostMapping("/proveedor/guardar")
    public String guardarProveedor(Proveedor proveedor) {
        proveedorService.save(proveedor);
        return "redirect:/proveedor/listado";
    }

    @GetMapping("/proveedor/modificar/{id_proveedor}") // idProveedor
    public String modificarProveedor(Proveedor proveedor, Model model) {
        var respuesta = proveedorService.getProveedor(proveedor);
        //var categorias = categoriaService.getCategorias(true); categorias = entrada, plato fuerte, postre, bebida, licor

        model.addAttribute("proveedor", respuesta);
        //model.addAttribute("categorias", categorias);
        return "/proveedor/modifica";
    }

    @GetMapping("/proveedor/eliminar/{id_proveedor}")
    public String eliminarProveedor(Proveedor proveedor) {
        proveedorService.delete(proveedor);
        return "redirect:/proveedor/listado";
    }
}
