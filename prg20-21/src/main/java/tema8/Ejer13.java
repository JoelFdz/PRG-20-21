/*
 * Ejercicio 13.
 * Realiza un pequeño ejemplo en java que haga uso, de cada uno de los métodos-algoritmo
 * siguiente de la clase Collections, como mínimo los métodos a probar serán los siguientes:
 * ● Ordenación (Sorting) ->; sort
 * ● Barajado (Shuffling) ->; shuffle
 * ● Manipulación de datos de rutina ->; reserver / swap / copy / addAll / fill
 * ● Búsqueda (Searching) ->; binarySearch
 * ● Composición ->; frequency / disjoint
 * ● Búsqueda de valores extremos ->; max/min
 */
package tema8;

import java.util.*;

/**
 *
 * @author JFSam
 */
public class Ejer13 {

    public static void main(String[] args) {
        pruebaMetodos();
    }

    private static void pruebaMetodos() {
        pruebaSort();
        pruebaShuffle();
        pruebaReverse();
        pruebaSwap();
        pruebaCopy();
        pruebaFill();
        pruebaBinarySearch();
        pruebaFrequency();
        pruebaDisjoint();
        pruebaMax();
        pruebaMin();
    }
    private static List añadir() {
        List<String> aux = new LinkedList();

        aux.add("Ejemplo2");
        aux.add("Ejemplo1");
        aux.add("Ejemplo3");
        aux.add("Ejemplo5");
        aux.add("Ejemplo7");
        aux.add("Ejemplo6");
        aux.add("Ejemplo4");
        aux.add("Ejemplo2");

        return aux;
    }

    private static List añadir2() {
        List<String> aux = new LinkedList();

        aux.add("1");
        aux.add("2");
        aux.add("3");
        aux.add("4");
        aux.add("4");
        aux.add("4");
        aux.add("5");
        aux.add("6");
        aux.add("7");

        return aux;
    }

    private static void pruebaSort() {
        List<String> ejemplo = new LinkedList();
        ejemplo.addAll(añadir());

        Collections.sort(ejemplo);
        System.out.println("Elementos ordenados:");
        for (String str : ejemplo) {
            System.out.println(str);
        }
        System.out.println("");
    }

    private static void pruebaShuffle() {
        List<String> ejemplo = new LinkedList();
        ejemplo.addAll(añadir());

        Collections.shuffle(ejemplo);
        System.out.println("Elementos tras el shuffle:");
        for (String str : ejemplo) {
            System.out.println(str);
        }
        System.out.println("");
    }

    private static void pruebaReverse() {
        List<String> ejemplo = new LinkedList();
        ejemplo.addAll(añadir());

        Collections.reverse(ejemplo);
        System.out.println("Elementos tras el reverse.");
        for (String str : ejemplo) {
            System.out.println(str);
        }
        System.out.println("");
    }

    private static void pruebaSwap() {
        List<String> ejemplo = new LinkedList();
        ejemplo.addAll(añadir());

        Collections.swap(ejemplo, 1, 6);
        System.out.println("Elementos tras el swap.");
        for (String str : ejemplo) {
            System.out.println(str);
        }
        System.out.println("");
    }

    private static void pruebaCopy() {
        List<String> ejemplo = new LinkedList();
        List<String> ejemplo2 = new LinkedList();
        ejemplo.addAll(añadir());
        ejemplo2.add("ADIOS");
        ejemplo2.add("ESTA COPIADO");
        ejemplo2.add("HEY BRO");

        Collections.copy(ejemplo, ejemplo2);
        System.out.println("Lista copiada");
        for (String str : ejemplo) {
            System.out.println(str);
        }
        System.out.println("");
    }

    private static void pruebaFill() {
        List<String> ejemplo = new LinkedList();
        ejemplo.addAll(añadir());

        Collections.fill(ejemplo, "HEY");
        System.out.println("Lista tras el fill");
        for (String str : ejemplo) {
            System.out.println(str);
        }
        System.out.println("");
    }

    private static void pruebaBinarySearch() {
        List<String> ejemplo = new LinkedList<>();
        ejemplo.addAll(añadir());
        
        System.out.println("Busqueda del indice del Ejemplo 1");
        Collections.sort(ejemplo);
        for (String str : ejemplo) {
            System.out.println(str);
        }
        int index = Collections.binarySearch(ejemplo, "Ejemplo 1");
        System.out.println("Indice del ejemplo buscado" + index);
    }

    private static void pruebaFrequency() {
        List<String> ejemplo = new LinkedList();
        ejemplo.addAll(añadir());
        
        System.out.println("Prueba del Frequency");
        System.out.println(Collections.frequency(ejemplo, "Ejemplo 2"));
    }

    private static void pruebaDisjoint() {
        List<String> ejemplo = new LinkedList();
        List<String> ejemplo2 = new LinkedList();
        ejemplo.addAll(añadir());
        ejemplo2.addAll(añadir2());

        System.out.println("Prueba del Disjoint");
        System.out.println(Collections.disjoint(ejemplo, ejemplo2));
    }

    private static void pruebaMax() {
        List<String> ejemplo = new LinkedList();
        ejemplo.addAll(añadir2());

        System.out.println("Maximo de la colección");
        System.out.println(Collections.max(ejemplo));
    }

    private static void pruebaMin() {
        List<String> ejemplo = new LinkedList();
        ejemplo.addAll(añadir2());

        System.out.println("Minimo de la colección");
        System.out.println(Collections.min(ejemplo));
    }

}
