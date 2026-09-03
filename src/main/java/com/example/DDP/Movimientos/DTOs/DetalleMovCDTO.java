package com.example.DDP.Movimientos.DTOs;

public class DetalleMovCDTO {
    
    private int id;
    private int idMovimientoC;
    private String Producto;
    private int Cantidad;
    private double Precio;

    public DetalleMovCDTO(int Id, int IdMovimiento, String Producto, int Cantidad, double Precio){
        this.id = Id;
        this.idMovimientoC = IdMovimiento;
        this.Producto = Producto;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
    }
    
    public int getId() {
        return id;
    }

    public int getIdMovimientoC() {
        return idMovimientoC;
    }

    public String getProducto() {
        return Producto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public double getPrecio() {
        return Precio;
    }
}
