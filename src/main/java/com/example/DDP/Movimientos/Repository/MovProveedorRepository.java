package com.example.DDP.Movimientos.Repository;

import com.example.DDP.Movimientos.Model.MovimientosProveedor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovProveedorRepository extends CrudRepository<MovimientosProveedor, Long> {

}