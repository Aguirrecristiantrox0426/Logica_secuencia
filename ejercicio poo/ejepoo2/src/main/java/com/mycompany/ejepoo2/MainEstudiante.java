/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejepoo2;

import java.util.Scanner;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class MainEstudiante {
    public static void main (String[]args){
        Scanner teclado=new Scanner (System.in);
       
        System.out.println("ingrese el nombre del estudiante ");
        String nombre=teclado.nextLine();
        
        System.out.println("ingrese el grado ");
        String grado=teclado.nextLine();
        
        System.out.println("ingrese la edad ");
        int edad=teclado.nextInt();
        
        System.out.println();
        
        Estudiante estudiante1=new Estudiante(nombre,grado,edad);
        
        estudiante1.mostrarinformacion();
    }
}
