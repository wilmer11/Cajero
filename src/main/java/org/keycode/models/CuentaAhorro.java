package org.keycode.models;

public class CuentaAhorro extends Cuenta {

    public CuentaAhorro(int numCuenta, float saldo, String tipoCuenta) {
        super(numCuenta, saldo, tipoCuenta);
    }

    @Override
    public Transferencia realizarTransferencia(Cuenta cuentaOrigen, Cuenta cuentaDestino) {
        return null;
    }
}
