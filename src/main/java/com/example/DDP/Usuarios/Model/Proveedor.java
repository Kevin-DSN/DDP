package com.example.DDP.Usuarios.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "proveedores")
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public void setSaldo(double Saldo){
        this.saldo = Saldo;
    }

    public double getSaldo(){
        return saldo;
    }
}