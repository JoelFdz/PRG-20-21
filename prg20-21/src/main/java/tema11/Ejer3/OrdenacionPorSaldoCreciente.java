/*
 * Ordenar clientes por saldo creciente.
 */
package tema11.Ejer3;

import java.util.Comparator;
import tema11.Ejer2.Cliente;

/**
 *
 * @author JFSam
 */
public class OrdenacionPorSaldoCreciente implements Comparator{

    @Override
    public int compare(Object arg0, Object arg1) {
        Cliente aux1 = (Cliente) arg0;
        Cliente aux2 = (Cliente) arg1;
        
        if (aux1.getSaldo() > aux2.getSaldo()) {
            return 1;
        } else if (aux1.getSaldo() < aux2.getSaldo()) {
            return -1;
        } else {
            return 0;
        }
    }
    
}
