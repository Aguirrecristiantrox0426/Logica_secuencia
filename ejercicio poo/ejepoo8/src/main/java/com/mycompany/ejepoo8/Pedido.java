/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejepoo8;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Pedido {
    int numero;
    String fecha,cliente;
    Plato plato;

    public Pedido(int numero, String fecha,String cliente,Plato plato){

        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        this.plato = plato;

    }

    public void mostrarinformacion(){

        System.out.println("pedido");
        System.out.println("numero " + numero);
        System.out.println("fecha " + fecha);
        System.out.println("cliente " + cliente);

        plato.mostrarinformacion();

    }

}

