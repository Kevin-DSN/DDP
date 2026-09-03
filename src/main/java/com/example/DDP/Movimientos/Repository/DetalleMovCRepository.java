package com.example.DDP.Movimientos.Repository;

import com.example.DDP.Movimientos.Model.DetalleMovimientoC;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface DetalleMovCRepository extends CrudRepository<DetalleMovimientoC, Integer>{
    List<DetalleMovimientoC> findBymovimientosClienteId(Integer idMovimiento);
}