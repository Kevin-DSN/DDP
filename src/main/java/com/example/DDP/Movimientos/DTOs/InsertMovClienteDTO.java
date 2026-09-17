package com.example.DDP.Movimientos.DTOs;
import java.time.LocalDate;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class InsertMovClienteDTO {
    
    private int idCliente;
    private LocalDate fecha;
    private String Movimiento;
    @NotBlank(message = "Ingrese un monto")
    @Min(value = 1, message = "El motno debe ser mayor a 0") 
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