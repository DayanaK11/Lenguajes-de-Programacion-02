package com.cibertec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.model.Reserva;
import com.cibertec.repository.ReservaRepository;

@Service
public class ReservaService {
	
	private final ReservaRepository reservaRepository;

    @Autowired
    public ReservaService(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    public List<Reserva> obtenerTodasLasReservas() {
        return reservaRepository.findAll();
    }

    public void agregarReserva(Reserva reserva) {
        reservaRepository.save(reserva);
    }

}
