package com.example.DDP.Almacen.DTOs;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class UpdateTituloDTO {
    
    
    private int id;
    @NotBlank(message = "Ingrese un nombre")
    private String nombre;
    @NotBlank(message = "Ingrese un precio")
    @Min(value = 1, message = "El precio debe ser mayor a cero") 
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
