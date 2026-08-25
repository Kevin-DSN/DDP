package com.example.DDP.Usuarios.DTOs;

public class SelectClienteDTO {
    private int id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String RFC;
    private double saldo;

    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public String getDireccion(){
        return direccion;
    }

    public String getTelefono(){
        return telefono;
    }

    public String getRFC(){
        return RFC;
    }

    public double getSaldo(){
        return saldo;
    }
}
