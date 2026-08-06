/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio9;

import java.util.Scanner;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        int A,B;
        Scanner teclado=new Scanner (System.in);
        System.out.println("diguite el numero de A");
        A=teclado.nextInt();
        System.out.println("diguite el numero de B");
        B=teclado.nextInt();
        
        if (A>B) {
            System.out.println("el mayor es "+A+" y el menor es "+B);
        }
        else if (B>A){
            System.out.println("el mayor es "+B+" y el menor es "+A);
        }
        else {
            System.out.println("los dos numeros son iguales ");
        }
    }
}
