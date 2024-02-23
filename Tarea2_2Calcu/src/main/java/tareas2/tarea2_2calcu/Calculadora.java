/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas2.tarea2_2calcu;

/**
 *
 * @author david
 * @matricula 2023-0243
 */
public class Calculadora {
//Metodos con dos parametros

    public int suma(int num1, int num2) {
        return  num1 + num2;
    }

    public int restar(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public int dividir(int num1, int num2) {
        return num1 / num2;
    }

    //-----------------------------------------------------------------------------   
    //Sobrecarga con tres parametros
    public int suma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public int restar(int num1, int num2, int num3) {
        return num1 - num2 - num3;
    }

    public int multiplicar(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    //-----------------------------------------------------------------------------   
    //Sobrecarga con cuatro parametros
    public int suma(int num1, int num2, int num3,int num4) {
        return num1 + num2 + num3 + num4;
    }

    public int restar(int num1, int num2, int num3, int num4) {
        return num1 - num2 - num3 - num4;
    }

    public int multiplicar(int num1, int num2, int num3,int num4) {
        return num1 * num2 * num3 * num4;
    }

}
