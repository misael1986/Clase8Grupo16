/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.clase8grupo16;

/**
 *
 * @author Usuario
 */
public class Moto extends Vehiculo{
    
    private String tipo;
    private String frenos;
    private char cambios;
    private int pasajeros = 2;

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the frenos
     */
    public String getFrenos() {
        return frenos;
    }

    /**
     * @param frenos the frenos to set
     */
    public void setFrenos(String frenos) {
        this.frenos = frenos;
    }

    /**
     * @return the cambios
     */
    public char getCambios() {
        return cambios;
    }

    /**
     * @param cambios the cambios to set
     */
    public void setCambios(char cambios) {
        this.cambios = cambios;
    }

    /**
     * @return the pasajeros
     */
    public int getPasajeros() {
        return pasajeros;
    }

    /**
     * @param pasajeros the pasajeros to set
     */
    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
    
}
