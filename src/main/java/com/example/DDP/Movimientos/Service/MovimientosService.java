package com.example.DDP.Movimientos.Service;

//import com.example.DDP.Almacen.Model.Titulo;
import com.example.DDP.Movimientos.DTOs.*;
import com.example.DDP.Movimientos.Model.*;
import com.example.DDP.Movimientos.Repository.*;
import com.example.DDP.Usuarios.Model.*;
import com.example.DDP.Usuarios.Repository.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.List;

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

    //Realizamos el movimiento al cliente-----------------------------------------------------------------------------------------------------
    @Transactional
    public SelectMovClienteDTO generarMovimientoCliente(InsertMovClienteDTO dto, String [] Titulos, int [] Cantidad, double [] Precio){
        Cliente cliente = clienteRepository.findById(dto.getIdCliente()).orElseThrow(() -> new RuntimeException(
        "Cliente no encontrado"));

        double saldo = cliente.getSaldo();
        double nSAldo = saldo - dto.getMonto();

        MovimientosCliente mov = new MovimientosCliente(cliente, dto.getFecha(), dto.getMovimiento(), dto.getMonto(), saldo, nSAldo);
        
        int control = Titulos.length;
        for(int i = 0; i<control; i++){
            DetalleMovimientoC detalle = new DetalleMovimientoC(Titulos[i], Cantidad[i], Precio[i]);
            mov.addDetalle(detalle);
        }

        MovimientosCliente guardado = movClientesRepository.save(mov);

        SelectMovClienteDTO respuestaDto = new SelectMovClienteDTO(dto.getIdCliente(), guardado.getFecha(), guardado.getMovimiento(),
        guardado.getMonto(), guardado.getSaldoActual(), guardado.getSaldoNuevo());
        
        return respuestaDto;
    }

    //Realizamos el movimiento del provedor--------------------------------------------------------------------------------------------
    @Transactional
    public SelectMovProveedorDTO generaMovimientoProveedor(InsertMovProveedorDTO dto, String [] Titulos, int [] Cantidad, double [] Precio){
        Proveedor proveedor = proveedorRepository.findById(dto.getIdProveedor()).orElseThrow(() -> new RuntimeException(
        "Cliente no encontrado"));

        double saldo = proveedor.getSaldo();
        double nSaldo = saldo - dto.getMonto();

        MovimientosProveedor mov = new MovimientosProveedor(proveedor, dto.getFecha(), dto.getMovimiento(), dto.getMonto(), saldo, nSaldo);
        
        int control = Titulos.length;
        for(int i = 0; i<control; i++){
            DetalleMovimientoP detalle = new DetalleMovimientoP(Titulos[i], Cantidad[i], Precio[i]);
            mov.addDetalle(detalle);
        }

        MovimientosProveedor guardado = movProveedorRepository.save(mov);

        SelectMovProveedorDTO respuestaDTO = new SelectMovProveedorDTO(dto.getIdProveedor(), guardado.getFecha(), guardado.getMovimiento(),
        guardado.getMonto(), guardado.getSaldoActual(), guardado.getSaldoNuevo());

        return respuestaDTO;
    }

    //Seleccionamos el movimiento del cliente------------------------------------------------------------------------------------------
    public SelectMovClienteDTO verMovimientoCliente(int idV){
        MovimientosCliente consulta = movClientesRepository.findById(idV).orElseThrow(() -> new RuntimeException(
        "Movimiento no encontrado"));

        SelectMovClienteDTO respuesta = new SelectMovClienteDTO(idV, consulta.getFecha(), consulta.getMovimiento(), 
        consulta.getMonto(), consulta.getSaldoActual(), consulta.getSaldoNuevo());

        return respuesta;

    }

    //Seleccionamos el movimiento del proveedor---------------------------------------------------------------------------------------
    public SelectMovProveedorDTO verMovimientoProveedor(int id){
        MovimientosProveedor consulta = movProveedorRepository.findById(id).orElseThrow(() -> new RuntimeException(
        "Movimiento no encontrado"));

        SelectMovProveedorDTO respuesta = new SelectMovProveedorDTO(id, consulta.getFecha(), consulta.getMovimiento(), 
        consulta.getMonto(), consulta.getSaldoActual(), consulta.getSaldoNuevo());

        return respuesta;
    }

    //Verficamos detalles del movimiento del cliente (ticket)-------------------------------------------------------------------------
    public List<DetalleMovCDTO> verDetalleMovimientoCliente(int id){
        List<DetalleMovimientoC> detalles = detalleMovCRepository.findBymovimientosClienteId(id);

        List<DetalleMovCDTO> respuesta = new ArrayList<>();

        for(DetalleMovimientoC detalle: detalles){
            respuesta.add(new DetalleMovCDTO(detalle.getId(), id, detalle.getProducto(), 
            detalle.getCantidad(), detalle.getPrecio()));
        }

        return respuesta;
    }
    
    //Verificamos detalles del movimiento del proveedor (ticket)------------------------------------------------------------------
    public List<DetalleMovPDTO> verDetalleMovimientoProveedor(int id){
        List<DetalleMovimientoP> detalles = detalleMovPRepository.findByMovimientosProveedorId(id);

        List<DetalleMovPDTO> respuesta = new ArrayList<>();

        for(DetalleMovimientoP detalle : detalles){
            respuesta.add(new DetalleMovPDTO(detalle.getId(), id, detalle.getProducto(), 
            detalle.getCantidad(), detalle.getPrecio()));
        }

        return respuesta;
    }
}