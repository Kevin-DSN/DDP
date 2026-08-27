package com.example.DDP.Usuarios.DTOs;

public class UpdateClienteDTO {
    
    private int id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String RFC;

    public UpdateClienteDTO(int id, String Nombre, String Direccion, String Telefono, String RFC){
        this.id = id;
        this.nombre = Nombre;
        this.direccion = Direccion;
        this.telefono = Telefono;
        this.RFC = RFC;
    }

    public int getId() {
        return id;
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
}