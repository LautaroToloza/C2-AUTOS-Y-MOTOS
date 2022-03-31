package ar.com.lautaro.comparador;

import ar.com.lautaro.clases.Autos;
import java.util.*;

public class ComparadorAutos implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Autos autoUno = (Autos) o1;
        Autos autoDos = (Autos) o2;
        return autoUno.getPatente().toLowerCase().compareTo(autoDos.getPatente().toLowerCase());
    }

}
