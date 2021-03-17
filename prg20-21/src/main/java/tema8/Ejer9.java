/*
 * Ejercicio 9.
 * Para ir a ver la película "Dolor y Gloria" hay dos filas de espectadores. Un acomodador es el
 * encargado de dejar entrar a la gente. Sus instrucciones son simples: "Tiene que dejar entrar
 * siempre al espectador que es mayor de entre las dos colas, si tienen la misma edad, las
 * personas de la fila 1 tiene preferencia". Ten en cuenta, que si acomodas a un espectador el NO
 * elegido sigue estando en la otra cola esperando para volver a ser comparado nuevamente.
 * Almacena previamente en las dos colas 5 enteros en cada una que representen las edades de
 * dichos espectadores.
 */
package tema8;

import java.util.*;

/**
 *
 * @author JFSam
 */
public class Ejer9 {
    
    public static void main(String[] args) {
        ArrayDeque<Integer> fila1;
        ArrayDeque<Integer> fila2;
        ArrayDeque<Integer> entrada;
        
        fila1 = (ArrayDeque<Integer>) rellenar();
        fila2 = (ArrayDeque<Integer>) rellenar();
        System.out.println("Esta es la fila 1.");
        mostrar(fila1);
        System.out.println("");
        System.out.println("Esta es la fila 2.");
        mostrar(fila2);
        entrada = (ArrayDeque<Integer>) entradaCine(fila1, fila2);
        System.out.println("");
        System.out.println("El orden de entrada a la sala sera:");
        mostrar(entrada);
        System.out.println("");
        
    }
    
    private static Collection rellenar() {
        ArrayDeque<Integer> aux = new ArrayDeque();
        int n;
        for (int i = 0; i < 5; i++) {
            n = (int) (Math.random() * 65);
            aux.offer(n);
        }
        return aux;
    }
    
    private static void mostrar(Collection colecion) {
        Iterator<Integer> it = colecion.iterator();
        
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }

    private static Collection entradaCine(ArrayDeque lista1, ArrayDeque lista2) {
        ArrayDeque<Integer> aux = new ArrayDeque();
        int x = (lista1.size() + lista2.size());
        for (int i = 0; i < x; i++) {
            Integer a = (Integer) lista1.getFirst();
            Integer b = (Integer) lista2.getFirst();
            if (a < b) {
                aux.add(b);
                lista2.removeFirst();
            } else if (a >= b) {
                aux.add(a);
                lista1.removeFirst();
            }
            if(lista1.isEmpty() || lista2.isEmpty()){
                break;
            }
        }
        if (lista1.isEmpty()) {
            aux.addAll(lista2);
        }
        if (lista2.isEmpty()) {
            aux.addAll(lista1);
        }
        return aux;
    }
}
