/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejepoo9;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Inscripccion {

    Estudiante estudiante;
    Asignatura asignatura;

    public Inscripccion(Estudiante estudiante, Asignatura asignatura) {

        this.estudiante = estudiante;
        this.asignatura = asignatura;

    }

    public void mostrarinformacion() {

        System.out.println("inscripccion ");

        estudiante.mostrarinformacion();
        asignatura.mostrarinformacion();

    }

}

