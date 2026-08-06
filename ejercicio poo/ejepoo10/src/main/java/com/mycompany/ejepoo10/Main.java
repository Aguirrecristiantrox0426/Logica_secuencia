/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejepoo10;

import java.util.Scanner;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("ingrese el nombre del cliente ");
        String nombre = teclado.nextLine();

        System.out.print("ingrese el correo ");
        String correo = teclado.nextLine();

        System.out.print("ingrese la identificacion ");
        String identificacion = teclado.nextLine();

        Cliente cliente1 = new Cliente(nombre, correo, identificacion);

        System.out.print("ingrese el numero de la compra ");
        int numero = teclado.nextInt();
        teclado.nextLine();

        System.out.print("ingrese la fecha de la compra ");
        String fecha = teclado.nextLine();

        System.out.print("cuantos productos desea reguistrar ");
        int cantidadProductos = teclado.nextInt();
        teclado.nextLine();

        Producto[] productos = new Producto[cantidadProductos];

        for (int i = 0; i < cantidadProductos; i++) {

            System.out.println("producto " + (i + 1));

            System.out.print("nombre ");
            String nombreProducto = teclado.nextLine();

            System.out.print("precio ");
            double precio = teclado.nextDouble();

            System.out.print("cantidad ");
            int cantidad = teclado.nextInt();
            teclado.nextLine();

            productos[i] = new Producto(nombreProducto, precio, cantidad);

        }

        Compra compra1 = new Compra(numero, fecha, cliente1, productos);

        System.out.println("factura ");

        compra1.mostrarinformacion();

    }

}
    
