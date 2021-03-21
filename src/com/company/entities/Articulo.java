package com.company.entities;

public class Articulo {
private String codigo;
private Number precio;

    public Articulo(String codigo, Number precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public Number getPrecio() {
        return precio;
    }
}