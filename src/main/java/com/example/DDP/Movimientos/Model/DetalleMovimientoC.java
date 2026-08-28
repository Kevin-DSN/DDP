package com.example.DDP.Movimientos.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Id;

@Entity
@Table(name = "detalle_movimientoC")
public class DetalleMovimientoC {
    
    @ManyToOne
    @JoinColumn(name = "idMovimientoC")
    private MovimientosCliente movimientosCliente;

    private String Producto;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
}
