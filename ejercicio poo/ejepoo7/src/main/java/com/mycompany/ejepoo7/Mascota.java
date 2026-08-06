/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejepoo7;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Mascota {

    String nombre, especie,propietario;
    int edad;
    double peso;

    public Mascota(String nombre, String especie,int edad, double peso,String propietario){

        this.nombre = nombre;
        this.especie = especie;

        if (edad >= 0){
            this.edad = edad;
        }else{
            this.edad = 0;
        }

        if (peso >= 0){
            this.peso = peso;
        }else{
            this.peso = 0;
        }

        this.propietario = propietario;

    }

    public void mostrarinformacion(){

        System.out.println("mascota");
        System.out.println("nombre " + nombre);
        System.out.println("especie " + especie);
        System.out.println("edad " + edad);
        System.out.println("peso " + peso);
        System.out.println("propietario " + propietario);

    }

    public void registrarconsulta(){

        System.out.println("la mascota asistio a un consulta medica");

    }

}

