import src.pakete.Usuario;
import java.lang.Math;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite su edad: ");
        int edad = entrada.nextInt(); 
        
        Usuario usuario1 = new Usuario(edad);

        usuario1.Datos("hola");



      
    }

}
