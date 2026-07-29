/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio14;

import java.util.Scanner;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        int N,SUMA=0;
        double P;
        Scanner teclado=new Scanner (System.in);
        
        for (int i = 1; i < 11; i++) {
            System.out.println("diguite un numero ");
            N=teclado.nextInt();
            
            SUMA+=N;
        }
        P=SUMA/10.0;
        
        System.out.println("la suma es "+SUMA);
        System.out.println("el promedio es "+P);
    }
}
