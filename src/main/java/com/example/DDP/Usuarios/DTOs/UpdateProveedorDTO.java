package com.example.DDP.Usuarios.DTOs;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.NotBlank;

public class UpdateProveedorDTO {
    
    private int id;
    @NotBlank(message = "Ingrese un nombre")
    private String nombre;
    @NotBlank(message = "Ingrese una editorial")
    private String editorial;
    @NotBlank(message = "Debe tener un numero telefonico")
    @Pattern(regexp = "^[0-9]{10}$", message = "Solo 10 digitos") 
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
