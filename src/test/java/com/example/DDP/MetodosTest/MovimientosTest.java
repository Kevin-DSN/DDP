package com.example.DDP.MetodosTest;

import com.example.DDP.Movimientos.Service.MovimientosService;
import com.example.DDP.Almacen.Service.AlmacenService;
import com.example.DDP.Usuarios.Service.UsuariosService;
import com.example.DDP.Movimientos.DTOs.*;
import com.example.DDP.Usuarios.DTOs.*;
import com.example.DDP.Almacen.DTOs.*;

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
    @Autowired 
    private AlmacenService almacenService;
    @Autowired 
    private UsuariosService usuariosService;

    //Testeamos la ejecucion de compra a proveedor--------------------------------------------------------------------------------
    @Test 
    public void debeCrearCompraAProveedor(){
        LocalDate fecha = LocalDate.now();
        InsertMovProveedorDTO request = new InsertMovProveedorDTO(1, fecha,"Compra", 928.8);
        int [] id = {2,3,4};
        String [] Titulos = { "feral", "necronomicon", "la odisea"};
        int [] Cantidad = {14, 18, 24};
        double [] Precios = {40.6, 27.4, 38.7};

        SelectMovProveedorDTO save = movimientosService.generaCompraProveedor(request, id, Titulos, Cantidad, Precios);
        SelectTituloDTO r1 = almacenService.verTitulo(2);
        SelectTituloDTO r2 = almacenService.verTitulo(3);
        SelectTituloDTO r3 = almacenService.verTitulo(4);
        SelectProveedorDTO p = usuariosService.verProveedor(1);
        List<DetalleMovPDTO> detalles = movimientosService.verDetalleMovimientoProveedor(2);

        System.out.println("Proveedor: "+p.getNombre()+" con id: "+p.getId()+" y saldo: "+p.getSaldo());
        System.out.println("Realizó el movimiento: "+save.getMovimiento()+" con el monto: "+save.getMonto()+". Saldo anterior: "+save.getSaldoActual()+" y saldo nuevo: "+save.getSaldoNuevo());
        System.out.println("Se le compraron los siguientes titulos: ");
        System.out.println("Titulo: "+r1.getNombre()+" y stock: "+r1.getCantidad());
        System.out.println("Titulo: "+r2.getNombre()+" y stock: "+r2.getCantidad());
        System.out.println("Titulo: "+r3.getNombre()+" y stock: "+r3.getCantidad());
        System.out.println("-----------------------------------------------------------------------");
        System.out.println(detalles.toString());

        assertEquals("Compra", save.getMovimiento());
        assertEquals(928.8, save.getMonto());
    }
    
    //Testeamos la ejeccion de devolucion a proveedor--------------------------------------------------------------------------------
    @Test 
    public void debeCrearDevolucionAProveedor(){
        LocalDate fecha = LocalDate.now();
        InsertMovProveedorDTO request = new InsertMovProveedorDTO(1, fecha, "Devolucion", 162.4);
        int [] id = {1,2};
        String [] Titulos = {"montañas de la locura", "feral"};
        int [] Cantidad = {5, 4};
        double [] Precios = {33.5, 40.6};

        SelectMovProveedorDTO save = movimientosService.generaMovimientoProveedor(request, id, Titulos, Cantidad, Precios);
        SelectTituloDTO r1 = almacenService.verTitulo(1);
        SelectTituloDTO r2 = almacenService.verTitulo(2);
        SelectProveedorDTO p = usuariosService.verProveedor(1);

        System.out.println("Proveedor: "+p.getNombre()+" con id: "+p.getId()+" y saldo: "+p.getSaldo());
        System.out.println("Realizó el movimiento: "+save.getMovimiento()+" con el monto: "+save.getMonto()+". Saldo anterior: "+save.getSaldoActual()+" y saldo nuevo: "+save.getSaldoNuevo());
        System.out.println("Se le compraron los siguientes titulos: ");
        System.out.println("Titulo: "+r1.getNombre()+" y stock: "+r1.getCantidad());
        System.out.println("Titulo: "+r2.getNombre()+" y stock: "+r2.getCantidad());

        assertEquals("Devolucion", save.getMovimiento());
        assertEquals(162.4, save.getMonto());
    }

    //Testeamos la ejecucion de venta a cliente----------------------------------------------------------------------------------------------
    @Test 
    public void debeCrearVentaACliente(){
        LocalDate fecha = LocalDate.now();
        InsertMovClienteDTO request = new InsertMovClienteDTO(1, fecha, "Venta", 1393.2);
        int [] id = {2,3,4};
        String [] Titulos = {"feral", "necronomicon", "la odisea"};
        int [] Cantidad = {25, 20, 36};
        double [] Precios = {40.6, 27.4, 38.7};

        SelectMovClienteDTO save = movimientosService.generarVentaCliente(request, id, Titulos, Cantidad, Precios);
        SelectClienteDTO c = usuariosService.verCliente(1);
        SelectTituloDTO t1 = almacenService.verTitulo(2);
        SelectTituloDTO t2 = almacenService.verTitulo(3);
        SelectTituloDTO t3 = almacenService.verTitulo(4);
        List<DetalleMovCDTO> detalles = movimientosService.verDetalleMovimientoCliente(2);

        System.out.println("El cliente: "+c.getNombre()+" con id: "+c.getId()+" realizó el movimiento: "+save.getMovimiento());
        System.out.println("Operacion que da un total de: $"+save.getMonto());
        System.out.println("Dando su saldo anterior: "+save.getSaldoActual()+" y su saldo actual: $"+c.getSaldo());
        System.out.println("Titulo comprado: "+t1.getNombre()+" con un stock de: "+t1.getCantidad());
        System.out.println("Titulo comprado: "+t2.getNombre()+" con un stock de: "+t2.getCantidad());
        System.out.println("Titulo comprado: "+t3.getNombre()+" con un stock de: "+t3.getCantidad());
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("-------------------------------Detalle-----------------------------------");
        System.out.println(detalles.toString());

        assertEquals("Venta", save.getMovimiento());
        assertEquals(1393.2, save.getMonto());
    }

    //Testeamos la ejecucion de devolucoion a cliente---------------------------------------------------------------------------------------------
    @Test 
    public void debeCrearDevolucionACliente(){
        LocalDate fecha = LocalDate.now();
        InsertMovClienteDTO request = new InsertMovClienteDTO(1, fecha, "Devolucion", 232.2);
        int [] id = {2,3,4};
        String [] Titulos = {"feral", "necronomicon", "la odisea"};
        int [] Cantidad = {3, 2, 6};
        double [] Precios = {40.6, 27.4, 38.7};

        SelectMovClienteDTO save = movimientosService.generarMovimientoCliente(request, id, Titulos, Cantidad, Precios);
        SelectClienteDTO c = usuariosService.verCliente(1);
        SelectTituloDTO t1 = almacenService.verTitulo(2);
        SelectTituloDTO t2 = almacenService.verTitulo(3);
        SelectTituloDTO t3 = almacenService.verTitulo(4);

        System.out.println("El cliente: "+c.getNombre()+" con id: "+c.getId()+" realizó el movimiento: "+save.getMovimiento());
        System.out.println("Operacion que da un total de: $"+save.getMonto());
        System.out.println("Dando su saldo anterior: "+save.getSaldoActual()+" y su saldo actual: $"+c.getSaldo());
        System.out.println("Titulo comprado: "+t1.getNombre()+" con un stock de: "+t1.getCantidad());
        System.out.println("Titulo comprado: "+t2.getNombre()+" con un stock de: "+t2.getCantidad());
        System.out.println("Titulo comprado: "+t3.getNombre()+" con un stock de: "+t3.getCantidad());

        assertEquals("Devolucion", save.getMovimiento());
        assertEquals(232.2, save.getMonto());
    }

    //Testeamos la ejecucion de una consulta al movimiento realizado al cliente----------------------------------------------------------
    @Test 
    public void debeSeleccionarMovimientoCliente(){
        SelectMovClienteDTO dto = movimientosService.verMovimientoCliente(1);
        SelectClienteDTO c = usuariosService.verCliente(dto.getIdCliente());

        System.out.println("Datos del cliente");
        System.out.println("Nombre: "+c.getNombre()+" ID:"+c.getId()+" Saldo: "+c.getSaldo());
        System.out.println("Datos del movimiento");
        System.out.println("Movimiento: "+dto.getMovimiento()+" Fecha: "+dto.getFecha());
        System.out.println("Monto: "+dto.getMonto());

        assertNotNull(dto.getIdCliente());
    }

    //Testeamos la ejecucion de una consulta al movimiento realizado al proveedor--------------------------------------------------------------
    @Test 
    public void debeSeleccionarMovimientoProveedor(){
        SelectMovProveedorDTO dto = movimientosService.verMovimientoProveedor(1);
        SelectProveedorDTO p = usuariosService.verProveedor(dto.getIdProveedor());
        System.out.println("Datos del proveedor");
        System.out.println("Nombre proveedor: "+p.getNombre()+" ID: "+p.getId());
        System.out.println("Datos del movimiento");
        System.out.println("Movimiento: "+dto.getMovimiento()+" Fecha: "+dto.getFecha());
        System.out.println("Monto: "+dto.getMonto());

        assertNotNull(dto.getIdProveedor());
    }

    //Testeamos la ejecucion de una consulta a el detalle del movimiento realizado al cliente--------------------------------------
    @Test 
    public void debeSeleccionarDetalleMovimientoCliente(){
        List<DetalleMovCDTO> detalles = movimientosService.verDetalleMovimientoCliente(1);
        
        System.out.println("Aqui podemos observar los detalles de la operacion");
        System.out.println(detalles.toString());
        System.out.println("------------------------------------------------------------");
        assertNotNull(detalles.isEmpty());
    }

    //Testeamos la ejecucion de una consulta a el detalle del movimiento realizado al proveedor-----------------------------------
    @Test
    public void debeSeleccionarDetalleMovimientoProveedor(){
        List<DetalleMovPDTO> detalles = movimientosService.verDetalleMovimientoProveedor(1);
        System.out.println("Aqui podemos observar los detalles de la operacion");
        System.out.println(detalles.toString());
        System.out.println("------------------------------------------------------------");

        assertFalse(detalles.isEmpty());
    }
}