package com.example.DDP.MetodosTest;

import com.example.DDP.Almacen.Service.AlmacenService;
import com.example.DDP.Almacen.DTOs.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import jakarta.transaction.Transactional;

@SpringBootTest
@ActiveProfiles("test")
@Transactional
public class TitulosTest {

    @Autowired
    private AlmacenService almacenService;

    //Testeamos la insercion de un titulo
    @Test 
    public void debeCrearNuevoTitulo(){
        InsertTituloDTO dto = new InsertTituloDTO("The Flash", 49.99, 1);
        SelectTituloDTO save = almacenService.crearTitulo(dto);

        System.out.println("Titulo registrado: "+save.getId()+", "+save.getNombre()+", "+save.getPrecio()+", "
        +save.getCantidad()+". Pertenece al proveedor: "+save.getIdProveedor());
        assertNotNull(save.getId());
        assertEquals(6, save.getId());
        assertEquals("The Flash", save.getNombre());
        assertEquals(49.99, save.getPrecio());
    }

    @Test 
    //Testeamos la visualizacion de un titulo existente
    public void debeSeleccionarTituloExistente(){
        int id = 1;
        SelectTituloDTO save = almacenService.verTitulo(id);

        System.out.println("Titulo seleccionado: "+save.getId()+", "+save.getNombre()+", "+save.getPrecio()+", "
        +save.getCantidad()+". Pertenece al proveedor: "+save.getIdProveedor());

        assertEquals(1, save.getId());
    }

    //Testeamos la actualizacion de titulo existente
    @Test 
    public void debeEditarTituloExistente(){
        UpdateTituloDTO update = new UpdateTituloDTO(1, "Crazy Mountains", 45);
        SelectTituloDTO save = almacenService.actualizaTitulo(update);

        System.out.println("Titulo editado: "+save.getId()+", "+save.getNombre()+", "+save.getPrecio()+", "
        +save.getCantidad()+". Pertenece al proveedor: "+save.getIdProveedor());

        assertEquals("Crazy Mountains", save.getNombre());
        assertEquals(45, save.getPrecio());
    }

    //Testeamos la eliminacion de un titulo existente
    @Test 
    public void debeELiminarTituloExistente(){
        int id = 5;
        almacenService.eliminarTiutlo(id);
    }
}
