package com.example.DDP.Movimientos.Service;

import com.example.DDP.Movimientos.Repository.*;
import org.springframework.stereotype.Service;

@Service
public class MovimientosService {
    private final MovClientesRepository movClientesRepository;
    private final MovProveedorRepository movProveedorRepository;
    private final DetalleMovCRepository detalleMovCRepository;
    private final DetalleMovPRepository detalleMovPRepository;

    public MovimientosService(MovClientesRepository movClientesRepository, 
        MovProveedorRepository movProveedorRepository, 
        DetalleMovCRepository detalleMovCRepository, 
        DetalleMovPRepository detalleMovPRepository) {
        this.movClientesRepository = movClientesRepository;
        this.movProveedorRepository = movProveedorRepository;
        this.detalleMovCRepository = detalleMovCRepository;
        this.detalleMovPRepository = detalleMovPRepository;
    }
}