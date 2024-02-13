/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.tarea1;

/**
 *
 * @author david
 */
public class Procesos {

    public void NomCore(String Nombre, String Correo) {
        System.out.println("Tu Nombre es : " + Nombre);
        System.out.println("Tu Correo Electronico es : " + Correo + "\n");
    }

    public void Num1_10(int Num) {
        System.out.println("Los Numero del 1 al 10");

        for (int i = 0; i <= Num; i++) {
            System.out.print(i + ",");
        }
    }

    public void NumPares(int num) {
        System.out.println("\n\nPares del 2 al 10");
        int iterador = 0;

        while (iterador <= 10) {
            iterador += 2;
            System.out.print(iterador + ",");
        }
    }

    public void Suma1_20(int Num) {
        System.out.println("\n\nSumatoria de los números del 1 al 20 ");
        Num = 0;
        int suma = 0;
        do {
            Num++;
            suma += Num;
        } while (Num < 20);

        System.out.println("La sumatoria es: " + suma);
    }

}
