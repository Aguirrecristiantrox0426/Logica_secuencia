/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejepoo3;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Producto {
    String nombre;
    double precio;
    int cantidad;
    
    public Producto(String nombre,double precio, int cantidad){
        this.nombre=nombre;
        this.precio=precio;
        this.cantidad=cantidad;
    }
    public void mostrarinformacion(){
        System.out.println("producto");
        System.out.println("nombre del producto "+nombre);
        System.out.println("valor del producto "+precio);
        System.out.println("cantidad del producto "+cantidad);
    }
    
    public double calcularinventario(){
        return cantidad * precio;
    }
    
}

