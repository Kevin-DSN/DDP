package com.example.DDP.Almacen.DTOs;

public class InsertTituloDTO {

    private String nombre;
    private int cantidad;
    private int idProveedor;

    public InsertTituloDTO(String Nombre, int IdProveedor){
        this.nombre = Nombre;
        this.cantidad = 0;
        this.idProveedor = IdProveedor;
    }
}
