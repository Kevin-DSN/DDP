package com.example.DDP.Usuarios.Service;

import com.example.DDP.Usuarios.Repository.UsuariosRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuariosService {
    private final UsuariosRepository usuariosRepository;

    public UsuariosService(UsuariosRepository usuariosRepository) {
        this.usuariosRepository = usuariosRepository;
    }
}
