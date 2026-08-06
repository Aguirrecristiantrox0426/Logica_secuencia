/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejepoo10;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Producto {

    String nombre;
    double precio;
    int cantidad;

    public Producto(String nombre, double precio, int cantidad){

        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;

    }

    public double calcularsubtotal(){

        return precio * cantidad;

    }

    public void mostrarinformacion(){

        System.out.println("producto " + nombre);
        System.out.println("precio " + precio);
        System.out.println("cantidad " + cantidad);
        System.out.println("subtotal " + calcularsubtotal());

    }

}   

