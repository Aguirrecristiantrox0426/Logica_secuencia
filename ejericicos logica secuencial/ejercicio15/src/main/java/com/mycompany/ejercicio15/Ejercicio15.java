/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio15;

import java.util.Scanner;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Ejercicio15 {

    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);

        int numero,suma = 0,contador = 0;
        double promedio;

        do {

            System.out.print("Digite un numero ");
            numero = teclado.nextInt();

            if (numero != 0) {

                suma += numero;
                contador++;

            }

        } while (numero != 0);

        if (contador > 0) {

            promedio = suma / contador;

            System.out.println("Cantidad: " + contador);
            System.out.println("Suma: " + suma);
            System.out.println("Promedio: " + promedio);

        } else {

            System.out.println("No se ingresaron números.");

        }

    }
}
