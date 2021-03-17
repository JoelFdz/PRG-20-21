/*
 * Ejercicio 7
 */
package tema7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
* @author JFSam
 */
public class Ejer6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vector1 = new int[6];
        System.out.println("Rellena la primera lista. Con 6 valores.");
        for (int i = 0; i < vector1.length; i++) {
            System.out.println("Introduce un valor.");
            vector1[i] = teclado.nextInt();
        }
        Arrays.sort(vector1);
        System.out.println("El primer Array ordenado que asi:");
        for (int x : vector1) {
            System.out.println(x);
        }
        System.out.println("Rellena la segunda lista. Con 6 valores.");
        int[] vector2 = new int[6];
        for (int i = 0; i < vector1.length; i++) {
            System.out.println("Introduce un valor.");
            vector2[i] = teclado.nextInt();
        }
        Arrays.sort(vector2);
        System.out.println("EL segundo Array ordenado que asi:");
        System.out.println(Arrays.toString(vector2));

        int[] vector3 = new int[vector1.length + vector2.length];
        //Union de los 2 Arrays en uno.
        int i = 0;
        //Este primer FOR añade el primer vector1, al vector3.
        for (i = 0; i < vector1.length; i++) {
            vector3[i] = vector1[i];
        }
        //Este segundo FOR añade el vector2 a continuación del vector1 dentro del vector3.
        for (int j = 0; j < vector2.length; j++) {
            vector3[i] = vector2[j];
            i++;
        }
        //Forma de ordenar el vector3 combinado.
        int contenedor = 0; //Contenedor para guardar el valor del indicie del Array.
        for (int k = 0; k < vector3.length; k++) {
            for (int l = 1; l < (vector3.length); l++) {
                if (vector3[l - 1] > vector3[l]) {
                    contenedor = vector3[l - 1]; //El valor anterior al indice l se guara en el contenedor.
                    vector3[l - 1] = vector3[l]; //Al valor anterior al indice l le asigno el valor que contiene el indice l.
                    vector3[l] = contenedor; //Al indice l se le asigna el valor que contenia el contendor o(el valor del indice anterior a l)
                }
            }
        }
        System.out.println("El Array combinado ordenado queda:");
        for (int x : vector3) {
            System.out.println(x);
        }
    }
}
