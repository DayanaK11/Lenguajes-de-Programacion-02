package com.cibertec.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import com.cibertec.model.Habitacion;
import com.cibertec.services.HabitacionService;
import com.cibertec.services.ReservaService;


@Controller
@RequestMapping("/reservas")
public class ReservaController {
	

    private final HabitacionService habitacionService;
    private final ReservaService reservaService;

    // Lista para almacenar las habitaciones seleccionadas
    private List<Habitacion> habitacionesSeleccionadas = new ArrayList<>();

    @Autowired
    public ReservaController(HabitacionService habitacionService, ReservaService reservaService) {
        this.habitacionService = habitacionService;
        this.reservaService = reservaService;
    }

  

}
