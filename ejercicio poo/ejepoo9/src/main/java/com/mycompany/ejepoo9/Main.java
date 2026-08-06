/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejepoo9;

import java.util.Scanner;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("ingrese el nombre del estudiante ");
        String nombre = teclado.nextLine();

        System.out.print("ingrese el codigo del estudiante ");
        String codigo = teclado.nextLine();
                
        Estudiante estudiante1 = new Estudiante(nombre, codigo);

        System.out.print("ingrese el nombre de la asignatura ");
        String nombreAsignatura = teclado.nextLine();

        System.out.print("ingrese la cantidad de ceditos ");
        int creditos = teclado.nextInt();

        Asignatura asignatura1 = new Asignatura(nombreAsignatura, creditos);

        Inscripccion inscripcion1 = new Inscripccion(estudiante1, asignatura1);

        System.out.println("\nInformación de la inscripción:");

        inscripcion1.mostrarinformacion();

    }

}
    

