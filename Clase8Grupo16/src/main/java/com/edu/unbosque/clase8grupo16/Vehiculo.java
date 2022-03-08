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
public class Vehiculo {
    
    
    private int cilindraje, motor,anho;// Motor 2-4
    private String marca,placa;
    private double kilometraje;
    private char combustible,medioDeTransporte;//G-Gasolina D-Diesel C-Carbón 
                            //T -Terrestre A-Aereo M-Maritimo  H-Hibrido

    /**
     * @return the cilindraje
     */
    public int getCilindraje() {
        return cilindraje;
    }

    /**
     * @param cilindraje the cilindraje to set
     */
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    /**
     * @return the motor
     */
    public int getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(int motor) {
        this.motor = motor;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the kilometraje
     */
    public double getKilometraje() {
        return kilometraje;
    }

    /**
     * @param kilometraje the kilometraje to set
     */
    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    /**
     * @return the combustible
     */
    public char getCombustible() {
        return combustible;
    }

    /**
     * @param combustible the combustible to set
     */
    public void setCombustible(char combustible) {
        this.combustible = combustible;
    }

    /**
     * @return the anho
     */
    public int getAnho() {
        return anho;
    }

    /**
     * @param anho the anho to set
     */
    public void setAnho(int anho) {
        this.anho = anho;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the medioDeTransporte
     */
    public char getMedioDeTransporte() {
        return medioDeTransporte;
    }

    /**
     * @param medioDeTransporte the medioDeTransporte to set
     */
    public void setMedioDeTransporte(char medioDeTransporte) {
        this.medioDeTransporte = medioDeTransporte;
    }
    
    
    
    
    
}
