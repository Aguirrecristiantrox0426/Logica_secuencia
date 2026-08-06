/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        double GC,GF,GK;
        
        Scanner p=new Scanner (System.in);
        
        System.out.println("digite el valor en grados celsius");
        GC=p.nextDouble();
        
        GF=(GC*9/5)+32;
        
        GK=(GC+273.15);
        
        System.out.println("grados en fahrenheit "+GF);
        System.out.println("grados en kelvin "+GK); 
    }
}
