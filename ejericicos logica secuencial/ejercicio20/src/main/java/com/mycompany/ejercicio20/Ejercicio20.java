/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio20;

import java.util.Scanner;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Ejercicio20 {

    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);

        int numeros[] = new int[25];

        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Digite un número: ");
            numeros[i] = teclado.nextInt();

        }

        System.out.print("Digite el número a buscar: ");
        int buscar = teclado.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == buscar) {

                encontrado = true;

                System.out.println("El número existe.");
                System.out.println("Se encuentra en la posición: " + i);

                break;

            }

        }

        if (!encontrado) {

            System.out.println("El número no existe.");

        }

    }
}
