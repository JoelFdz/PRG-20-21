/*
 * Ejercicio 13
 */
package tema7;

import java.util.Arrays;

/**
 *
 * @author JFSam
 */
public class Ejer13 {

    public static void main(String[] args) {
        int[] prueba = {7, 55, 8, 8, 12, 11, 10, 9, 9};
        mostrar(prueba);
        System.out.println("Array sin repetidos:");
        mostrar(sinRepetidos(prueba));
    }

    private static int[] sinRepetidos(int prueba[]) {
        int[] resultado;
        int contador = 0, total, j = 0, contenedor, X = -1;
        //Cuento cuantos numeros se repiten.
        for (int i = 1; i < prueba.length; i++) {
            if (prueba[i - 1] == prueba[i]) {
                contador++;
            }
        }
        total = prueba.length - contador;
        resultado = new int[total];
        //Los numeros repetidos los cambio a -1.
        for (int c = 0; c < prueba.length; c++) {
            contenedor = prueba[c];
            for (int r = c + 1; r < prueba.length; r++) {
                if (prueba[r] == contenedor) {
                    prueba[r] = X;
                }
            }
        }

        //Relleno el array resultante.
        for (int i = 0; i < prueba.length; i++) {
            if (prueba[i] != X) {
                resultado[j] = prueba[i];
                j++;
            }
        }
        return resultado;


    }

    private static void mostrar(int[] prueba) {
        for (int x : prueba) {
            System.out.print(x + " ");
        }
        System.out.println("");
    }
}
