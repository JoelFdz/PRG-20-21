/*
 * Ejercicio 6
 * Introducir por consola una frase que conste exclusivamente de palabras separadas por
 * espacios. Almacenar en una lista las palabras de la frase, una en cada nodo y mostrar por
 * pantalla las palabras que estén repetidas. A continuación, mostrar las que no estén.
 */
package tema8;

import java.util.*;

/**
 *
 * @author JFSam
 */
public class Ejer6 {

    public static void main(String[] args) {
        ArrayList<String> lista;

        lista = rellenar(meterfrase());
        System.out.println("Palabras repetidas.");
        mostrar(repes(lista));
        System.out.println("Palabras sin repetir");
        mostrar(noRepes(lista));
    }

    private static String meterfrase() {
        Scanner teclado = new Scanner(System.in);
        String x;

        System.out.println("Introduce una frase con palabras separadas por espacios.");
        x = teclado.nextLine();
        return x;
    }

    private static ArrayList<String> rellenar(String a) {
        ArrayList<String> aux = new ArrayList();
        String cadena = a;
        String[] split = cadena.split(" ");

        for (int i = 0; i < split.length; i++) {
            aux.add(split[i]);
        }
        return aux;
    }

    private static Collection repes(List colecion) {
        HashSet<String> aux = new HashSet();

        for (int i = 0; i < colecion.size(); i++) {
            for (int j = 0; j < colecion.size(); j++) {
                if (colecion.get(i).equals(colecion.get(j)) && i != j) {
                    aux.add((String) colecion.get(i));
                }
            }
        }

        return aux;
    }

    private static Collection noRepes(List colecion) {
       HashSet<String> aux = new HashSet();
       
       colecion.removeAll(repes(colecion));
       aux.addAll(colecion);
       
       return aux;
    }
    
    private static void mostrar(Collection colecion) {
        Iterator<String> it = colecion.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
