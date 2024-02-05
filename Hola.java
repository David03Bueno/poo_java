/**
 * Hola
 */


class Vehiculo {
  String marca = "Toyota";
  String modelo;
  String ano;
  int num;

  public void empre() {
    // System.out.println("La Marca es: " + marca);
    // System.out.println("El Modelo es: " + modelo);
    // System.out.println("El año es: " + ano);

    if (num % 2 == 0) {
      System.out.println("Es par");
    } else {
      System.out.println("Es impar");

    }

  }

}

public class Hola {

  public static void main(String[] args) {
    Vehiculo Carro1 = new Vehiculo();
    Vehiculo Carro2 = new Vehiculo();

    Carro1.modelo = "Camrry";
    Carro1.ano = "2000";

    Carro2.modelo = "Corolla";
    Carro2.ano = "1990";

    Carro1.num = 38;

    Carro1.empre();

    // System.out.println("\n");

    // Carro2.empre();

  }
}