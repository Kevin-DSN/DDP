package com.example.DDP.Movimientos.Model;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import com.example.DDP.Usuarios.Model.Cliente;

@Entity
@Table(name = "movimientos_cliente")
public class MovimientosCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMovimientoC;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Cliente cliente;

    private LocalDate fecha;
    private String Movimiento;
    private int Monto;
    private int SaldoActual;
    private int SaldoNuevo;
}
