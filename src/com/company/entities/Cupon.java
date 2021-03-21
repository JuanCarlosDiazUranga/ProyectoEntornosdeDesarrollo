package com.company.entities;

import java.util.Date;

public class Cupon {
    private Date fechadecangeo;
    private Number importe;
    private  Date fechadeemision;
    private  Date caducidad;
    private String id;

    public Cupon(Date fechadecangeo, String id, Date fecha, Date caducidad) {
        this.fechadecangeo = fechadecangeo;
        this.id=id;
        this.fechadeemision = fecha;
        this.caducidad = caducidad;
    }
}
