/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejepoo8;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Plato {
    String nombre;
    double precio;

    public Plato(String nombre, double precio){

        this.nombre = nombre;
        this.precio = precio;

    }

    public void mostrarinformacion(){

        System.out.println("plato");
        System.out.println("nombre " + nombre);
        System.out.println("precio " + precio);

    }

}

