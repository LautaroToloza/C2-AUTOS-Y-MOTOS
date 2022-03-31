package ar.com.lautaro.comparador;

import ar.com.lautaro.clases.Motos;
import java.util.Comparator;

public class ComparadorMotos implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Motos motoUno = (Motos) o1;
        Motos motoDos = (Motos) o2;
        return motoUno.getPatente().toLowerCase().compareTo(motoDos.getPatente().toLowerCase());
    }

}
