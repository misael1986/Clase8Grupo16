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
public class Carro extends Vehiculo {

    public int puertas;
    public String color;
    public String transmision;
    public String carroceria;
    public char direccion;

    Carro() {
        this.setMedioDeTransporte('T');
    }

    /**
     * @return the puertas
     */
    public int getPuertas() {
        return puertas;
    }

    /**
     * @param puertas the puertas to set
     */
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the transmision
     */
    public String getTransmision() {
        return transmision;
    }

    /**
     * @param transmision the transmision to set
     */
    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    /**
     * @return the carroceria
     */
    public String getCarroceria() {
        return carroceria;
    }

    /**
     * @param carroceria the carroceria to set
     */
    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

}
