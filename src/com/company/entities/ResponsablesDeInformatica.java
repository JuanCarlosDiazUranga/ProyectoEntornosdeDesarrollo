package com.company.entities;

import java.util.Date;

/**
 * esta clase es una herencia de trabajadores
 */
public class ResponsablesDeInformatica extends Trabajadores {

    public ResponsablesDeInformatica(String dni, Date fechadealta, Number telefono) {
        super(dni, fechadealta, telefono);
    }
}
