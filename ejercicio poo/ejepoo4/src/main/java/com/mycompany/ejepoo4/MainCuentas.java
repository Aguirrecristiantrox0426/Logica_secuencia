/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejepoo4;

import java.util.Scanner;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class MainCuentas {
    public static void main(String[] args){
        Scanner teclado=new Scanner (System.in);
        
        System.out.println("ingrese el numero de cuenta ");
        String numerocuenta=teclado.nextLine();
        
        System.out.println("ingrese el nombre del titular ");
        String nombre=teclado.nextLine();
        
        System.out.println("ingrese el saldo ");
        double saldo=teclado.nextDouble();
        
        Cuentas cuenta1=new Cuentas(numerocuenta,nombre,saldo);
        
        System.out.println("mostrar informacion de la cuenta");
        cuenta1.mostrarinformacion();
        
        System.out.println("ingrese el valor a depositar");
        double deposito=teclado.nextDouble();
        cuenta1.depositar(deposito);
        
        System.out.println("ingrese el valor a retirar");
        double retiro=teclado.nextDouble();
        cuenta1.retirar(retiro);
        
        System.out.println("informacion actualizada ");
        cuenta1.mostrarinformacion();
    }
    
}
