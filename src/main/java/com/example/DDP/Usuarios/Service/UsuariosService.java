package com.example.DDP.Usuarios.Service;

import com.example.DDP.Usuarios.Repository.ClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuariosService {
    private final ClienteRepository clienteRepository;

    public UsuariosService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
}
