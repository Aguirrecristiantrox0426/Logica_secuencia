package ejercicio1;


import ejercicio1.Libro;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Mainlibro {
    
    public static void main(String[] args){
        
        Scanner teclado=new Scanner (System.in);
        
        Libro libro1 = new Libro();
        
        System.out.println("reguitra el nombre del libro ");
        libro1.titulo=teclado.nextLine();
        
        System.out.println("reguistre el nombre del autor ");
        libro1.autor=teclado.nextLine();
        
        System.out.println("reguistre el numero de paginas ");
        libro1.numeropagina=teclado.nextInt();
        
        System.out.println();
        
        libro1.mostrarinformacion();
        
    }
}
