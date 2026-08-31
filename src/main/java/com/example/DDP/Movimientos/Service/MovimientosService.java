package com.example.DDP.Movimientos.Service;

import com.example.DDP.Movimientos.DTOs.*;
import com.example.DDP.Movimientos.Repository.*;
import com.example.DDP.Usuarios.Model.*;
import com.example.DDP.Usuarios.Repository.*;
import org.springframework.stereotype.Service;

@Service
public class MovimientosService {
    private final MovClientesRepository movClientesRepository;
    private final MovProveedorRepository movProveedorRepository;
    private final DetalleMovCRepository detalleMovCRepository;
    private final DetalleMovPRepository detalleMovPRepository;
    private final ClienteRepository clienteRepository;
    private final ProveedorRepository proveedorRepository;

    public MovimientosService(MovClientesRepository movClientesRepository, 
        MovProveedorRepository movProveedorRepository, 
        DetalleMovCRepository detalleMovCRepository, 
        DetalleMovPRepository detalleMovPRepository,
        ProveedorRepository proveedorRepository,
        ClienteRepository clienteRepository) {
        this.movClientesRepository = movClientesRepository;
        this.movProveedorRepository = movProveedorRepository;
        this.detalleMovCRepository = detalleMovCRepository;
        this.detalleMovPRepository = detalleMovPRepository;
        this.clienteRepository = clienteRepository;
        this.proveedorRepository = proveedorRepository;
    }

    //Realizamos la compra al proveedor
    /*public SelectMovProveedorDTO generarMovimientoProveedor(InsertMovClienteDTO dto){
        
    }*/
    //Realizamos la devolucion al proveedor

    //Realizamos la venta al cliente

    //Realizamos la devolucion al cliente

}