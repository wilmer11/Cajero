package org.keycode.models;

import org.keycode.utils.enums.TipoCuenta;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
    private int numCuenta;
    private float saldo;
    private TipoCuenta tipoCuenta;
    private Transferencia transferencia;
    private List<Cliente> clientes;

    public Cuenta(int numCuenta, float saldo, TipoCuenta tipoCuenta) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
        this.clientes = new ArrayList<>();
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void agregarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }
    
    public void agregarTransferencia(Cuenta cuenta){
        transferencia.add(cuenta);
    }
}
