/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        int N;
        Scanner teclado=new Scanner (System.in);
        
        System.out.println("digite un numero ");
        N=teclado.nextInt();
        
        if (N > 0) {
            System.out.println("el numero es positivo");
        }
        else if (N == 0) {
             System.out.println("el numero es cero ");
        }
        else {
            System.out.println("el numero es negativo ");
        }
        
    }
}
