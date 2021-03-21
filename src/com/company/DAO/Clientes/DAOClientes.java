package com.company.DAO.Clientes;

import com.company.entities.Articulo;
import com.company.entities.Cliente;

import java.util.List;

/**
 * aqui se especifica algunas de las funciones que tendra clientes y aqui se representan las listas de compra, articulos deseados y el carrito de compra como array list
 */

public interface DAOClientes {
    public List<Articulo> deseos(Cliente cliente);
    public  List<Articulo> comprados(Cliente cliente);
    public List<Articulo> carrito(Cliente cliente);

}

