/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio18;

import java.util.Scanner;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeros[] = new int[20];

        int suma = 0;
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Digite un número: ");
            numeros[i] = teclado.nextInt();

            suma += numeros[i];

            if (numeros[i] % 2 == 0)
                pares++;
            else
                impares++;

        }

        double promedio = (double) suma / numeros.length;

        System.out.println("Promedio: " + promedio);
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }
}
