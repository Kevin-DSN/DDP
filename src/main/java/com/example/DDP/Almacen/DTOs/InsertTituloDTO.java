package com.example.DDP.Almacen.DTOs;

public class InsertTituloDTO {

    private String nombre;
    private int cantidad;
    private int idProveedor;
    private double Precio;

    public InsertTituloDTO(String Nombre, double precio, int IdProveedor){
        this.nombre = Nombre;
        this.Precio = precio;
        this.cantidad = 0;
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

   public double getPrecio() {
       return Precio;
   }
}
