/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejepoo6;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Empleado {

    String nombre,cargo;
    double salarioBase;
    int horasExtras;

    public Empleado(String nombre, String cargo,double salarioBase, int horasExtras){

        this.nombre = nombre;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;

    }

    public void mostrarinformacion(){

        System.out.println("empleado");
        System.out.println("nombre " + nombre);
        System.out.println("cargo " + cargo);
        System.out.println("salario base " + salarioBase);
        System.out.println("horas extras " + horasExtras);

    }

    public double calcularsalariofinal(){

        return salarioBase + (horasExtras * 10000);

    }

}

