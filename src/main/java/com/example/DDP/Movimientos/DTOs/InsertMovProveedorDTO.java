package com.example.DDP.Movimientos.DTOs;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDate;

public class InsertMovProveedorDTO {
    
    private int idProveedor;
    private LocalDate fecha;
    private String Movimiento;
    @NotBlank(message = "Ingrese un monto")
    @Min(value = 1, message = "El motno debe ser mayor a 0")
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