package com.example.DDP.Movimientos.DTOs;

import java.time.LocalDate;

public class SelectMovClienteDTO {
    
    private int idCliente;
    private LocalDate fecha;
    private String Movimiento;
    private double Monto;
    private double SaldoActual;
    private double SaldoNuevo;

    public SelectMovClienteDTO(int IdCliente, LocalDate Fecha, String Movimiento, double Monto, double SaldoActual, double SaldoNuevo){
        this.idCliente = IdCliente;
        this.fecha = Fecha;
        this.Movimiento = Movimiento;
        this.Monto = Monto;
        this.SaldoActual = SaldoActual;
        this.SaldoNuevo = SaldoNuevo;
    }

    public int getIdCliente() {
        return idCliente;
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
}