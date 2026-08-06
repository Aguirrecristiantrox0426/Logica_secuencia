/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7;

import java.util.Scanner;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        int E;
        Scanner teclado=new Scanner (System.in);
        System.out.println("diguite su edad");
        E=teclado.nextInt();
       
        if (E <= 11) {
            System.out.println("su edad es de un niño");
        }
        else if (E >=11 && E<=17){
            System.out.println("su edad es de un adolecente");
        }
        else if (E >=18 && E<=59){
            System.out.println("su edad es de un adulto");
        }
        else {
        System.out.println("sue dad es de un adulto mayor");
        }
    }
}
