package com.example.DDP.Usuarios.DTOs;

public class SelectProveedorDTO {
    private int id;
    private String nombre;
    private String editorial;
    private String telefono;
    private double saldo;

    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public String getEditorial(){
        return editorial;
    }

    public String getTelefono(){
        return telefono;
    }

    public double getSaldo(){
        return saldo;
    }
}
