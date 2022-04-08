package ar.com.lautaro.test;

import ar.com.lautaro.clases.*;
import ar.com.lautaro.comparador.*;
import java.util.*;

/**
 * @author Lautaro Toloza
 */
public class Test {

    public static void main(String[] args) {
//       
//        Hacer una clase Autos que reciba como parametro patente y numero de chasis,
//        hacer otra clase Motos igual.En un proyecto generar con la nomenclatura correcta 
//        los necesarios comparadores para en testUno dejarlo ordenado por patente y en testDos por numero Chasis;
//        1)patente String, 2)numeroChasis int.

        // Lista Auto
        List<Autos> auto = new ArrayList<>();
        Autos a1 = new Autos(20059, "ARG79");
        Autos a2 = new Autos(50507, "HIJ93");
        Autos a3 = new Autos(19348, "LTT21");
        auto.add(a1);
        auto.add(a2);
        auto.add(a3);
        // Lista Moto
        List<Motos> moto = new ArrayList<>();
        Motos m1 = new Motos(5091, "FRM23");
        Motos m2 = new Motos(3007, "MLA23");
        Motos m3 = new Motos(2893, "JLM23");
        moto.add(m1);
        moto.add(m2);
        moto.add(m3);

        // Muestra de resultados
        testUno(auto, moto);
        System.out.println("\n");
        testDos(auto, moto);

    }

    public static void testUno(List auto, List moto) {
        System.out.println("Lista ordenada por patente... \n");
        // Autos
        ComparadorAutos ca = new ComparadorAutos();
        Collections.sort(auto, ca);
        System.out.println(auto);

        // Motos
        ComparadorMotos cm = new ComparadorMotos();
        Collections.sort(moto, cm);
        System.out.println(moto);

    }

    public static void testDos(List auto, List moto) {
        System.out.println("Lista ordenada por número de chasis...\n");
        // Autos
        Collections.sort(auto);
        System.out.println(auto);

        // Motos
        Collections.sort(moto);
        System.out.println(moto);
    }
}
