/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejepoo4;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Cuentas {
    String numerocuenta;
    String nombre;
    double saldo;
    
    public Cuentas(String numerocuenta,String nombre, double saldo){
        this.numerocuenta=numerocuenta;
        this.nombre=nombre;
        this.saldo=saldo;
        
    }
    public void mostrarinformacion(){
        System.out.println("cuenta bancaria ");
        System.out.println("numero de cuenta "+numerocuenta);
        System.out.println("nombre del titular "+nombre);
        System.out.println("saldo de la cuenta "+saldo);
    }
    public void depositar(double cantidad){
        saldo = saldo + cantidad;
    }
    public void retirar(double cantidad){
    if (cantidad <= saldo) {
        saldo = saldo - cantidad;
        System.out.println("Retiro realizado correctamente.");
    } else {
        System.out.println("Saldo insuficiente.");
    }
}
    
}
