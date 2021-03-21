package com.company.DAO;

import com.company.DAO.Clientes.DAOCliente;
import com.company.DAO.Clientes.DAOClientes;
import com.company.DAO.Tiendas.DAOTienda;
import com.company.DAO.Tiendas.DAOTiendas;

public class DAOFactory {


        private static DAOFactory daoFactory;
        private DAOClientes daoclientes;
private  DAOTienda daoTienda;
        private DAOFactory(){}

        public static DAOFactory getInstance() {
            if(daoFactory == null){
                daoFactory = new DAOFactory();
            }
            return daoFactory;
        }
        private  DAOClientes getDaoclientes(){
            if (daoclientes==null){
                daoclientes=new DAOCliente();
            }
            return  daoclientes;
        }
        private DAOTienda getDAOtienda(){
            if (daoTienda==null){
                daoTienda=new DAOTiendas();
            }
            return daoTienda;
        }

}