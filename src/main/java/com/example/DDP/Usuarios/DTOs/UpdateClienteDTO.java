package com.example.DDP.Usuarios.DTOs;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.NotBlank;

public class UpdateClienteDTO {
    
    
    private int id;
    @NotBlank(message = "Ingrese un nombre") 
    private String nombre;
    @NotBlank(message = "Ingrese una direccion") 
    private String direccion;
    @NotBlank(message = "Debe tener un numero telefonico")
    @Pattern(regexp = "^[0-9]{10}$", message = "Solo 10 digitos") 
    private String telefono;
    @NotBlank(message = "Ingrese un rfc")
    @Pattern(regexp = "^[A-Z0-9]{13}$", message = "Solo 13 digitos") 
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