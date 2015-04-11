/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.iluminatic.exceptions;

/**
 *
 * @author jlbugarin
 */
public class MiException extends Exception{
    
    private int codError;
    private String mensajeError;
    
    public MiException (int cod, String error){
        this.codError = cod;
        this.mensajeError = error;
    }

    /**
     * @return the codError
     */
    public int getCodError() {
        return codError;
    }

    /**
     * @param codError the codError to set
     */
    public void setCodError(int codError) {
        this.codError = codError;
    }

    /**
     * @return the mensajeError
     */
    public String getMensajeError() {
        return mensajeError;
    }

    /**
     * @param mensajeError the mensajeError to set
     */
    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }

    
    
    
}
