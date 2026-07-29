/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio10;

import java.util.Scanner;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        double A;
        Scanner teclado=new Scanner (System.in);
        
        System.out.println("diguite el año");
        A=teclado.nextDouble();
        
        if ((A%4==0 && A%100==0)||(A%400==0)) {
            System.out.println("el año es bisiesto ");
        }
        else{
            System.out.println("el año no es bisiesto ");
                   }
    }
}
