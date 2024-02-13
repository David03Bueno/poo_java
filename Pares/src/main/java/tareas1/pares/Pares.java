/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tareas1.pares;

/**
 *
 * @author david
 * @Matricula 2023-0243
 */
public class Pares {

    public static void main(String[] args) {
        //3. Realizar un programa que imprima los números pares del 2 al 10 utilizando ciclos "while".
        System.out.print("pares del 2 al 1");
        int iterador = -1;

        while (iterador < 10) {
            iterador ++;
            if(iterador % 2 == 0){
            System.out.println(iterador);
            }
        }
    }
}