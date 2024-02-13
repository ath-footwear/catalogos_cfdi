/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testclase;

import Dao.Dao_Catalogo;

/**
 *
 * @author GATEWAY1-
 */
public class testclases {
    public static void main(String [] args){
        testclases t = new testclases();
        t.testclase();
    }
    private void testclase(){
        Dao_Catalogo d = new Dao_Catalogo();
        d.getClaveprod_Var("170");
    }
}
