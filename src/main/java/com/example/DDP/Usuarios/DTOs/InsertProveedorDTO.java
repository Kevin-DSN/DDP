package com.example.DDP.Usuarios.DTOs;

public class InsertProveedorDTO {
    private String nombre;
    private String editorial;
    private String telefono;
    private double saldo;

    public InsertProveedorDTO(String Nombre, String Editorial, String Telefono){
        this.nombre = Nombre;
        this.editorial = Editorial;
        this.telefono = Telefono;
        this.saldo = 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getTelefono() {
        return telefono;
    }

    public double getSaldo() {
        return saldo;
    }
}