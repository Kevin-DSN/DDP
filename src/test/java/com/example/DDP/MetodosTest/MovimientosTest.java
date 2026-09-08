package com.example.DDP.MetodosTest;

import com.example.DDP.Movimientos.Service.MovimientosService;
import com.example.DDP.Movimientos.DTOs.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import jakarta.transaction.Transactional;
import java.time.LocalDate;

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
        InsertMovProveedorDTO request = new InsertMovProveedorDTO(1, fecha,"Compra", 680);
        int [] id = {1,2,3,4};
        String [] Titulos = {"Batman", "Tu", "NatGeo", "Spiderman"};
        int [] Cantidad = {30, 25, 20, 36};
        double [] Precios = {14.5, 15.3, 20, 16.8};

        SelectMovProveedorDTO save = movimientosService.generaCompraProveedor(request, id, Titulos, Cantidad, Precios);
    }
    
    //Testeamos la ejeccion de devolucion a proveedor
    @Test 
    public void debeCrearDevolucionAProveedor(){

    }

    //Testeamos la ejecucion de venta a cliente
    @Test 
    public void debeCrearVentaACliente(){

    }

    //Testeamos la ejecucion de devoluciion a cliente
    @Test 
    public void debeCrearDevolucionACliente(){

    }

    //Testeamos la ejecucion de una consulta al movimiento realizado al cliente
    @Test 
    public void debeSeleccionarMovimientoCliente(){

    }

    //Testeamos la ejecucion de una consulta al movimiento realizado al proveedor
    @Test 
    public void debeSeleccionarMovimientoProveedor(){

    }

    //Testeamos la ejecucion de una consulta a el detalle del movimiento realizado al cliente
    @Test 
    public void debeSeleccionarDetalleMovimientoCliente(){

    }

    //Testeamos la ejecucion de una consulta a el detalle del movimiento realizado al proveedor
    @Test
    public void debeSeleccionarDetalleMovimientoProveedor(){

    }
}
