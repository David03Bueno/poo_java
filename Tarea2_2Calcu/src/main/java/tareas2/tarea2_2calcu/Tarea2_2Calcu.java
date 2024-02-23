/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tareas2.tarea2_2calcu;

import java.util.Scanner;

/**
 *
 * @author david
 * @matricula 2023-0243
 */
public class Tarea2_2Calcu {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        Calculadora objeto = new Calculadora();

        //OBJETO CON DOS PARAMETROS
        System.out.print("Digite un numero: ");
        int num1 = Entrada.nextInt();
        System.out.print("Digite un numero: ");
        int num2 = Entrada.nextInt();

        System.out.println("La suma es: " + objeto.suma(num1, num2));
        System.out.println("La resta es: " +objeto.restar(num1, num2));
        System.out.println("La Multiplicacion es: " +objeto.multiplicar(num1, num2));
        System.out.println("La Divicion es: " +objeto.dividir(num1, num2) + "\n");

        //----------------------------------------------------------------------
        //OBJETO CON TRES PARAMETROS
        System.out.print("Digite un numero: ");
        int nume1 = Entrada.nextInt();
        System.out.print("Digite un numero: ");
        int nume2 = Entrada.nextInt();
        System.out.print("Digite un numero: ");
        int nume3 = Entrada.nextInt();

        System.out.println("La suma es: " + objeto.suma(nume1, nume2, nume3));
        System.out.println("La resta es: " +objeto.restar(nume1, nume2, nume3));
        System.out.println("La Multiplicacion es: " +objeto.multiplicar(nume1, nume2, nume3) + "\n");

        //----------------------------------------------------------------------
        //OBJETO CON CUATRO PARAMETROS
        System.out.print("Digite un numero: ");
        int numer1 = Entrada.nextInt();
        System.out.print("Digite un numero: ");
        int numer2 = Entrada.nextInt();
        System.out.print("Digite un numero: ");
        int numer3 = Entrada.nextInt();
        System.out.print("Digite un numero: ");
        int numer4 = Entrada.nextInt();
        
        System.out.println("La suma es: " + objeto.suma(numer1, numer2, numer3,numer4));
        System.out.println("La resta es: " +objeto.restar(numer1, numer2, numer3,numer4));
        System.out.println("La Multiplicacion es: " +objeto.multiplicar(numer1, numer2, numer3,numer4) + "\n");

    }
}
