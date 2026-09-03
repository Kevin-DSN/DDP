package com.example.DDP.Movimientos.DTOs;

public class DetalleMovPDTO {
    
    private int id;
    private int idMovimientoP;
    private String Producto;
    private int Cantidad;
    private double Precio;

    public DetalleMovPDTO (int id, int IdMovimiento, String Producto, int Cantidad, double Precio){
        this.idMovimientoP = id;
        this.idMovimientoP = IdMovimiento;
        this.Producto = Producto;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
    }

    public int getId() {
        return id;
    }

    public int getIdMovimientoP() {
        return idMovimientoP;
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
