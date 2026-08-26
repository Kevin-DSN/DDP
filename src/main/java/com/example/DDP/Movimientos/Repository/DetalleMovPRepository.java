package com.example.DDP.Movimientos.Repository;

import com.example.DDP.Movimientos.Model.DetalleMovimientoP;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleMovPRepository extends CrudRepository <DetalleMovimientoP, Long>{

}