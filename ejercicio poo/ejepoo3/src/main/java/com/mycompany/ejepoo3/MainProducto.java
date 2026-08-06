/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejepoo3;

import java.util.Scanner;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class MainProducto {
    
    public static void main (String[]args){
      Scanner teclado=new Scanner (System.in);
      
        System.out.println("ingrese el nombre del producto ");
        String nombre=teclado.nextLine();
        
        System.out.println("ingresel el valor ");
        double precio=teclado.nextDouble();
        
        System.out.println("ingrese la cantidad ");
        int cantidad=teclado.nextInt();
        
        Producto producto1=new Producto(nombre,precio,cantidad);
        
        System.out.println();
        
        producto1.mostrarinformacion();
        
        System.out.println("valor total del inventario: "+ producto1.calcularinventario());
    } 
    
}
