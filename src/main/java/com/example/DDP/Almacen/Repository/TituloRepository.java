package com.example.DDP.Almacen.Repository;

import com.example.DDP.Almacen.Model.Titulo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TituloRepository extends CrudRepository<Titulo, Integer> {

}