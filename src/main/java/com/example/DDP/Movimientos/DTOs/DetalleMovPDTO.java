package com.example.DDP.Movimientos.DTOs;

public class DetalleMovPDTO {
    
    private int idMovimientoP;
    private String Producto;

    public DetalleMovPDTO (int id, String Producto){
        this.idMovimientoP = id;
        this.Producto = Producto;
    }

    public int getIdMovimientoP() {
        return idMovimientoP;
    }

    public String getProducto() {
        return Producto;
    }
}
