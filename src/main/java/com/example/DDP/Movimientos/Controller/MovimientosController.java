package com.example.DDP.Movimientos.Controller;

import java.util.List;
import com.example.DDP.Movimientos.Service.MovimientosService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.DDP.Movimientos.DTOs.*;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/movimientos")
public class MovimientosController {

    private final MovimientosService movimientosService;

    public MovimientosController(MovimientosService movimientosService) {
        this.movimientosService = movimientosService;
    }
    //Endpoints correspondientes a los moivmientos de los clientrs-------------------------------------------------------------------
    @PutMapping("/ventacliente")
    public ResponseEntity<SelectMovClienteDTO> ventaCliente(@RequestBody @Valid InsertMovClienteDTO mov, List<InsertDetalleMovCDTO> detalle){
        SelectMovClienteDTO respuesta = movimientosService.generarVentaCliente(mov, detalle);

        return  ResponseEntity.status(HttpStatus.ACCEPTED).body(respuesta);
    }
    
    @PutMapping("/devolucioncliente")
    public ResponseEntity<SelectMovClienteDTO> devolucionCliente(@RequestBody @Valid InsertMovClienteDTO mov, List<InsertDetalleMovCDTO> detalle){
        SelectMovClienteDTO respuesta = movimientosService.generarMovimientoCliente(mov, detalle);

        return  ResponseEntity.status(HttpStatus.ACCEPTED).body(respuesta);
    }

    @GetMapping("/movimientocliente/{id}")
    public ResponseEntity<SelectMovClienteDTO> verMovimientoCliente(@PathVariable int id){
        SelectMovClienteDTO respuesta = movimientosService.verMovimientoCliente(id);

        return ResponseEntity.ok(respuesta);
    }

    @GetMapping("/detallecliente/{id}")
    public ResponseEntity<List<DetalleMovCDTO>> verDetallesClientes(@PathVariable int id){
        List<DetalleMovCDTO> respuesta = movimientosService.verDetalleMovimientoCliente(id);

        return  ResponseEntity.ok(respuesta);
    }

    //Endpoints correspondientes a los movimientos de los proveedores-------------------------------------------------------------------
    @PutMapping("/compraproveedor")
    public ResponseEntity<SelectMovProveedorDTO> compraProveedor(@RequestBody @Valid InsertMovProveedorDTO mov, List<InsertDetalleMovPDTO> detalles){
        SelectMovProveedorDTO respuesta = movimientosService.generaCompraProveedor(mov, detalles);

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(respuesta);
    }

    @PutMapping("/devolucionproveedor")
    public ResponseEntity<SelectMovProveedorDTO> devolucionProveedor(@RequestBody @Valid InsertMovProveedorDTO mov, List<InsertDetalleMovPDTO> detalles){
        SelectMovProveedorDTO respuesta = movimientosService.generaMovimientoProveedor(mov, detalles);

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(respuesta);
    }
    
    @GetMapping("/movimientoproveedor/{id}")
    public ResponseEntity<SelectMovProveedorDTO> verMovimientoProveedor(@PathVariable int id){
        SelectMovProveedorDTO respuesta = movimientosService.verMovimientoProveedor(id);

        return ResponseEntity.ok(respuesta);
    }

    @GetMapping("/detalleproveedor/{id}")
    public ResponseEntity<List<DetalleMovPDTO>> verDetalleProveedor(@PathVariable int id){
        List<DetalleMovPDTO> respuesta = movimientosService.verDetalleMovimientoProveedor(id);

        return ResponseEntity.ok(respuesta);
    }
}