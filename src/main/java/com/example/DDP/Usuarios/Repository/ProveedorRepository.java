package com.example.DDP.Usuarios.Repository;

import com.example.DDP.Usuarios.Model.Proveedor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepository extends CrudRepository<Proveedor, Long> {

}
