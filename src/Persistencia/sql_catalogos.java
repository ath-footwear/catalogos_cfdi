/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Modelo.Claveprov;
import Modelo.Formadepago;
import Modelo.Unidades;
import Modelo.Usocfdi;
import Modelo.relacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GATEWAY1-
 */
public class sql_catalogos {

    /**
     * Metodo para cerrar la conexion de inmediato a cuando se termine la
     * consulta, el problema es que ath tiene sesiones hasta que el usuario
     * cierre sesion, por lo tanto, no se puede cerrar, pero se mantiene por si
     * en algun momento se utiliza.
     *
     * @param c Conexion sql
     */
    public void cerrarconexionactual(Connection c) {
        try {
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(sql_catalogos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Obtiene una lista de clases con todo el catalogo de clave de productos
     * del SAT,
     *
     * @param c conexion sql(pendiente quizas en cambiar)
     * @return Lista de claves de producto
     */
    public ArrayList<Claveprov> getClaveprov_all(Connection c) {
        ArrayList<Claveprov> arr = new ArrayList<>();
        try {
            ResultSet rs;
            PreparedStatement st;
            String sql = "select * from Claveprods";
            st = c.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                Claveprov p = new Claveprov();
                p.setClaveprod(rs.getString("clave"));
                p.setDescripcion(rs.getString("descripcion"));
                arr.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(sql_catalogos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
//Solo aplica para conexiones cuando las conexiones no son persistenctes
            cerrarconexionactual(c);
        }
        return arr;
    }

/**
 * verifica si existe la clave de acuerdo al parametro que se le pasa
 * @param c conexion
 * @param var clave producto
 * @return boolean true=si encontro, false =no
 */
    public boolean getClaveprov_Var(Connection c, String var) {
        boolean resp = false;
        try {
            ResultSet rs;
            PreparedStatement st;
            String sql = "select clave from Claveprods where clave=?";
            st = c.prepareStatement(sql);
            st.setString(1, var);
            rs = st.executeQuery();
            while (rs.next()) {
                resp = true;
            }
        } catch (SQLException ex) {
            resp = false;
            Logger.getLogger(sql_catalogos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
//Solo aplica para conexiones cuando las conexiones no son persistenctes
            cerrarconexionactual(c);
        }
        return resp;
    }

    public ArrayList<Formadepago> getformapago_all(Connection c) {
        ArrayList<Formadepago> arr = new ArrayList<>();
        try {
            ResultSet rs;
            PreparedStatement st;
            String sql = "select * from formadepago";
            st = c.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {

            }
        } catch (SQLException ex) {
            Logger.getLogger(sql_catalogos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
//Solo aplica para conexiones cuando las conexiones no son persistenctes
            cerrarconexionactual(c);
        }
        return arr;
    }

    public ArrayList<Unidades> getUnidades_all(Connection c) {
        ArrayList<Unidades> arr = new ArrayList<>();
        try {
            ResultSet rs;
            PreparedStatement st;
            String sql = "select * from Unidad";
            st = c.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {

            }
        } catch (SQLException ex) {
            Logger.getLogger(sql_catalogos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
//Solo aplica para conexiones cuando las conexiones no son persistenctes
            cerrarconexionactual(c);
        }
        return arr;
    }

    public ArrayList<Usocfdi> getUsocfdi_all(Connection c) {
        ArrayList<Usocfdi> arr = new ArrayList<>();
        try {
            ResultSet rs;
            PreparedStatement st;
            String sql = "select * from Usocfdi";
            st = c.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {

            }
        } catch (SQLException ex) {
            Logger.getLogger(sql_catalogos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
//Solo aplica para conexiones cuando las conexiones no son persistenctes
            cerrarconexionactual(c);
        }
        return arr;
    }

    public ArrayList<relacion> getrelacion_all(Connection c) {
        ArrayList<relacion> arr = new ArrayList<>();
        try {
            ResultSet rs;
            PreparedStatement st;
            String sql = "select * from Relacioncfdi";
            st = c.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {

            }
        } catch (SQLException ex) {
            Logger.getLogger(sql_catalogos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
//Solo aplica para conexiones cuando las conexiones no son persistenctes
            cerrarconexionactual(c);
        }
        return arr;
    }
}
