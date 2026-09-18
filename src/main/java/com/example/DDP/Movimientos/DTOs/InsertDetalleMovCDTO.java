package com.example.DDP.Movimientos.DTOs;

public class InsertDetalleMovCDTO {
    
    private int id;
    private String Titulo;
    private int Cantidad;
    private double Precio;

    public InsertDetalleMovCDTO(int Id, String titulo, int cantidad, double precio){
        this.id = Id;
        this.Titulo = titulo;
        this.Cantidad = cantidad;
        this.Precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public double getPrecio() {
        return Precio;
    }
}