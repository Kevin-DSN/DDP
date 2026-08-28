package com.example.DDP.Almacen.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import com.example.DDP.Usuarios.Model.Proveedor;

@Entity
@Table(name = "titulos")
public class Titulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private int cantidad;
    @ManyToOne
    @JoinColumn(name = "idProveedor")
    private Proveedor proveedor;

    protected Titulo(){

    }

    public Titulo(String Nombre, Proveedor Proveedor){
        this.nombre = Nombre;
        this.cantidad = 0;
        this.proveedor = Proveedor;
    }

    //Suma y resta stock
    public void agregaStock(int Cantidad){
        this.cantidad += Cantidad;
    }

    public void restaStock(int Cantidad){
        this.cantidad += Cantidad;
    }

    //Metodos de actualizacion de datos
    public void updateNombre(String Nombre){
        this.nombre = Nombre;
    }

    public void updateIdProveedor(Proveedor proveedor){
        this.proveedor = proveedor;
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
}