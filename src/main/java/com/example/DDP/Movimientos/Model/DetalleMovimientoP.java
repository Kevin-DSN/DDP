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
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_mov")
    private MovimientosProveedor movimientosProveedor;

    private int idTitulo;
    private String Producto;
    private int Cantidad;
    private double Precio;

    protected DetalleMovimientoP(){
        
    }

    public DetalleMovimientoP(MovimientosProveedor mov, int id, String producto, int cantidad, double Precio){
        this.Producto = producto;
        this.Cantidad = cantidad;
        this.Precio = Precio;
        this.movimientosProveedor = mov;
        this.idTitulo = id;
    }

    //OBtenemos los datos para consultas
    public int getId() {
        return id;
    }

    public MovimientosProveedor getMovimientosProveedor() {
        return movimientosProveedor;
    }

    public int getIdTitulo() {
        return idTitulo;
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

    public void setMovimientosProveedor(MovimientosProveedor movimientosProveedor) {
        this.movimientosProveedor = movimientosProveedor;
    }
}
