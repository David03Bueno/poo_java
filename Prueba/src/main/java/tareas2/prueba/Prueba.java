/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tareas2.prueba;

/**
 *
 * @author david
 * @matricula 2023-0243
 */
public class Prueba {

    public static void main(String[] args) {

        Tv Television1 = new Tv(); // OBJETO 1
        //ASIGNACION DE VALORES
        Television1.MarcaTv = "samsung";
        Television1.TipoTV = "Tv de  Cable";
        Television1.PulgadasTv = 32;
        Television1.ColorTv = "Gris";
        //INVONCANDO LOS METODOS
        Television1.MarcaTv();
        Television1.Tipo();
        Television1.Pulgadas();
        Television1.Color();

        //----------------------------------------------------------------------
        Tv Television2 = new Tv(); // OBJETO 2

        //ASIGNACION DE VALORES
        Television2.MarcaTv = "LG";
        Television2.TipoTV = "3D";
        Television2.PulgadasTv = 21;
        Television2.ColorTv = "Blanca";

        //INVONCANDO LOS METODOS
        Television2.MarcaTv();
        Television2.Tipo();
        Television2.Pulgadas();
        Television2.Color();

        //----------------------------------------------------------------------
        Tv Television3 = new Tv(); // OBJETO 3

        //ASIGNACION DE VALORES
        Television3.MarcaTv = "Roku";
        Television3.TipoTV = "Full HD";
        Television3.PulgadasTv = 32;
        Television3.ColorTv = "Negra";

        //INVONCANDO LOS METODOS
        Television3.MarcaTv();
        Television3.Tipo();
        Television3.Pulgadas();
        Television3.Color();

    }
}
