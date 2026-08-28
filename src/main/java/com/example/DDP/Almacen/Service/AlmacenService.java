package com.example.DDP.Almacen.Service;

import com.example.DDP.Almacen.Repository.TituloRepository;
import com.example.DDP.Usuarios.Repository.ProveedorRepository;
import com.example.DDP.Usuarios.Model.Proveedor;
import com.example.DDP.Almacen.Model.Titulo;
import com.example.DDP.Almacen.DTOs.*;
import org.springframework.stereotype.Service;

@Service
public class AlmacenService {
    private final TituloRepository tituloRepository;
    private final ProveedorRepository proveedorRepository;

    public AlmacenService(TituloRepository tituloRepository, ProveedorRepository proveedorRepository) {
        this.tituloRepository = tituloRepository;
        this.proveedorRepository = proveedorRepository;
    }

    //Agregamos un nuevo titulo---------------------------------------------------------------------------------------------------
    public SelectTituloDTO crearTitulo(InsertTituloDTO dto){
        Proveedor id = proveedorRepository.findById(dto.getIdProveedor()).orElseThrow(() -> new RuntimeException(
        "Proveedor no encontrado"));

        Titulo titulo = new Titulo(dto.getNombre(), id);
        Titulo nuevo = tituloRepository.save(titulo);

        SelectTituloDTO respuestaDto = new SelectTituloDTO(nuevo.getId(), nuevo.getNombre(), 
        nuevo.getCantidad(), nuevo.getProveedor().getId());

        return respuestaDto;
    }

    //Visualizamos los datos del titulo-------------------------------------------------------------------------------------------
    
    //Seleccionamos los datos del titulo

    //Eliminamos el titulo
    
}