package com.example.DDP.Almacen.DTOs;

public class SelectTituloDTO {
    
    private int id;
    private String nombre;
    private double precio;
    private int cantidad;
    private int idProveedor;

    public SelectTituloDTO(int Id, String Nombre, double Precio, int Cantidad, int IdProveedor){
        this.id = Id;
        this.nombre = Nombre;
        this.precio = Precio;
        this.cantidad = Cantidad;
        this.idProveedor = IdProveedor;
    }
    
    //Metodos GET
    public int getId() {
        return id;
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

    public double getPrecio() {
        return precio;
    }
}
