package com.example.DDP.Movimientos.Service;

import com.example.DDP.Movimientos.Repository.MovClientesRepository;
import org.springframework.stereotype.Service;

@Service
public class MovimientosService {
    private final MovClientesRepository movClientesRepository;

    public MovimientosService(MovClientesRepository movClientesRepository) {
        this.movClientesRepository = movClientesRepository;
    }
}