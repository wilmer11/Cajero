package org.keycode.models;
import java.time.LocalDate;

public class CuentaCorriente extends Cuenta{
    public CuentaCorriente(int numCuenta, float saldo, String tipoCuenta) {
        super(numCuenta, saldo, tipoCuenta);
    }

    @Override
    public Transferencia realizarTransferencia(Cuenta cuentaOrigen,
                                               Cuenta cuentaDestino,
                                               float monto) throws SaldoInsuficiente{
        if (cuentaOrigen.getSaldo() - monto < -50000){
            throw new SaldoInsuficiente();
        } else {
            cuentaOrigen.setSaldo(cuentaOrigen.getSaldo() - monto);
            cuentaDestino.setSaldo(cuentaDestino.getSaldo() + monto);
            LocalDate fecha = LocalDate.now();
            Transferencia transferencia = new Transferencia(cuentaOrigen,cuentaDestino,monto,fecha);
            this.transferencias.add(transferencia);
            return transferencia;
        }
    }

    @Override
    public void retiro(Cuenta cuenta, float monto) throws SaldoInsuficiente{
        if (cuenta.getSaldo() - monto < -50000){
            throw new SaldoInsuficiente();

        } else {
            cuenta.setSaldo(cuenta.getSaldo() - monto);
        }
    }
}