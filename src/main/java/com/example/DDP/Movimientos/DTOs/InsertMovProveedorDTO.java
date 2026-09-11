package com.example.DDP.Movimientos.DTOs;

import java.time.LocalDate;

public class InsertMovProveedorDTO {
    
    private int idProveedor;
    private LocalDate fecha;
    private String Movimiento;
    private double Monto;

    public InsertMovProveedorDTO(int IdProveedor, LocalDate Fecha, String Movimiento, double Monto){
        this.idProveedor = IdProveedor;
        this.fecha = Fecha;
        this.Movimiento = Movimiento;
        this.Monto = Monto;
    }

    //Accedemos a los datos
    public int getIdProveedor() {
        return idProveedor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double getMonto() {
        return Monto;
    }

    public String getMovimiento() {
        return Movimiento;
    }
}