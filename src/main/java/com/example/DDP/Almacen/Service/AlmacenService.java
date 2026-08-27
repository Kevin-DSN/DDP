package com.example.DDP.Almacen.Service;

import com.example.DDP.Almacen.Repository.TituloRepository;
import org.springframework.stereotype.Service;

@Service
public class AlmacenService {
    private final TituloRepository tituloRepository;

    public AlmacenService(TituloRepository tituloRepository) {
        this.tituloRepository = tituloRepository;
    }

    //Agregamos un nuevo titulo

    //Visualizamos los datos del titulo

    //Seleccionamos los datos del titulo

    //Eliminamos el titulo
    
}