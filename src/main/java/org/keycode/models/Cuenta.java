package org.keycode.models;

import java.util.Date;

public abstract class Cuenta {
    protected int numCuenta;
    protected float saldo;
    protected String tipoCuenta;
    protected int clave;

    public Cuenta(int numCuenta, float saldo, String tipoCuenta) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void transferirDinero(int monto, Date fecha, Cuenta cuentaOrigen, Cuenta cuentaDestino){
        

    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numCuenta=" + numCuenta +
                ", saldo=" + saldo +
                ", tipoCuenta='" + tipoCuenta + '\'' +
                '}';
    }

    public abstract Transferencia realizarTransferencia(Cuenta cuentaOrigen, Cuenta cuentaDestino);


}
