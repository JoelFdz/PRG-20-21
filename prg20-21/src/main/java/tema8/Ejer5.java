/*
 * Ejercicio 5.
 * Realiza un programa en Java que recoja las edades de los alumnos de los grupos de 1MULTIWEB, 2MULTIWEB y 1DAW. Para ello se deberá almacenar en una colección (a definir por el alumno) 
 * que a su vez tenga 3 colecciones internamente. Posteriormente mostrar el listado de las edades con un encabezado (ver ejemplo posterior) y la media de edad por cada grupo.Ejemplo:
* Alumno s de 1ºMULTIWEB
* 18, 19, 20, 20 ….
* Media de edad: 21.30
* Alumno s de 2ºMULTIWEB
* 20, 39, 19, 26 ….
* Media de edad: 24.30
* ...
 */
package tema8;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author JSam
 */
public class Ejer5 {

    public static void main(String[] args) {
        LinkedList<Collection> iescomercio = new LinkedList();
        rellenarLista(iescomercio);
        System.out.println("Edades de 1ºMULTIWEB:");
        mostrar(iescomercio.get(0));
        System.out.println("Edades de 2ºMULTIWEB:");
        mostrar(iescomercio.get(1));
        System.out.println("Edades de 1ºDAW:");
        mostrar(iescomercio.get(2));

    }

    private static void rellenarLista(LinkedList colecion) {
        ArrayList<Integer> multiweb1 = new ArrayList();
        ArrayList<Integer> multiweb2 = new ArrayList();
        ArrayList<Integer> daw1 = new ArrayList();

        rellenarEdades(multiweb1);
        rellenarEdades(multiweb2);
        rellenarEdades(daw1);

        colecion.add(multiweb1);
        colecion.add(multiweb2);
        colecion.add(daw1);

    }

    private static void rellenarEdades(Collection colecion) {
        Scanner teclado = new Scanner(System.in);
        int n, x;
        System.out.println("Cuantos alumnos tiene la clase:");
        x = teclado.nextInt();
        for (int i = 0; i < x; i++) {
            n = (int) (Math.random() * 25);
            colecion.add(n);
        }
    }

    private static void mostrar(Collection colecion) {
        DecimalFormat df = new DecimalFormat("#.00");
        Iterator<Integer> it = colecion.iterator();
        int x;
        while (it.hasNext()) {
            x = (Integer) it.next();
            System.out.print(x + " ");
        }
        System.out.println("");
        System.out.println("La media de edad es de: " + df.format(calcularMedia((ArrayList) colecion)));
    }

    private static float calcularMedia(ArrayList colecion) {
        float media;
        int acumulador = 0;
        for (int i = 0; i < colecion.size(); i++) {
            acumulador = acumulador + (int) colecion.get(i);
        }
        media = ((float) acumulador / colecion.size());
        return media;
    }
}
