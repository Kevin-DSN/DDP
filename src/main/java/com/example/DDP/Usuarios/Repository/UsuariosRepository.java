package com.example.DDP.Usuarios.Repository;

import com.example.DDP.Usuarios.Model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRepository extends CrudRepository<Usuario, Long> {

}
