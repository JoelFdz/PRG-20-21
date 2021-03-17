/*
 * Ejercicio 8
 * Realiza un programa en Java donde vamos a ir analizando un String para verificar si es
 * equilibrada o no en símbolos de paréntesis, recorriendo todos sus caracteres desde el inicio
 * hasta el final. Para ello crea un método que recoja un String y devuelva un lógico.
 */
package tema8;

import java.util.*;

/**
 *
 * @author JFSam
 */
public class Ejer8 {

    public static void main(String[] args) {
        String x = meterfrase();

        System.out.println("El String introducido es: " + x);
        System.out.println("El String introducido es equilibrado? ");
        System.out.println(esEquilibrado(x));

    }

    private static String meterfrase() {
        Scanner teclado = new Scanner(System.in);
        String x;

        System.out.println("Introduce un String");
        x = teclado.nextLine();
        return x;
    }

    private static boolean esEquilibrado(String x) {
        boolean b = false;
        ArrayList<Character> aux = new ArrayList();
        int cont1 = 0, cont2 = 0;

        for (int i = 0; i < x.length(); i++) {
            aux.add(x.charAt(i));
        }
        for (int i = 0; i < aux.size(); i++) {
            if (aux.get(i) == '(' && cont1 >= cont2) {
                cont1++;
            }
            if (aux.get(i) == ')' && cont1 >= cont2) {
                cont2++;
            }
        }

        if (cont1 == cont2) {
            b = true;
        }

        return b;
    }


}
