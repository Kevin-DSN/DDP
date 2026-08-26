package com.example.DDP.Movimientos.DTOs;

import java.time.LocalDate;

public class InsertMovProveedorDTO {
    
    private int idProveedor;
    private LocalDate fecha;
    private String Movimiento;
    private int Monto;
    private int SaldoActual;
    private int SaldoNuevo;

    public InsertMovProveedorDTO(int IdProveedor, LocalDate Fecha, String Movimiento, int Monto, int SaldoActual, int SaldoNuevo){
        this.idProveedor = IdProveedor;
        this.fecha = Fecha;
        this.Movimiento = Movimiento;
        this.Monto = Monto;
        this.SaldoActual = SaldoActual;
        this.SaldoNuevo = SaldoNuevo;
    }
}