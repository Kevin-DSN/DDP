package com.example.DDP.Movimientos.Model;

import java.time.LocalDate;
import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Column;
import jakarta.persistence.CascadeType;
import com.example.DDP.Usuarios.Model.Cliente;
import java.util.List;

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
    private double Monto;
    private double SaldoActual;
    private double SaldoNuevo;

    @OneToMany(mappedBy = "movimientosCliente", cascade = CascadeType.ALL)
    private List<DetalleMovimientoC> detalles = new ArrayList<>();

    protected MovimientosCliente(){

    }

    public MovimientosCliente(Cliente Cliente, LocalDate Fecha, String movimiento, double monto, double saldoA, double SaldoN){
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

    public double getMonto() {
        return Monto;
    }

    public double getSaldoActual() {
        return SaldoActual;
    }

    public double getSaldoNuevo() {
        return SaldoNuevo;
    }

    public void addDetalle(DetalleMovimientoC detalle) {
        detalles.add(detalle);
        detalle.setMovimientosCliente(this);
    }
}