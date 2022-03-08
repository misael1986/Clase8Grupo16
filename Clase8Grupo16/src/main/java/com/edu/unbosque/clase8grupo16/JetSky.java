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
public class JetSky extends Vehiculo{
     public int pasajeros=2;
     
     
     JetSky(){
     this.setMedioDeTransporte('A');
     }

    /**
     * @return the pasajeros
     */
    public int getPasajeros() {
        return pasajeros;
    }
}
