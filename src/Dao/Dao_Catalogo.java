/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.Claveprov;
import Modelo.Formadepago;
import Modelo.Unidades;
import Modelo.Usocfdi;
import Modelo.relacion;
import Persistencia.sql_catalogos;
import Server.sqlites_server;
import java.util.ArrayList;

/**
 *
 * @author GATEWAY1-
 */
public class Dao_Catalogo implements Int_Catalogo {

    private final sql_catalogos s = new sql_catalogos();

    @Override
    public ArrayList<Formadepago> getFormadepago_all() {
        sqlites_server sq= new sqlites_server();
        return s.getformapago_all(sq.getcon());
    }

    /**
     * Obtiene una lista de clases con todo el catalogo de clave de productos
     * del SAT,
     *
     * @return Lista de claves de producto
     */
    @Override
    public ArrayList<Claveprov> getClaveprod_all() {
        sqlites_server sq= new sqlites_server();
        return s.getClaveprov_all(sq.getcon());
    }

    /**
     * La funcion busca la clave dentro de la tabla de clave de producto, si no
     * encuentra regresa false, si es contrario verdadero.
     *
     * @param var String o clave
     * @return booleano
     */
    @Override
    public boolean getClaveprod_Var(String var) {
        sqlites_server sq= new sqlites_server();
        return s.getClaveprov_Var(sq.getcon(), var);
    }

    @Override
    public ArrayList<Usocfdi> getUsocfdi_all() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Unidades> getUnidades_all() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<relacion> getrelacion_all() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean getFormadepago_Var(String var) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean getUsocfdi_Var(String var) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean getUnidad_Var(String var) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean getrelacion_Var(String var) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
