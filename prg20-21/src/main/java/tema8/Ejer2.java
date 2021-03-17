/*
 * Ejercicio 2.
 * Crea una colección de 20 números enteros aleatorios menores de 25 pudiendo haber
 * repetidos. Recorre dicha colección mostrando aquellos números que sean menores de 10.
 */
package tema8;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author JSam
 */
public class Ejer2 {

    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet();
        
        rellenar(numeros);
        mostrar(numeros);
        System.out.println("");
        mostrarMenos10(numeros);
    }

    private static void rellenar(HashSet numeros) {
        int n;
        for (int i = 0; i < 20; i++) {
            n = (int) (Math.random() * 25);
            numeros.add(n);
        }
    }

    private static void mostrar(HashSet numeros) {
        Iterator it = numeros.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    private static void mostrarMenos10(HashSet numeros) {
        Iterator<Integer> it = numeros.iterator();
        Integer x;
        
        while (it.hasNext()) {
            x = it.next();
            if (x < 10) {
                System.out.println(x);
            }
        }
    }
}
