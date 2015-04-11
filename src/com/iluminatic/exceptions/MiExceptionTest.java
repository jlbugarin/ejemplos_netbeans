/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iluminatic.exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jlbugarin
 */
public class MiExceptionTest {

    public static void main(String[] args) {

        MiExceptionTest test = new MiExceptionTest();
        boolean resp =  test.metodo1();
        
        System.out.println("El resultado es: " + resp);
        
    }

    public boolean metodo1() {
        try {
            metodo2();
            return true;
        } catch (MiException ex) {
            System.out.println("codigo error: " + ex.getCodError() +  " Mensaje :" + ex.getMensajeError());
            return false;
        }
        

        
    }

    public void metodo2() throws MiException {
        
        metodo3();
        
    }

    public void metodo3() throws MiException {
        
        throw new MiException(101, "Error presentado en la aplicacion");
    }

}
