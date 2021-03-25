/*
 * ordenar de edad mayor a menor.
 */
package tema11.Ejer3;

import java.util.Comparator;
import tema11.Ejer2.Cliente;

/**
 *
 * @author JFSam
 */
public class OrdenacionPorEdadDeMayorAMenor implements Comparator{

    @Override
    public int compare(Object arg0, Object arg1) {
        Cliente aux1 = (Cliente) arg0;
        Cliente aux2 = (Cliente) arg1;
        
       if (aux1.getEdad() > aux2.getEdad()) {
            return 1;
        } else if (aux1.getEdad() < aux2.getEdad()) {
            return -1;
        } else {
            return 0;
        }
    }
    
}
