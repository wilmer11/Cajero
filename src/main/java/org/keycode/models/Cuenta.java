package org.keycode.models;
import java.util.ArrayList;
import java.time.LocalTime;
import java.util.List;

public abstract class Cuenta {
    protected int numCuenta;
    protected float saldo;
    protected String tipoCuenta;
    protected List<Transferencia> transferencias = new ArrayList<>();

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

    @Override
    public String toString() {
        return "Cuenta{" +
                "numCuenta=" + numCuenta +
                ", saldo=" + saldo +
                ", tipoCuenta='" + tipoCuenta + '\'' +
                '}';
    }

    public abstract Transferencia realizarTransferencia(Cuenta cuentaOrigen,
                                                        Cuenta cuentaDestino,
                                                        float monto) throws SaldoInsuficiente;

    public abstract void retiro(Cuenta cuenta, float monto);

    public void listarTransferenciasCuenta(int cuenta) throws SaldoInsuficiente{
        for (Transferencia transferencia : transferencias) {
            if (transferencia.getCuentaOrigen().getNumCuenta() == cuenta){
                System.out.println(transferencia);
            }
        }
    }

}
