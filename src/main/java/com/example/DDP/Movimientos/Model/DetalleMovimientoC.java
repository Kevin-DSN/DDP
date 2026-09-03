package com.example.DDP.Movimientos.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Id;

@Entity
@Table(name = "detalle_movc")
public class DetalleMovimientoC {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "idMovC")
    private MovimientosCliente movimientosCliente;

    private String Producto;
    private int Cantidad;
    private double Precio;
    

    protected DetalleMovimientoC(){
        
    }

    public DetalleMovimientoC(String Producto, int cantidad, double Precio){
        this.Producto = Producto;
        this.Cantidad = cantidad;
        this.Precio = Precio;
    }

    //Obtenemos los datos para las cosultas
    public int getId() {
        return id;
    }

    public MovimientosCliente getMovimientosCliente() {
        return movimientosCliente;
    }

    public String getProducto() {
        return Producto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setMovimientosCliente(MovimientosCliente movimientosCliente) {
        this.movimientosCliente = movimientosCliente;
    }
}
