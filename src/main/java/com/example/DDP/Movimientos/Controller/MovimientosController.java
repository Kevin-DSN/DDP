package com.example.DDP.Movimientos.Controller;

import com.example.DDP.Movimientos.Service.MovimientosService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.DDP.Movimientos.DTOs.*;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/movimientos")
public class MovimientosController {

    private final MovimientosService movimientosService;

    public MovimientosController(MovimientosService movimientosService) {
        this.movimientosService = movimientosService;
    }

}