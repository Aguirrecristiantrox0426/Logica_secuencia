/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejepoo10;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Compra {

    int numero;
    String fecha;

    Cliente cliente;
    Producto[] productos;

    public Compra(int numero, String fecha,Cliente cliente,Producto[] productos){

        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        this.productos = productos;

    }

    public double calculartotal(){

        double total = 0;

        for(int i = 0; i < productos.length; i++){

            total = total + productos[i].calcularsubtotal();

        }

        return total;

    }

    public void mostrarinformacion(){

        System.out.println("compra");
        System.out.println("numero " + numero);
        System.out.println("fecha " + fecha);

        cliente.mostrarinformacion();

        System.out.println("\nProductos:");

        for(int i = 0; i < productos.length; i++){

            productos[i].mostrarinformacion();
            System.out.println();

        }

        System.out.println("TOTAL A PAGAR: " + calculartotal());

    }

}

