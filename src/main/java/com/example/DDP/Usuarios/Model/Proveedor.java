package com.example.DDP.Usuarios.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "proveedor")
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProveedor")
    private int id;

    private String nombre;
    private String editorial;
    private String telefono;
    private double saldo;

    protected Proveedor(){

    }

    public Proveedor(String Nombre, String Editorial, String Telefono, double Saldo){
        this.nombre = Nombre;
        this.editorial = Editorial;
        this.telefono = Telefono;
        this.saldo = Saldo;
    }

    //Modificamos el saldo con compra o devolucion
    public void saldoCompra(double Saldo){
        this.saldo += Saldo;
    }
    public void saldoDevolucion(double Saldo){
        this.saldo -= Saldo;
    }

    //Actualizamos los datos
    public void updateNombre(String Nombre){
        this.nombre = Nombre;
    }
     public void updateEditorial(String Editorial){
        this.editorial = Editorial;
    }

    public void updateTelefono(String Telefono){
        this.telefono = Telefono;
    }
    
    //Metodos select
    public double getSaldo(){
        return saldo;
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