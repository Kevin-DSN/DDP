package com.example.DDP.Usuarios.Controller;

import com.example.DDP.Usuarios.DTOs.*;
import com.example.DDP.Usuarios.Service.UsuariosService;
import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {
    
    private final UsuariosService usuariosService;

    public UsuariosController(UsuariosService usuariosService) {
        this.usuariosService = usuariosService;
    }

    //Endpoints de los clientes--------------------------------------------------------------------------------------------------------------
    @PostMapping("/cliente")
    public ResponseEntity<SelectClienteDTO> nuevoCliente(@RequestBody @Valid  InsertClienteDTO dto){
        SelectClienteDTO respuesta = usuariosService.crearCliente(dto); 

        return ResponseEntity.status(HttpStatus.CREATED).body(respuesta);
    }
    
    @GetMapping("/cliente/{id}")
    public ResponseEntity<SelectClienteDTO> verCliente(@PathVariable  int id){
        SelectClienteDTO respuesta = usuariosService.verCliente(id);

        return ResponseEntity.ok(respuesta);
    }

    @PutMapping("/cliente/{id}")
    public ResponseEntity<SelectClienteDTO> editarCliente(@PathVariable int id, @RequestBody @Valid UpdateClienteDTO dto){
        SelectClienteDTO respuesta = usuariosService.editarCliente(dto);

        return ResponseEntity.ok(respuesta);
    }

    @DeleteMapping("/cliente/{id}")
    public ResponseEntity<Void> eliminarCliente(@PathVariable int id){
        usuariosService.eliminarCliente(id);

        return ResponseEntity.noContent().build();
    }

    //Endpoints de los proveedores-----------------------------------------------------------------------------------------------------------
    @PostMapping("/proveedor")
    public ResponseEntity<SelectProveedorDTO> nuevoProveedoor(@RequestBody @Valid InsertProveedorDTO dto){
        SelectProveedorDTO respuesta = usuariosService.crearProveedor(dto);

        return ResponseEntity.status(HttpStatus.CREATED).body(respuesta);
    }

    @GetMapping("/proveedor/ver/{id}")
    public ResponseEntity<SelectProveedorDTO> verProveedor(@PathVariable int id){
        SelectProveedorDTO respuesta = usuariosService.verProveedor(id);

        return ResponseEntity.ok(respuesta);
    }

    @PutMapping("/proveedor/editar/{id}")
    public ResponseEntity<SelectProveedorDTO> editarProveedor(@PathVariable int id, @RequestBody @Valid UpdateProveedorDTO dto){
        SelectProveedorDTO respuesta = usuariosService.editarProveedor(dto);

        return  ResponseEntity.ok(respuesta);
    }

    @DeleteMapping("/proveedor/eliminar/{id}")
    public ResponseEntity<Void> eliminarProveedor(@PathVariable  int id){
        usuariosService.eliminarProveedor(id);

        return  ResponseEntity.noContent().build();
    }
}