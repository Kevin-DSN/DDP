package com.example.DDP.MetodosTest;

import com.example.DDP.Movimientos.Service.MovimientosService;
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
public class MovimientosTest {
    
    @Autowired
    private MovimientosService movimientosService;

    //Testeamos la ejecucion de compra a proveedor

    //Testeamos la ejeccion de devolucion a proveedor

    //Testeamos la ejecucion de venta a cliente

    //Testeamos la ejecucion de devolucion a proveedor
}
