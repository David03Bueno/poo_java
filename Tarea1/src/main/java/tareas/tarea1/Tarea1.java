/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tareas.tarea1;

/**
 *
 * @author david
 */
public class Tarea1 {

    public static void main(String[] args) {

        //1. Realizar un programa que imprima en pantalla su nombre y su correo electrónico.
        /* String Nombre = "Luis David";
       String Correo = "david03bueno@gmai.com";
       
       System.out.println("Mi Nombre es: " + Nombre);
       System.out.print("Mi Correo es: " + Correo + "\n\n");*/ // AQUI LO HICE NORMAL
        Procesos Datos = new Procesos();
        Datos.NomCore("David", "Luis02@hotmail.com"); // Y AQUI DECIDI CREAR UN OBJETO Y PASARLE LOS DATOS A UNA FUNCION.

        //----------------------------------------------------------------------------------------------------------------------  
        //2. Realizar un programa que imprima los números del 1 al 10 utilizando ciclos "for".
        /*System.out.print("números del 1 al 10");
        for(int i = 0; i <=10; i++)
            System.out.println(i);*/ // AQUI LO HICE NORMAL
        Datos.Num1_10(10); // Y AQUI DECIDI CREAR UN OBJETO Y PASARLE LOS DATOS A UNA FUNCION.

        //------------------------------------------------------------------------------------------------------------------------
        //3. Realizar un programa que imprima los números pares del 2 al 10 utilizando ciclos "while".
        /* System.out.print("pares del 2 al 10"); 
        int iterador = 0;
         
         while(iterador < 10){
             iterador += 2;
             System.out.println(iterador); // AQUI LO HICE NORMAL
         }*/
        Datos.NumPares(10);// Y AQUI DECIDI CREAR UN OBJETO Y PASARLE LOS DATOS A UNA FUNCION.

        //----------------------------------------------------------------------------------------------------------------------------
        //4. Realizar un programa que imprima la sumatoria de los números del 1 al 20 utilizando ciclos "do while"
        /* System.out.println("sumatoria de los números del 1 al 20 ");
             int num1 =0;
             int suma =0;
             do{
              num1++;
              suma += num1;
             }while(num1<20);

             System.out.println("La sumatoria es: " + suma);// AQUI LO HICE NORMAL
         */
        Datos.Suma1_20(20); // Y AQUI DECIDI CREAR UN OBJETO Y PASARLE LOS DATOS A UNA FUNCION.
    }

}
