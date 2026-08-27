package com.example.DDP.Almacen.DTOs;

public class SelectTituloDTO {
    
    private int id;
    private String nombre;
    private int cantidad;
    private int idProveedor;

    public SelectTituloDTO(int Id, String Nombre, int Cantidad, int IdProveedor){
        this.id = Id;
        this.nombre = Nombre;
        this.cantidad = Cantidad;
        this.idProveedor = IdProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getIdProveedor() {
        return idProveedor;
    }
}
