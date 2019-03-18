/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.singleton;

/**
 *
 * @author migue
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usuario1 =  Usuario.getSingleton("miguel","mendoza");
        usuario1.login();
        usuario1.logout();
        usuario1.login();
        System.out.println(usuario1.isLog());
        Usuario usuario2 =  Usuario.getSingleton("juan","perez");
        System.out.println(usuario2.isLog());
    }
    
}
