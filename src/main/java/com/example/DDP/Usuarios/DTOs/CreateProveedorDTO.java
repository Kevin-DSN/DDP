package com.example.DDP.Usuarios.DTOs;

public class CreateProveedorDTO {
    private String nombre;
    private String editorial;
    private String telefono;
    private double saldo;

    public CreateProveedorDTO(String Nombre, String Editorial, String Telefono){
        this.nombre = Nombre;
        this.editorial = Editorial;
        this.telefono = Telefono;
        this.saldo = 0.0;
    }
}