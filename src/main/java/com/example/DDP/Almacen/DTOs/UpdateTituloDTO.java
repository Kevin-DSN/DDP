package com.example.DDP.Almacen.DTOs;

public class UpdateTituloDTO {
    
    private int id;
    private String nombre;
    private double Precio;
    private int idProveedor;

    public UpdateTituloDTO(int Id, String Nombre, double Precio, int IdProveedor){
        this.id = Id;
        this.nombre = Nombre;
        this.Precio = Precio;
        this.idProveedor = IdProveedor;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public double getPrecio() {
        return Precio;
    }
}
