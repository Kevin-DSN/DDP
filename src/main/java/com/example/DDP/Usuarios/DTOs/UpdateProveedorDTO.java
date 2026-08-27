package com.example.DDP.Usuarios.DTOs;

public class UpdateProveedorDTO {
    
    private int id;
    private String nombre;
    private String editorial;
    private String telefono;

    public UpdateProveedorDTO(int Id, String Nombre, String Editorial, String Telefono){
        this.id = Id;
        this.nombre = Nombre;
        this.editorial = Editorial;
        this.telefono = Telefono;
    }

    public int getId() {
        return id;
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
}
