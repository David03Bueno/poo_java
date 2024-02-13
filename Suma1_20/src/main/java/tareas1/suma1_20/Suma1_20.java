/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tareas1.suma1_20;

/**
 *
 * @author david
 * @Matricula 2023-0243
 */
public class Suma1_20 {

    public static void main(String[] args) {
        //4. Realizar un programa que imprima la sumatoria de los números del 1 al 20 utilizando ciclos "do while"
        System.out.println("sumatoria de los números del 1 al 20 ");
        int num1 = 0;
        int suma = 0;
        do {
            num1++;
            suma += num1;
        } while (num1 < 20);

        System.out.println("La sumatoria es: " + suma);
    }
}
