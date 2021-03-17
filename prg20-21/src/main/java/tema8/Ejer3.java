/*
 * Ejercicio 3.
 * Introducir por teclado, hasta que se introduzca “fin”, una serie de nombres que se insertarán
 * en una colección, de forma que se conserve el orden de inserción pudiendo repetirse. Mostrar
 * la lista por pantalla.
 */
package tema8;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author JSam
 */
public class Ejer3 {

    public static void main(String[] args) {
        LinkedList<String> nombres;

        nombres = rellenar();
        System.out.println("La lista de nombres es:");
        mostrar(nombres);

    }

    private static LinkedList<String> rellenar() {
        LinkedList<String> aux = new LinkedList();
        Scanner teclado = new Scanner(System.in);
        String nombre;
        boolean a = true;

        do {
            System.out.println("Introduce un nombre, cuando quieras acabar introduce la palabra fin.");
            nombre = teclado.nextLine();
            if (nombre.equals("fin")) {
                a = false;
            }else{
                aux.add(nombre);
            }
        } while (a);
        return aux;
    }

    private static void mostrar(Collection colecion) {
        Iterator<String> it = colecion.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
