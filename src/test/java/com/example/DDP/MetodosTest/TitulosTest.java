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
        InsertTituloDTO dto = new InsertTituloDTO("The Flash", 49, 1);
        SelectTituloDTO save = almacenService.crearTitulo(dto);

        assertNotNull(save.getId());
        assertEquals(1, save.getId());
        assertEquals("The Flash", save.getNombre());
        assertEquals(49, save.getPrecio());
    }

    @Test 
    //Testeamos la visualizacion de un titulo existente
    public void debeSeleccionarTituloExistente(){
        int id = 1;
        SelectTituloDTO select = almacenService.verTitulo(id);

        assertEquals(1, select.getId());
    }

    //Testeamos la actualizacion de titulo existente
    @Test 
    public void debeEditarTituloExistente(){
        UpdateTituloDTO update = new UpdateTituloDTO(1, "Flash Rebirth", 45);
        SelectTituloDTO save = almacenService.actualizaTitulo(update);

        assertEquals("Flash Rebirth", save.getNombre());
        assertEquals(45, save.getPrecio());
    }

    //Testeamos la eliminacion de un titulo existente
    @Test 
    public void debeELiminarTituloExistente(){
        int id = 1;
        almacenService.eliminarTiutlo(id);
    }
}
