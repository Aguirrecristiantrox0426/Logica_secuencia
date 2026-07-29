/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio16;

import java.util.Scanner;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeros[] = new int[10];

        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Digite un número: ");
            numeros[i] = teclado.nextInt();

        }

        System.out.println("Números almacenados:");

        for (int i = 0; i < numeros.length; i++) {

            System.out.println(numeros[i]);

        }

    }
}
