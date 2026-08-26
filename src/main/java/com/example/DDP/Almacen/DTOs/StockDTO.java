package com.example.DDP.Almacen.DTOs;

public class StockDTO {
    
    private int idTitulo;
    private int stock;

    public StockDTO(int IdTitulo, int Stock){
        this.idTitulo = IdTitulo;
        this.stock = Stock;
    }

    public int getIdTitulo() {
        return idTitulo;
    }

    public int getStock() {
        return stock;
    }
}
