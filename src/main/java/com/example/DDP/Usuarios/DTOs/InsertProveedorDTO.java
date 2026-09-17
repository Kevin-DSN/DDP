package com.example.DDP.Usuarios.DTOs;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class InsertProveedorDTO {
    @NotBlank(message = "Ingrese un nombre") 
    private String nombre;
    @NotBlank(message = "Ingrese una editorial")
    private String editorial;
    @NotBlank(message = "Debe tener un numero telefonico")
    @Pattern(regexp = "^[0-9]{10}$", message = "Solo 10 digitos") 
    private String telefono;
    private double saldo = 0.0;;

    public InsertProveedorDTO(String Nombre, String Editorial, String Telefono){
        this.nombre = Nombre;
        this.editorial = Editorial;
        this.telefono = Telefono;
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

    public double getSaldo() {
        return saldo;
    }
}