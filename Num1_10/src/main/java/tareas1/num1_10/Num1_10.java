/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tareas1.num1_10;

import java.util.Scanner;

/**
 *
 * @author david
 * @matricula 2023-0243
 */
public class Num1_10 {

    public static void main(String[] args) {
        
        //1. Realizar un programa que imprima en pantalla su nombre y su correo electrónico.
        Scanner conexion = new Scanner(System.in);
        
       System.out.println("Digite su Nombre: " );
       String Nombre = conexion.next();
       
       System.out.println("Digite su Correo: " );
       String Correo = conexion.next();
       
       System.out.println("Mi Nombre es: " + Nombre);
       System.out.print("Mi Correo es: " + Correo + "\n\n");
    }
}
