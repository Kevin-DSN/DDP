package com.example.DDP.Usuarios.DTOs;

public class UpdateProveedorDTO {
    
    private String nombre;
    private String editorial;
    private String telefono;
    private double saldo;

    public UpdateProveedorDTO(String Nombre, String Editorial, String Telefono, double Saldo){
        this.nombre = Nombre;
        this.editorial = Editorial;
        this.telefono = Telefono;
        this.saldo = Saldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
