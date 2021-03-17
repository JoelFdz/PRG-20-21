/*
 * Ejercicio 4.
 * Implementa un método llamado limpiaRepetidos a la que se le pase una lista de nombres y
 * devuelva una copia sin elementos repetidos. Realizaremos dos versiones, una que retorne una
 * colección nueva sin repetidos y otra que modifique la recibida como parámetro.
 */
package tema8;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author JSam
 */
public class Ejer4 {

    public static void main(String[] args) {
       LinkedList<String> nombres;

        nombres = rellenar();
        mostrar(nombres);
        System.out.println("Lista sin repetidos 1º:");
        mostrar(limpiarRepes(nombres));
        nombres = rellenar();
        System.out.println("");
        System.out.println("Lista sin repetidos 2º:");
        mostrar(limpiarRepes2(nombres));

    }

    private static LinkedList<String> rellenar() {
        LinkedList<String> aux = new LinkedList();

        aux.add("Joel");
        aux.add("Edu");
        aux.add("Diego");
        aux.add("Samuel");
        aux.add("Joel");
        aux.add("Joel");
        aux.add("Samuel");
        aux.add("Jesus");
        aux.add("Juan");
        aux.add("Marcos");

        return aux;
    }

    private static Collection<String> limpiarRepes(Collection<String> colecion) {
        HashSet<String> aux = new HashSet();

        aux.addAll(colecion);
        return aux;
    }

    private static Collection<String> limpiarRepes2(LinkedList<String> colecion) {

        for (int i = 0; i < colecion.size(); i++) {
            for (int j = 0; j < colecion.size(); j++) {
                if (colecion.get(i).equals(colecion.get(j)) && i != j) {
                    colecion.remove(i);
                }
            }
        }
        return colecion;

    }


    private static void mostrar(Collection colecion) {
        Iterator<String> it = colecion.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

