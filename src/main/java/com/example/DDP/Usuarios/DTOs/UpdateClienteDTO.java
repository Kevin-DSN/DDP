package com.example.DDP.Usuarios.DTOs;

public class UpdateClienteDTO {
    private String nombre;
    private String direccion;
    private String telefono;
    private String RFC;
    private double saldo;

    public UpdateClienteDTO(String Nombre, String Direccion, String Telefono, String RFC, double Saldo){
        this.nombre = Nombre;
        this.direccion = Direccion;
        this.telefono = Telefono;
        this.RFC = RFC;
        this.saldo = Saldo;
    }
}
