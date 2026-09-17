package com.example.DDP.Almacen.Controller;

import com.example.DDP.Almacen.Service.AlmacenService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.DDP.Almacen.DTOs.*;
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
@RequestMapping("/almacen")
public class AlmacenController {

    private final AlmacenService almacenService;

    public AlmacenController(AlmacenService almacenService) {
        this.almacenService = almacenService;
    }

    @PostMapping
    public ResponseEntity<SelectTituloDTO> crearTitulo(@Valid @RequestBody InsertTituloDTO dto){
        SelectTituloDTO respuesta = almacenService.crearTitulo(dto);

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(respuesta);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SelectTituloDTO> verTitulo(@PathVariable int id){
        SelectTituloDTO respuesta = almacenService.verTitulo(id);

        return ResponseEntity.ok(respuesta);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SelectTituloDTO> editarTitulo(@PathVariable int id, @Valid @RequestBody UpdateTituloDTO dto){
        SelectTituloDTO respuesta = almacenService.actualizaTitulo(dto);

        return ResponseEntity.ok(respuesta);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarTitulo(@PathVariable int id){
        almacenService.eliminarTiutlo(id);

        return ResponseEntity.noContent().build();
    }
}