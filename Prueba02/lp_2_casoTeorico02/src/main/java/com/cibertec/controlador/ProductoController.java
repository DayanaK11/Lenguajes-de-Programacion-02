package com.cibertec.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.cibertec.interfaces.InterfacesProducto;
import com.cibertec.modelos.Producto;
@Controller
public class ProductoController {
    @Autowired
    private InterfacesProducto productoRepository;

    @GetMapping("/productos")
    public String mostrarCatalogo(Model model) {
        List<Producto> productos = productoRepository.findAll();
        model.addAttribute("productos", productos);
        return "catalogo";
    }
}
