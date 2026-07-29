/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio8;

import java.util.Scanner;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        double VC,PD,VP;
        Scanner teclado=new Scanner (System.in);
        System.out.println("diguite el valor de la compra");
        VC=teclado.nextDouble();
        System.out.println("diguite el porcentaje del descuento");
        PD=teclado.nextDouble();
        
        if (VC >=200000) {
            VP=VC-(VC*(PD/100));
            System.out.println("el valor a pagar es "+ VP);
        }
        else {
            System.out.println("el valor a pagar es "+VC);
        }
    }
}
