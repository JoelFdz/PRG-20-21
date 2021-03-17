/*
 * Ejercicio 7
 * Implementar el método de unión de dos conjuntos, que devuelva un nuevo conjunto con
 * todos los elementos que pertenezcan, al menos, a uno de los dos conjuntos.
 */
package tema8;

import java.util.*;

/**
 *
 * @author JFSam
 */
public class Ejer7 {
    public static void main(String[] args) {
        HashSet<Integer> conjunto1;
        HashSet<Integer> conjunto2;
        
        conjunto1 = (HashSet<Integer>) rellenar();
        conjunto2 = (HashSet<Integer>) rellenar();
        System.out.println("Conjunto1:");
        mostrar(conjunto1);
        System.out.println("Conjunto2:");
        mostrar(conjunto2);
        System.out.println("El cojunto resultante es: ");
        mostrar(union(conjunto1, conjunto2));
        
    }
    
    private static Collection rellenar(){
        HashSet<Integer> aux = new HashSet();
        int n;
        for (int i = 0; i < 5; i++) {
            n = (int) (Math.random() * 10);
            aux.add(n);
        }
        return aux;
    }
    
    private static Set union(Set conjunto1, Set conjunto2){
        HashSet<Integer> aux = new HashSet();
        aux.addAll(conjunto1);
        aux.addAll(conjunto2);
        
        return aux;
    }
    
    private static void mostrar(Collection colecion) {
        Iterator<Integer> it = colecion.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
