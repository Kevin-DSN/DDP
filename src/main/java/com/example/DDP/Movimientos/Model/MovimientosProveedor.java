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

    protected MovimientosProveedor(){
        
    }

    public MovimientosProveedor(Proveedor proveedor, LocalDate Fecha, String movimiento, int monto, int SaldoA, int SaldoN){
        this.proveedor = proveedor;
        this.fecha = Fecha;
        this.Movimiento = movimiento;
        this.Monto = monto;
        this.SaldoActual = SaldoA;
        this.SaldoNuevo = SaldoN;
    }

    //Obtenemos los datos
    public int getIdMovimientoP() {
        return idMovimientoP;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getMovimiento() {
        return Movimiento;
    }

    public int getMonto() {
        return Monto;
    }

    public int getSaldoActual() {
        return SaldoActual;
    }

    public int getSaldoNuevo() {
        return SaldoNuevo;
    }
}