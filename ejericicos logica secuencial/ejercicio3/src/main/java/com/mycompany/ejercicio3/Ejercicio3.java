/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        double N1,N2,N3,NF;
        
        Scanner p=new Scanner (System.in);
        
        System.out.println("digite las notas ");
        N1=p.nextDouble();
        N2=p.nextDouble();
        N3=p.nextDouble();
        
        NF=(N1*0.3)+(N2*0.3)+(N3*0.4);
        
        System.out.println("la nota final es "+NF);
    }
}
