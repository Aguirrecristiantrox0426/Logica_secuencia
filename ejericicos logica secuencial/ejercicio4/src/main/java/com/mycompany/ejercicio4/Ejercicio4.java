/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        double HT,VP,SB,DS,DP,SN;
        
        Scanner p=new Scanner (System.in);
        
        System.out.println("digite las horas trabajadas y el valor de la hora");
        HT=p.nextDouble();
        VP=p.nextDouble();
        
        SB=VP*HT;
        DS=SB*0.04;
        DP=SB*0.04;
        SN=SB-(DS+DP);
        System.out.println("el salario en bruto es "+SB);
        System.out.println("el descuento de salud es "+DS);
        System.out.println("el descuento por pension es "+DP);
        System.out.println("el salario neto es "+SN);
        
                
    }
}
