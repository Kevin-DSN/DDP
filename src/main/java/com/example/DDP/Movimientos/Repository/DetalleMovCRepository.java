package com.example.DDP.Movimientos.Repository;

import com.example.DDP.Movimientos.Model.DetalleMovimientoC;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleMovCRepository extends CrudRepository<DetalleMovimientoC, Long>{

}