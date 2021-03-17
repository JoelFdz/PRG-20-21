/*
 * Ejercicio 1
 * Crea una colección de 20 números enteros aleatorios menores de 100 y guárdalos en el orden
 * en que se vayan generando mostrar por pantalla dicha lista una vez creada. Ordenarla en
 * sentido creciente y volverla a mostrar por pantalla.
 */
package tema8;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author JSam
 */
public class Ejer1 {

    public static void main(String[] args) {
        HashSet<Integer> numeros;
        TreeSet<Integer> orden;        
           
        numeros = rellenar();
        mostrar(numeros);
        orden = copiar(numeros);
        System.out.println("Ordenado queda.");
        mostrar(orden);

    }

    private static HashSet<Integer> rellenar() {
        HashSet<Integer> edd = new HashSet<Integer>();
        int n;
                
        for (int i = 0; i < 20; i++) {
            n = (int) (Math.random() * 100);
            edd.add(n);
        }
        return edd;
    }

    private static TreeSet<Integer> copiar(HashSet numeros) {
        TreeSet<Integer> aux = new TreeSet<Integer>(numeros);
        return aux;       
    }

    private static void mostrar(Collection<Integer> numeros) {
        Iterator<Integer> it = numeros.iterator();
        
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

   
}
