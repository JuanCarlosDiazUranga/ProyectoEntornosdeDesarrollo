package com.company.entities;

import java.util.Date;

/**
 * esta es la clase padre de responsabledeinformativa y de responsabledeinformativa
 */
public class Trabajadores {
    private  Number salario;
    private String dni;
    private Date fechadealta;
    private Number telefono;
    private  String correro;

    public Trabajadores(String dni, Date fechadealta,Number salario) {
        this.dni = dni;
        this.fechadealta=fechadealta;
        this.salario=salario;
    }
}
