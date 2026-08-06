/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejepoo9;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Asignatura {

    String nombre;
    int creditos;

    public Asignatura(String nombre, int creditos) {

        this.nombre = nombre;
        this.creditos = creditos;

    }

    public void mostrarinformacion() {

        System.out.println("asignatura");
        System.out.println("nombre " + nombre);
        System.out.println("creditos " + creditos);

    }

}

