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

    public Titulo(String Nombre, int Cantidad, Proveedor Proveedor){
        this.nombre = Nombre;
        this.cantidad = Cantidad;
        this.proveedor = Proveedor;
    }

    public void setCantidad(int Cantidad){
        this.cantidad = Cantidad;
    }

    public int getCantidad(){
        return cantidad;
    }
}