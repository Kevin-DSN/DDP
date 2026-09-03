package com.example.DDP.Almacen.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import com.example.DDP.Usuarios.Model.Proveedor;

@Entity
@Table(name = "titulo")
public class Titulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTitulo")
    private int id;

    private String nombre;
    private double precio;

    @Column(name = "Stock")
    private int cantidad;
    
    @ManyToOne
    @JoinColumn(name = "idProveedor")
    private Proveedor proveedor;

    protected Titulo(){

    }

    public Titulo(String Nombre, Proveedor Proveedor, double precio){
        this.nombre = Nombre;
        this.cantidad = 0;
        this.proveedor = Proveedor;
        this.precio = precio;
    }

    //Metodos de actualizacion de datos
    public void updateNombre(String Nombre){
        this.nombre = Nombre;
    }

    public void updateIdProveedor(Proveedor proveedor){
        this.proveedor = proveedor;
    }

    public void updatePrecio(double precio){
        this.precio = precio;
    }

    public void updateStock(int cantidad){
        this.cantidad = cantidad;
    }

    //Metodos get
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }
    
    public int getCantidad(){
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }
}