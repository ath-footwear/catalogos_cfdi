/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GATEWAY1-
 */
public class sqlites_server {

    /**
     * El archivo o bd del lite se conserva para no hacer un duplicado del mismo
     */
    private final String urlitecfdi = "C:\\af\\prod\\cfdi.db";
    private final File f = new File(urlitecfdi);
    private static Connection connectlite;

    /**
     * El metodo de la clase instanciando la conexion y no tener que mandar
     * llamar un metodo extra
     */
    public void sqlites_serves() {
        try {
            Class.forName("org.sqlite.JDBC");
            if (!f.exists()) {
                connectlite = DriverManager.getConnection("jdbc:sqlite:" + urlitecfdi);
                System.out.println("Conectado");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(sqlites_server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Obtiene la conexion previamente generada
     *
     * @return
     */
    public Connection getcon() {
        return connectlite;
    }
}
