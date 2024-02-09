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
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author GATEWAY1-
 */
public interface Int_Catalogo {

    public ArrayList<Formadepago> getFormadepago_all(Connection c);

    public ArrayList<Claveprov> getClaveprod_all(Connection c);

    public ArrayList<Usocfdi> getUsocfdi_all(Connection c);

    public ArrayList<Unidades> getUnidades_all(Connection c);

    public ArrayList<relacion> getrelacion_all(Connection c);

    public boolean getFormadepago_Var(Connection c, String var);

    public boolean getClaveprod_Var(Connection c, String var);

    public boolean getUsocfdi_Var(Connection c, String var);

    public boolean getUnidad_Var(Connection c, String var);

    public boolean getrelacion_Var(Connection c, String var);
}
