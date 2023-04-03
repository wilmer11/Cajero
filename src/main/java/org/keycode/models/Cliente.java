package org.keycode.models;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int id;
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Cuenta> cuentas = new ArrayList<>();

    public Cliente(int id, String nombre, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }


    public void crearCuentaCliente(int numCuenta, float saldo, String tipoCuenta) {
        Cuenta cuenta;
        if (tipoCuenta.equals("Ahorros")) {
            cuenta = new CuentaAhorro(numCuenta, saldo, tipoCuenta);
            this.cuentas.add(cuenta);
        } else if (tipoCuenta.equals("Corriente")) {
            cuenta = new CuentaCorriente(numCuenta, saldo, tipoCuenta);
            this.cuentas.add(cuenta);
        } else {
            System.out.println("Cuenta no coincide");
        }
    }

    public void listarCuentasCliente() {
        for (Cuenta cuenta : cuentas) {
            System.out.println(cuenta);
        }
    }

    public Cuenta obtenerCuenta(int numeroCuenta){
        for (Cuenta cuenta : cuentas) {
            if(cuenta.getNumCuenta() == numeroCuenta){
                return cuenta;
            }
        }
        return null;
    }


}
