package com.example.DDP.Usuarios.DTOs;

public class CreateClienteDTO {

    private String nombre;
    private String direccion;
    private String telefono;
    private String RFC;
    private double saldo;

    public CreateClienteDTO(String Nombre, String Direccion, String Telefono, String RFC){
        this.nombre = Nombre;
        this.direccion = Direccion;
        this.telefono = Telefono;
        this.RFC = RFC;
        this.saldo = 0.0;
    }
}