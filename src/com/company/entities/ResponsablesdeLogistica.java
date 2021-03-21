package com.company.entities;

import java.util.Date;
/**
 * esta clase es una herencia de trabajadores
 */
public class ResponsablesdeLogistica extends Trabajadores{

    public ResponsablesdeLogistica(String dni, Date fechadealta, Number telefono) {
        super(dni, fechadealta, telefono);
    }
}
