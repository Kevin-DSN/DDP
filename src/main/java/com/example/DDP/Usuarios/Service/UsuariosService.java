package com.example.DDP.Usuarios.Service;

import com.example.DDP.Usuarios.Repository.*;
import com.example.DDP.Usuarios.DTOs.*;
import com.example.DDP.Usuarios.Model.*;
import org.springframework.stereotype.Service;

@Service
public class UsuariosService {
    private final ClienteRepository clienteRepository;
    private final ProveedorRepository proveedorRepository;

    public UsuariosService(ClienteRepository clienteRepository, ProveedorRepository proveedorRepository) {
        this.clienteRepository = clienteRepository;
        this.proveedorRepository =proveedorRepository;
    }

    //Insertar nuevo cliente

    //Editar un cliente

    //Eliminar un cliente

    //Insertar nuevo proveedor

    //Editar un proveedor

    //Eliminar un proveedor
    
}
