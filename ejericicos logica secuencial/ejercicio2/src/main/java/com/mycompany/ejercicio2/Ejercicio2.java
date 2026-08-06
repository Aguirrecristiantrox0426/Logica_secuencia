/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Ejercicio2 {

    public static void main(String[] args) {
       double VP,VA,VI,VT;
       
       Scanner p=new Scanner (System.in);
       
        System.out.println("digite el valor del producto");
        VP=p.nextDouble();
        
        VA=VP;
        
        VI=VA*0.19;
        
        VT=VA+VI;
        
        System.out.println("el valor del producto es "+VA);
        System.out.println("el valor del iva es "+VI);
        System.out.println("el valor en total es "+VT);
    }
}
