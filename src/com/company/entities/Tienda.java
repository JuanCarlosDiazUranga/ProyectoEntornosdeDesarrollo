package com.company.entities;

import java.util.List;

public class Tienda {
    private  String id;
    List<Articulo> articulos;

    public Tienda(String id, List<Articulo> articulos) {
        this.id = id;
        this.articulos = articulos;
    }

    public String getId() {
        return id;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }
}
