/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejepoo5;

import java.util.Scanner;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Mainvehiculo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("ingrese la placa del vehiculo ");
        String placa = teclado.nextLine();

        System.out.print("ingrese la marca ");
        String marca = teclado.nextLine();

        System.out.print("ingrese el modelo ");
        String modelo = teclado.nextLine();

        System.out.print("ingrese la cantidad de combustible ");
        double combustible = teclado.nextDouble();

        Vehiculo vehiculo1 = new Vehiculo(placa, marca, modelo, combustible);

        System.out.println("informacion del vehiculo ");
        vehiculo1.mostrarinformacion();

        vehiculo1.encender();
        
        System.out.print("ingrese los kilometros recorridos ");
        double kilometros = teclado.nextDouble();

        vehiculo1.recorrer(kilometros);

        vehiculo1.apagar();
        
        System.out.println("informacion actualizada ");
        vehiculo1.mostrarinformacion();

    }

}

