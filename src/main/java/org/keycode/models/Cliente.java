package org.keycode.models;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int id;
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Cuenta> cuentas;

    public Cliente(int id, String nombre, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cuentas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }
    public List<Cuenta> getCuentas(){return cuentas;}

    public void agregarCuenta(Cuenta cuenta){this.cuentas.add(cuenta);}

}
