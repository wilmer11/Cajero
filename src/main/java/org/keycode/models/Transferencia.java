package org.keycode.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Transferencia {
    private float monto;
    private Date fecha;
    private List<Cuenta> cuentas;

    public Transferencia(float monto, Date fecha) {
        this.monto = monto;
        this.fecha = fecha;
        this.cuentas = new ArrayList<>();
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void add(Cuenta cuenta) {
    }
    /*public void cuentaOrigen(int numCuenta, float saldo) {
        Transferencia transferencia = new Transferencia(transferencias.size(), numCuenta, saldo);
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }*/
}
