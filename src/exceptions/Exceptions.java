/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author jlbugarin
 */
public class Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {

            System.out.println("En bloque try");
            String[] nombres = new String[2];
            nombres[1] = "valor";
            System.out.println("En bloque try... despues de asignaacion arreglo");
            
        } catch (Exception e) {
            System.out.println( "En bloque catch");
        } finally {

            System.out.println("En bloque finally");
        }
        
            System.out.println("fuera de los bloques");

    }

}
