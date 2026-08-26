package com.example.DDP.Usuarios.DTOs;

public class SaldoCliente {
    private int id;
    private int saldo;

    public SaldoCliente(int Id, int Saldo){
        this.id = Id;
        this.saldo = Saldo;
    }

    public int getId() {
        return id;
    }
    
    public int getSaldo() {
        return saldo;
    }
}