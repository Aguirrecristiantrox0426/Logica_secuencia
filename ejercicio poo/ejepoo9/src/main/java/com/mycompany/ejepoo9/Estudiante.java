/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejepoo9;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Estudiante {

    String nombre,codigo;

    public Estudiante(String nombre, String codigo) {

        this.nombre = nombre;
        this.codigo = codigo;

    }

    public void mostrarinformacion() {

        System.out.println("estudiante");
        System.out.println("nombre " + nombre);
        System.out.println("codigo " + codigo);

    }

}

