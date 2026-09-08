package com.example.DDP.Almacen.DTOs;

public class UpdateTituloDTO {
    
    private int id;
    private String nombre;
    private double Precio;

    public UpdateTituloDTO(int Id, String Nombre, double Precio){
        this.id = Id;
        this.nombre = Nombre;
        this.Precio = Precio;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return Precio;
    }
}
