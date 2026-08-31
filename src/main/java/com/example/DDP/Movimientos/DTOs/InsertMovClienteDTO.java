package com.example.DDP.Movimientos.DTOs;

import java.time.LocalDate;

public class InsertMovClienteDTO {
    
    private int idCliente;
    private LocalDate fecha;
    private String Movimiento;
    private int Monto;

    public InsertMovClienteDTO(int IdCliente, LocalDate Fecha, String Movimiento, int Monto){
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

    public int getMonto() {
        return Monto;
    }
}