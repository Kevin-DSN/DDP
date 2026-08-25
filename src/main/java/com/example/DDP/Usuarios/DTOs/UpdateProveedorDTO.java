package com.example.DDP.Usuarios.DTOs;

public class UpdateProveedorDTO {
    
    private String nombre;
    private String editorial;
    private String telefono;
    private double saldo;

    public UpdateProveedorDTO(String Nombre, String Editorial, String Telefono, double Saldo){
        this.nombre = Nombre;
        this.editorial = Editorial;
        this.telefono = Telefono;
        this.saldo = Saldo;
    }
}
