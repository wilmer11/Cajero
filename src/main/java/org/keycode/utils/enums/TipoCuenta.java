package org.keycode.utils.enums;

public enum TipoCuenta {
    AHORRO(1, "Ahorro"), CORRIENTE(2, "Corriente");
    private int id;
    private String nombre;

    TipoCuenta(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public static TipoCuenta buscarPorId(int id) {
        for (TipoCuenta c : TipoCuenta.values() ) {
            if (c.id == id) {
                return c;
            }
        }
        return AHORRO;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}
