package com.example.DDP.Almacen.DTOs;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class InsertTituloDTO {

    @NotBlank(message = "Ingrese un nombre par el titulo")
    private String nombre;
    private int cantidad = 0;
    @NotBlank(message = "Ingrese un id para asociar")
    private int idProveedor;
    @NotBlank(message = "Ingrese un precio")
    @Min(value = 1, message = "El precio debe ser mayor a cero") 
    private double Precio;

    public InsertTituloDTO(String Nombre, double precio, int IdProveedor){
        this.nombre = Nombre;
        this.Precio = precio;
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
