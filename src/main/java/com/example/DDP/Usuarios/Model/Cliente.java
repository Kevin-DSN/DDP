package com.example.DDP.Usuarios.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String RFC;
    private double saldo;

    protected Cliente(){

    }

    public Cliente(String Nombre, String Direccion, String Telefono, String RFC, double Saldo){
        this.nombre = Nombre;
        this.direccion = Direccion;
        this.telefono = Telefono;
        this.RFC = RFC;
        this.saldo = Saldo;
    }

    //Actualiza saldo de ventas y devoluciones
    public void saldoVenta(double saldo){
        this.saldo += saldo;
    }

    public void saldoDevolucion(double saldo){
        this.saldo -= saldo;
    }

    //Metodos Update
    public void updateNombre(String nombre){
        this.nombre = nombre;
    }

    public void updateDireccion(String direccion){
        this.direccion = direccion;
    }

    public void updateTelefono(String Telefono){
        this.telefono = Telefono;
    }

    public void updateRFC(String RFC){
        this.RFC = RFC;
    }

    //Metodos Select
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }
    
    public double getSaldo(){
        return saldo;
    }

    public int getID(){
        return id;
    }

    public String getRFC() {
        return RFC;
    }
}