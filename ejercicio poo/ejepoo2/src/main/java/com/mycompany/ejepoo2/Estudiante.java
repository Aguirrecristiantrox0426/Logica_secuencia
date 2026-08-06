/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejepoo2;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Estudiante {
    String nombre,grado;
    int edad;
    
    public Estudiante(String nombre,String grado,int edad){
    
    this.nombre=nombre;
    this.grado=grado;
    this.edad=edad;
  }
    public void mostrarinformacion(){
        System.out.println("estudiante");
        System.out.println("nombre del estudiante "+nombre);
        System.out.println("el grado del estudiante "+grado);
        System.out.println("edad del estudiante es "+edad);
    }
}
