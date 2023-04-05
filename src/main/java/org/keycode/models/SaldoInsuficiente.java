package org.keycode.models;

public class SaldoInsuficiente extends RuntimeException{
    public SaldoInsuficiente() {
        System.out.println("Saldo insuficiente para realizar la transferencia/retiro");
    }
}