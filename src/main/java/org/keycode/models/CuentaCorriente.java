package org.keycode.models;

public class CuentaCorriente extends Cuenta{
    public CuentaCorriente(int numCuenta, float saldo, String tipoCuenta) {
        super(numCuenta, saldo, tipoCuenta);
    }

    @Override
    public Transferencia realizarTransferencia(Cuenta cuentaOrigen, Cuenta cuentaDestino) {
        return null;
    }
}
