/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.clase8grupo16;

import java.util.Scanner;

/**
 * @author Usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Carro c = new Carro();
        c.setColor("Negro Mate");
        Moto pulsar = new Moto();
        pulsar.setFrenos("Disco");
        
        OtroVehiculo o=new OtroVehiculo();
        o.setCantMotores(2);
        o.setMarca("Elimat");
        o.setModelo("p750");
        o.setAnho(2017);

    }

    public static void Menu() {
        Scanner op = new Scanner(System.in);
        System.out.println("1. Moto\n"
                + "2. Carro\n"
                + "3. Camion\n"
                + "4. JetSky\n"
                + "5. Otros");
        int v = op.nextInt();
        switch (v) {
            case 1:
                Moto m = new Moto();
                break;
            case 2:
                Carro c = new Carro();

                break;
            case 3:
                Camion cam = new Camion();
                break;
            case 4:
                JetSky j = new JetSky();
                break;
            default:
                OtroVehiculo otro = new OtroVehiculo();
                break;

        }

    }

}
