/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejepoo10;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Cliente {

    String nombre,correo,identificacion;

    public Cliente(String nombre, String correo, String identificacion){

        this.nombre = nombre;
        this.correo = correo;
        this.identificacion = identificacion;

    }

    public void mostrarinformacion(){

        System.out.println("cliente");
        System.out.println("nombre " + nombre);
        System.out.println("correo " + correo);
        System.out.println("identificacion " + identificacion);

    }

}

