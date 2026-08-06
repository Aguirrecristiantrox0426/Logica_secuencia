/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejepoo7;

import java.util.Scanner;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class MainMascota {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("ingrese el nombre de la mascota ");
        String nombre = teclado.nextLine();

        System.out.print("ingrese la especie ");
        String especie = teclado.nextLine();

        System.out.print("ingrese la edad ");
        int edad = teclado.nextInt();

        System.out.print("ingrese el peso ");
        double peso = teclado.nextDouble();
        teclado.nextLine(); 

        System.out.print("ingrese el nombre del propietario ");
        String propietario = teclado.nextLine();

        Mascota mascota1 = new Mascota(nombre, especie, edad, peso, propietario);

        System.out.println("informacion de la mascota");
        mascota1.mostrarinformacion();

        // Registrar consulta médica
        mascota1.registrarconsulta();

        System.out.println("\nInformación final:");
        mascota1.mostrarinformacion();

    }

}
    

