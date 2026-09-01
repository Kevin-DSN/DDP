package com.example.DDP.Movimientos.Service;

import com.example.DDP.Almacen.Model.Titulo;
import com.example.DDP.Movimientos.DTOs.*;
import com.example.DDP.Movimientos.Model.DetalleMovimientoC;
import com.example.DDP.Movimientos.Model.MovimientosCliente;
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
    public SelectMovClienteDTO generarMovimientoProveedor(InsertMovClienteDTO dto, String [] Titulos){
        Cliente cliente = clienteRepository.findById(dto.getIdCliente()).orElseThrow(() -> new RuntimeException(
        "Cliente no encontrado"));
        double saldo = cliente.getSaldo();
        double nSAldo = saldo - dto.getMonto();

        MovimientosCliente mov = new MovimientosCliente(cliente, dto.getFecha(), dto.getMovimiento(), dto.getMonto(), saldo, nSAldo);
        MovimientosCliente guardado = movClientesRepository.save(mov);
        SelectMovClienteDTO respuestaDto = new SelectMovClienteDTO(dto.getIdCliente(), guardado.getFecha(), guardado.getMovimiento(),
        guardado.getMonto(), guardado.getSaldoActual(), guardado.getSaldoNuevo());
        
        //Nos quedamos en la seccion donde vamos a realizar la insercion para el detalle del movimiento
        /*int control = Titulos.length;

        for(int i = 1; i<control; i++){
            DetalleMovimientoC detalle = new DetalleMovimientoC(guardado.getIdMovimientoC(), Titulos[i]);
            DetalleMovCDTO DetalleDTO = new DetalleMovCDTO(dto.getIdCliente(), Titulos[i]);

            detalleMovCRepository.save(DetalleDTO);
        }*/

        return respuestaDto;
    }
    //Realizamos la devolucion al proveedor

    //Realizamos la venta al cliente

    //Realizamos la devolucion al cliente

}