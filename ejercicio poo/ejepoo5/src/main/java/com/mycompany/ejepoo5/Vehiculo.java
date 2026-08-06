/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejepoo5;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Vehiculo {
    String placa,modelo,marca;
    double combustible;
    boolean encendido;

    public Vehiculo(String placa, String marca, String modelo, double combustible){

        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
        this.encendido = false;

    }

    public void mostrarinformacion(){

        System.out.println("vehiculo");
        System.out.println("placa " + placa);
        System.out.println("marca " + marca);
        System.out.println("modelo " + modelo);
        System.out.println("combustible " + combustible);
        System.out.println("encendido " + encendido);

    }

    public void encender(){

        encendido = true;

    }

    public void apagar(){

        encendido = false;

    }

    public void recorrer(double kilometros){

        combustible = combustible - kilometros;

    }

}

