package com.example.DDP.Movimientos.Repository;

import com.example.DDP.Movimientos.Model.DetalleMovimientoP;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface DetalleMovPRepository extends CrudRepository <DetalleMovimientoP, Integer>{
    List<DetalleMovimientoP> findByMovimientosProveedorId(Integer idMovimiento);
}