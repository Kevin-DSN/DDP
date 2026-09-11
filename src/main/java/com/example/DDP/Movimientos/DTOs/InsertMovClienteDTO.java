package com.example.DDP.Movimientos.DTOs;

import java.time.LocalDate;

public class InsertMovClienteDTO {
    
    private int idCliente;
    private LocalDate fecha;
    private String Movimiento;
    private double Monto;

    public InsertMovClienteDTO(int IdCliente, LocalDate Fecha, String Movimiento, double Monto){
        this.idCliente = IdCliente;
        this.fecha = Fecha;
        this.Movimiento = Movimiento;
        this.Monto = Monto;
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
}