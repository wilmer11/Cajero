package org.keycode;

import org.keycode.models.Cliente;
import org.keycode.models.Cuenta;

public class Application {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1014,"Jairo","Calle 78","3221144");
        cliente1.crearCuentaCliente(112233,20000,"Ahorros");
        cliente1.crearCuentaCliente(445566,30000,"Corriente");
        cliente1.crearCuentaCliente(778899,40000,"Ahorros");
        cliente1.listarCuentasCliente();
        Cuenta cuenta1 = cliente1.obtenerCuenta(112233);
        Cuenta cuenta2 = cliente1.obtenerCuenta(778899);
        cuenta1.realizarTransferencia(cuenta1,cuenta2,15000);
        cuenta1.listarTransferenciasCuenta(112233);
        cuenta1.realizarTransferencia(cuenta1,cuenta2,5000);
        System.out.println(cliente1.obtenerCuenta(112233).getSaldo());
        cuenta1.listarTransferenciasCuenta(112233);

    }
}