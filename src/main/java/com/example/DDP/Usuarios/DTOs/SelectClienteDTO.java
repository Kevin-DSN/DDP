package com.example.DDP.Usuarios.DTOs;

public class SelectClienteDTO {
    private int id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String rfc;
    private double saldo;

    public SelectClienteDTO(int Id, String Nombre, String Direccion, String Telefono, String RFC, double Saldo){
        this.id = Id;
        this.nombre = Nombre;
        this.direccion = Direccion;
        this.rfc = RFC;
        this.saldo = Saldo;
    }

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
        return rfc;
    }

    public double getSaldo(){
        return saldo;
    }
}
