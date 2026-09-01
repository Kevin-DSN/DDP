package com.example.DDP.Movimientos.Model;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Column;
import com.example.DDP.Usuarios.Model.Cliente;

@Entity
@Table(name = "movimientos_c")
public class MovimientosCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idMovimientoC;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Cliente cliente;

    private LocalDate fecha;
    private String Movimiento;
    private int Monto;
    private int SaldoActual;
    private int SaldoNuevo;

    protected MovimientosCliente(){

    }

    public MovimientosCliente(Cliente Cliente, LocalDate Fecha, String movimiento, int monto, int saldoA, int SaldoN){
        this.cliente = Cliente;
        this.fecha = Fecha;
        this.Movimiento = movimiento;
        this.Monto = monto;
        this.SaldoActual = saldoA;
        this.SaldoNuevo = SaldoN;
    }

    //Obtenemos los datos
    public int getIdMovimientoC() {
        return idMovimientoC;
    }

    public Cliente getCliente() {
        return cliente;
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