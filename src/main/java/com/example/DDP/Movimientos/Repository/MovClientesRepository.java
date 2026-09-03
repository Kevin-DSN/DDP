package com.example.DDP.Movimientos.Repository;

import com.example.DDP.Movimientos.Model.MovimientosCliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovClientesRepository extends CrudRepository<MovimientosCliente, Integer> {

}