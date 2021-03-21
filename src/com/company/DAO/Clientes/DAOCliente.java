package com.company.DAO.Clientes;

import com.company.entities.Articulo;
import com.company.entities.Cliente;

import java.util.List;

public class DAOCliente implements DAOClientes{

    /**
     *
     * @param cliente dando como parametro un cliente de tipo cliente
     * @return este aplicativo devolvera una lista de articulos "deseos"
     */

    @Override
    public List<Articulo> deseos(Cliente cliente) {
        return cliente.getDeseos();
    }

    /**
     *
     * @param cliente  dando como parametro un cliente de tipo cliente
     * @return cliente este aplicativo devolvera una lista de articulos "comprados"
     */

    @Override
    public List<Articulo> comprados(Cliente cliente) {
        return  cliente.getComprados();
    }

    /**
     *
     * @param cliente  dando como parametro un cliente de tipo cliente
     * @return este aplicativo devolvera una lista de articulos "carrito"
     */
    @Override
    public List<Articulo> carrito(Cliente cliente) {
        return cliente.getCarrito();
    }


}
