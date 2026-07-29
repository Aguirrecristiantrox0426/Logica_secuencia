/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio17;

import java.util.Scanner;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeros[] = new int[15];

        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Digite un número: ");
            numeros[i] = teclado.nextInt();

        }

        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }

        }

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);

    }
}
