/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Ejercicio1 {

    public static void main(String[] args) {
       double B,H,A,P;
       
       Scanner p=new  Scanner (System.in);
       
        System.out.println("digite la medida de la base y la altura del rectangulo");
        B=p.nextDouble();
        H=p.nextDouble();
        
        A=(B*H);
        
        P=(B*2)+(H*2);
        
        System.out.println("el area del rectangulo es "+ A );
        System.out.println("el perimetro del rectangulo es "+ P);
        
        
        
    }
}
