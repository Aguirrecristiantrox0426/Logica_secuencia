/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejepoo8;

import java.util.Scanner;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class MainPedido {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("ingrese el nombre del plato ");
        String nombrePlato = teclado.nextLine();

        System.out.print("ingrese el precio del plato ");
        double precio = teclado.nextDouble();
        teclado.nextLine(); 
        
        Plato plato1 = new Plato(nombrePlato, precio);

        System.out.print("ingrese el numero del pedio ");
        int numero = teclado.nextInt();
        teclado.nextLine(); 

        System.out.print("ingrese la fecha del pedido ");
        String fecha = teclado.nextLine();

        System.out.print("ingrese el nombre del pedido ");
        String cliente = teclado.nextLine();

        Pedido pedido1 = new Pedido(numero, fecha, cliente,plato1);

        System.out.println("informacion del pedido ");
        pedido1.mostrarinformacion();

    }

}
    

