package com.example.DDP.Movimientos.DTOs;

import java.time.LocalDate;

public class SelectMovProveedorDTO {
    
    private int idProveedor;
    private LocalDate fecha;
    private String Movimiento;
    private int Monto;
    private int SaldoActual;
    private int SaldoNuevo;

    public SelectMovProveedorDTO(int IdProveedor, LocalDate Fecha, String Movimiento, int Monto, int SaldoActual, int SaldoNuevo){
        this.idProveedor = IdProveedor;
        this.fecha = Fecha;
        this.Movimiento = Movimiento;
        this.Monto = Monto;
        this.SaldoActual = SaldoActual;
        this.SaldoNuevo = SaldoNuevo;
    }

    public int getIdProveedor() {
        return idProveedor;
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
