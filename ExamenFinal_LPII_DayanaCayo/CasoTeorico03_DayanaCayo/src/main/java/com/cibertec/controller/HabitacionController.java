package com.cibertec.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cibertec.services.HabitacionService;
import com.cibertec.model.*;

@Controller
public class HabitacionController {
	
	private final HabitacionService habitacionService;

    @Autowired
    public HabitacionController(HabitacionService habitacionService) {
        this.habitacionService = habitacionService;
    }

    @GetMapping("/catalogo")
    public String mostrarCatalogo(Model model) {
        List<Habitacion> habitaciones = habitacionService.obtenerTodasLasHabitaciones();
        model.addAttribute("habitaciones", habitaciones);
        return "catalogo";
    }
    @GetMapping("/habitacion/{id}")
    public String mostrarDetalleHabitacion(@PathVariable Long id, Model model) {
        Optional<Habitacion> habitacion = habitacionService.obtenerHabitacionPorId(id);

        if (habitacion != null) {
            model.addAttribute("habitacion", habitacion);
            return "detalleHabitacion";  // Crea un nuevo template "detalleHabitacion.html"
        } else {
            // Manejar el caso en el que la habitación no se encuentra
            return "redirect:/catalogo";  // Redirigir al catálogo u otra página
        }
    }
	

}