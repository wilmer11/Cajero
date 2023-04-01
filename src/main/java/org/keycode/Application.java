package org.keycode;

import org.keycode.models.Cliente;
import org.keycode.models.Transferencia;

public class Application {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1014,"Jairo","Calle 78","3221144");
        cliente1.crearCuentaCliente(112233,20000,"Ahorros");
        cliente1.crearCuentaCliente(445566,30000,"Corriente");
        cliente1.crearCuentaCliente(778899,40000,"Ahorros");
        cliente1.listarCuentasCliente();
        System.out.println(cliente1.obtenerCuenta(112233));




    }
}