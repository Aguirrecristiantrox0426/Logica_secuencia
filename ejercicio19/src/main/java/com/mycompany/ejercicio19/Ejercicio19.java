/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio19;

import java.util.Scanner;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Ejercicio19 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        double notas[] = new double[30];

        double suma = 0;

        int aprobados = 0;
        int reprobados = 0;

        for (int i = 0; i < notas.length; i++) {

            System.out.print("Digite la nota: ");
            notas[i] = teclado.nextDouble();

            suma += notas[i];

            if (notas[i] >= 3.0)
                aprobados++;
            else
                reprobados++;

        }

        double mayor = notas[0];
        double menor = notas[0];

        for (int i = 1; i < notas.length; i++) {

            if (notas[i] > mayor)
                mayor = notas[i];

            if (notas[i] < menor)
                menor = notas[i];

        }

        double promedio = suma / notas.length;

        System.out.println("Nota mayor: " + mayor);
        System.out.println("Nota menor: " + menor);
        System.out.println("Promedio: " + promedio);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);
    }
}
