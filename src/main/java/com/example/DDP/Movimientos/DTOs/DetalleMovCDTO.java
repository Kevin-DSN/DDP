package com.example.DDP.Movimientos.DTOs;

public class DetalleMovCDTO {
    
    private int idMovimientoC;
    private String Producto;

    public DetalleMovCDTO(int IdMovimiento, String Producto){
        this.idMovimientoC = IdMovimiento;
        this.Producto = Producto;
    }

    public int getIdMovimientoC() {
        return idMovimientoC;
    }

    public String getProducto() {
        return Producto;
    }
}
