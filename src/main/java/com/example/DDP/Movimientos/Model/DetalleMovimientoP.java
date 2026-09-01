package com.example.DDP.Movimientos.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Id;

@Entity
@Table(name = "detalle_movp")
public class DetalleMovimientoP {
    
    @ManyToOne
    @JoinColumn(name = "idMovP")
    private MovimientosProveedor movimientosProveedor;

    private String Producto;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    protected DetalleMovimientoP(){
        
    }

    public DetalleMovimientoP(MovimientosProveedor movimientosProveedor, String producto){
        this.movimientosProveedor = movimientosProveedor;
        this.Producto = producto;
    }

    //OBtenemos los datos para consultas
    public int getId() {
        return id;
    }

    public MovimientosProveedor getMovimientosProveedor() {
        return movimientosProveedor;
    }

    public String getProducto() {
        return Producto;
    }
}
