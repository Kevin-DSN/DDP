package com.example.DDP.Usuarios.DTOs;

public class InsertClienteDTO {

    private String nombre;
    private String direccion;
    private String telefono;
    private String RFC;
    private double saldo;

    public InsertClienteDTO(String Nombre, String Direccion, String Telefono, String RFC){
        this.nombre = Nombre;
        this.direccion = Direccion;
        this.telefono = Telefono;
        this.RFC = RFC;
        this.saldo = 0.0;
    }
}