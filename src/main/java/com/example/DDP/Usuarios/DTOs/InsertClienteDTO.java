package com.example.DDP.Usuarios.DTOs;

public class InsertClienteDTO {

    private String nombre;
    private String direccion;
    private String telefono;
    private String RFC;
    private double saldo = 0.0;

    public InsertClienteDTO(String Nombre, String Direccion, String Telefono, String RFC){
        this.nombre = Nombre;
        this.direccion = Direccion;
        this.telefono = Telefono;
        this.RFC = RFC;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getRFC() {
        return RFC;
    }

    public double getSaldo() {
        return saldo;
    }
}