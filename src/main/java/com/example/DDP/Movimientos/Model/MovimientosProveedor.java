package com.example.DDP.Movimientos.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.DDP.Usuarios.Model.Proveedor;
@Entity
@Table(name = "movimientos_p")
public class MovimientosProveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idMovimientoP;

    @ManyToOne
    @JoinColumn(name = "idProveedor")
    private Proveedor proveedor;

    private LocalDate fecha;
    private String Movimiento;
    private double Monto;
    private double SaldoActual;
    private double SaldoNuevo;

    @OneToMany(mappedBy = "movimientosProveedor", cascade = CascadeType.ALL)
    private List<DetalleMovimientoP> detalles = new ArrayList<>();

    protected MovimientosProveedor(){
        
    }

    public MovimientosProveedor(Proveedor proveedor, LocalDate Fecha, String movimiento, double monto, double SaldoA, double SaldoN){
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

    public double getMonto() {
        return Monto;
    }

    public double getSaldoActual() {
        return SaldoActual;
    }

    public double getSaldoNuevo() {
        return SaldoNuevo;
    }
    public void addDetalle(DetalleMovimientoP detalle) {
        detalles.add(detalle);
        detalle.setMovimientosProveedor(this);
    }
}