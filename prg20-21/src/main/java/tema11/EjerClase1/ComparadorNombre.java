/*
 * Clase
 */
package tema11.EjerClase1;

import java.util.Comparator;

/**
 *
 * @author JFSam
 */
public class ComparadorNombre implements Comparator{

    @Override
    public int compare(Object arg0, Object arg1) {
        Alumno aux1 = (Alumno) arg0;
        Alumno aux2 = (Alumno) arg1;
        int dif;
        
        dif = aux1.getNombre().compareTo(aux2.getNombre());
        return dif;
    }
    
}
