package src.pakete;

public class Usuario {
    String Nombre;
    String Apellido;
    String Direccion;
    int edad;

    public Usuario(String Nombre, String Apellido, String Direccion, int edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.edad = edad;
    }

    public Usuario(int edad){
        this.edad = edad;
    }


    public void Datos() {
        System.out.println("Sus datos: \n");

        System.out.println("Su Nombre es: " + Nombre);
        System.out.println("Su Apellido es: " + Apellido);
        System.out.println("Su Direccion es: " + Direccion);
        System.out.println("Su Edad es: " + edad);

    }

    public void Datos(String saludo){
        System.out.println("Sus datos: \n");

        System.out.println("Su Edad es: " + edad);
    }
}
