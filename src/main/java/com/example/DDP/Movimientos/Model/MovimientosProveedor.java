package com.example.DDP.Movimientos.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;

import com.example.DDP.Usuarios.Model.Proveedor;
@Entity
@Table(name = "movimientos_proveedor")
public class MovimientosProveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMovimientoP;

    @ManyToOne
    @JoinColumn(name = "idProveedor")
    private Proveedor proveedor;

    private LocalDate fecha;
    private String Movimiento;
    private int Monto;
    private int SaldoActual;
    private int SaldoNuevo;
}
