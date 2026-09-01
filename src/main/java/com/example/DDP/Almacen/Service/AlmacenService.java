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
        "Titulo no encontrado"));

        Titulo titulo = new Titulo(dto.getNombre(), id, dto.getPrecio());
        Titulo nuevo = tituloRepository.save(titulo);

        SelectTituloDTO respuestaDto = new SelectTituloDTO(nuevo.getId(), nuevo.getNombre(), nuevo.getPrecio(), 
        nuevo.getCantidad(), nuevo.getProveedor().getId());

        return respuestaDto;
    }

    //Visualizamos los datos del titulo-------------------------------------------------------------------------------------------
    public SelectTituloDTO verCliente(int id){

        Titulo titulo = tituloRepository.findById(id).orElseThrow(() -> new RuntimeException(
        "Titulo no encontrado"));
        SelectTituloDTO resultadoDTO = new SelectTituloDTO(titulo.getId(), titulo.getNombre(), titulo.getPrecio(),
        titulo.getCantidad(), titulo.getProveedor().getId());

        return resultadoDTO;
    }
    //Actualizamos los datos del titulo-----------------------------------------------------------------------------------------------
    public SelectTituloDTO actualizaCliente(UpdateTituloDTO dto){

        Titulo titulo = tituloRepository.findById(dto.getId()).orElseThrow(() -> new RuntimeException(
        "Titulo no encontrado"));
        titulo.updateNombre(dto.getNombre());

        Titulo newTitulo = tituloRepository.save(titulo);

        SelectTituloDTO respuesta = new SelectTituloDTO(newTitulo.getId(), newTitulo.getNombre(), newTitulo.getPrecio(),
        newTitulo.getCantidad(), newTitulo.getProveedor().getId());

        return respuesta;
    }
    //Eliminamos el titulo-----------------------------------------------------------------------------------------------------------
    public void eliminarTiutlo(int id){
        if(tituloRepository.existsById(id)){
            tituloRepository.deleteById(id);
        }
        else{
            throw new RuntimeException("Error: Usuario inexistente ");
        }
    }
    //Obtenemos el stock del producto-------------------------------------------------------------------------------------------------
    public int obtieneStock(int id){
        Titulo titulo = tituloRepository.findById(id).orElseThrow(() -> new RuntimeException(
        "Titulo no encontrado"));

        int Stock = titulo.getCantidad();

        return Stock;
    }
}