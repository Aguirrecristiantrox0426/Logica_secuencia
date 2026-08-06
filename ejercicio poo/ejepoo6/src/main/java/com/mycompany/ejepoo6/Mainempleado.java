/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejepoo6;

import java.util.Scanner;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Mainempleado {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("ingrese el nombre del empleado ");
        String nombre = teclado.nextLine();

        System.out.print("ingrese el cargo ");
        String cargo = teclado.nextLine();

        System.out.print("ingrese el salario base ");
        double salarioBase = teclado.nextDouble();

        System.out.print("ingrese la cantidad de horas extra ");
        int horasExtras = teclado.nextInt();

        Empleado empleado1 = new Empleado(nombre, cargo, salarioBase, horasExtras);

        System.out.println("\nInformación del empleado:");
        empleado1.mostrarinformacion();

        System.out.println("\nSalario Final: $" + empleado1.calcularsalariofinal());

    }

}

