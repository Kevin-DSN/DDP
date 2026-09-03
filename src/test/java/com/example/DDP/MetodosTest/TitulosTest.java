package com.example.DDP.MetodosTest;

import com.example.DDP.Almacen.Service.AlmacenService;
import com.example.DDP.Usuarios.DTOs.*;

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
    public void debeCrearNuevoTitulo(){

    }

    //Testeamos la visualizacion de un titulo existente
    public void debeSeleccionarTituloExistente(){

    }

    //Testeamos la actualizacion de titulo existente
    public void debeEditarTituloExistente(){

    }

    //Testeamos la eliminacion de un titulo existente
    public void debeELiminarTituloExistente(){
        
    }
}
