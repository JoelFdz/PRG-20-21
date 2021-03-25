/*
 * Clase compador
 */
package tema11.EjerClase1;

import java.util.Comparator;

/**
 *
 * @author JFSam
 */
public class ComparadorNotaMedia implements Comparator {

    @Override
    public int compare(Object arg0, Object arg1) {
        Alumno aux1 = (Alumno) arg0;
        Alumno aux2 = (Alumno) arg1;

        if (aux1.getNotaMedia() > aux2.getNotaMedia()) {
            return 1;
        } else if (aux1.getNotaMedia() < aux2.getNotaMedia()) {
            return -1;
        } else {
            return 0;
        }

    }

}
