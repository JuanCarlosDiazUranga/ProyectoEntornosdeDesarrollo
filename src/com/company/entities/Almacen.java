package com.company.entities;

public class Almacen {
    private  String estanteria;
    private  Number codigo;
    private  Number seccion;
    private  String direccion;


    public Almacen(Number codigo,String direccion) {
        this.codigo = codigo;
        this.direccion=direccion;
    }
}
