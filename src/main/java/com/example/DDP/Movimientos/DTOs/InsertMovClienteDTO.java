package com.example.DDP.Movimientos.DTOs;

import java.time.LocalDate;

public class InsertMovClienteDTO {
    
    private int idCliente;
    private LocalDate fecha;
    private String Movimiento;
    private int Monto;
    private int SaldoActual;
    private int SaldoNuevo;

    public InsertMovClienteDTO(int IdCliente, LocalDate Fecha, String Movimiento, int Monto, int SaldoActual, int SaldoNuevo){
        this.idCliente = IdCliente;
        this.fecha = Fecha;
        this.Movimiento = Movimiento;
        this.Monto = Monto;
        this.SaldoActual = SaldoActual;
        this.SaldoNuevo = SaldoNuevo;
    }
}