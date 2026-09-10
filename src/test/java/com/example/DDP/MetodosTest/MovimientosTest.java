package com.example.DDP.MetodosTest;

import com.example.DDP.Movimientos.Service.MovimientosService;
import com.example.DDP.Movimientos.DTOs.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import jakarta.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@SpringBootTest
@ActiveProfiles("test")
@Transactional
public class MovimientosTest {
    
    @Autowired
    private MovimientosService movimientosService;

    //Testeamos la ejecucion de compra a proveedor
    @Test 
    public void debeCrearCompraAProveedor(){
        LocalDate fecha = LocalDate.now();
        InsertMovProveedorDTO request = new InsertMovProveedorDTO(1, fecha,"Compra", 1822);
        int [] id = {1,2,3,4};
        String [] Titulos = {"Batman", "Tu", "NatGeo", "Spiderman"};
        int [] Cantidad = {30, 25, 20, 36};
        double [] Precios = {14.5, 15.3, 20, 16.8};

        SelectMovProveedorDTO save = movimientosService.generaCompraProveedor(request, id, Titulos, Cantidad, Precios);
        assertEquals("Compra", save.getMovimiento());
        assertEquals(1822, save.getMonto());
    }
    
    //Testeamos la ejeccion de devolucion a proveedor
    @Test 
    public void debeCrearDevolucionAProveedor(){
        LocalDate fecha = LocalDate.now();
        InsertMovProveedorDTO request = new InsertMovProveedorDTO(1, fecha, "Devolucion", 133);
        int [] id = {1,2};
        String [] Titulos = {"Batman", "Tu"};
        int [] Cantidad = {5, 4};
        double [] Precios = {14.5, 15.3};

        SelectMovProveedorDTO save = movimientosService.generaMovimientoProveedor(request, id, Titulos, Cantidad, Precios);
        assertEquals("Devolucion", save.getMovimiento());
        assertEquals(133, save.getMonto());
    }

    //Testeamos la ejecucion de venta a cliente
    @Test 
    public void debeCrearVentaACliente(){
        LocalDate fecha = LocalDate.now();
        InsertMovClienteDTO request = new InsertMovClienteDTO(1, fecha, "Venta", 1387);
        int [] id = {2,3,4};
        String [] Titulos = {"Tu", "NatGeo", "Spiderman"};
        int [] Cantidad = {25, 20, 36};
        double [] Precios = {15.3, 20, 16.8};

        SelectMovClienteDTO save = movimientosService.generarVentaCliente(request, id, Titulos, Cantidad, Precios);
        assertEquals("Venta", save.getMovimiento());
        assertEquals(1387, save.getMonto());
    }

    //Testeamos la ejecucion de devoluciion a cliente
    @Test 
    public void debeCrearDevolucionACliente(){
        LocalDate fecha = LocalDate.now();
        InsertMovClienteDTO request = new InsertMovClienteDTO(1, fecha, "Devolucion", 186);
        int [] id = {2,3,4};
        String [] Titulos = {"Tu", "NatGeo", "Spiderman"};
        int [] Cantidad = {3, 2, 6};
        double [] Precios = {15.3, 20, 16.8};

        SelectMovClienteDTO save = movimientosService.generarMovimientoCliente(request, id, Titulos, Cantidad, Precios);
        assertEquals("Devolucion", save.getMovimiento());
        assertEquals(186, save.getMonto());
    }

    //Testeamos la ejecucion de una consulta al movimiento realizado al cliente
    @Test 
    public void debeSeleccionarMovimientoCliente(){
        SelectMovClienteDTO dto = movimientosService.verMovimientoCliente(1);

        assertNotNull(dto.getIdCliente());
    }

    //Testeamos la ejecucion de una consulta al movimiento realizado al proveedor
    @Test 
    public void debeSeleccionarMovimientoProveedor(){
        SelectMovProveedorDTO dto = movimientosService.verMovimientoProveedor(2);

        assertNotNull(dto.getIdProveedor());
    }

    //Testeamos la ejecucion de una consulta a el detalle del movimiento realizado al cliente
    @Test 
    public void debeSeleccionarDetalleMovimientoCliente(){
        List<DetalleMovCDTO> detalles = movimientosService.verDetalleMovimientoCliente(1);
        
        assertNotNull(detalles.isEmpty());
    }

    //Testeamos la ejecucion de una consulta a el detalle del movimiento realizado al proveedor
    @Test
    public void debeSeleccionarDetalleMovimientoProveedor(){
        List<DetalleMovPDTO> detalles = movimientosService.verDetalleMovimientoProveedor(2);
        
        assertFalse(detalles.isEmpty());
    }
}
