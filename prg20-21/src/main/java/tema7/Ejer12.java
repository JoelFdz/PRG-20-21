/*
 * Ejercicio 12.
 */
package tema7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author JSam
 */
public class Ejer12 {

    public static void main(String[] args) {
        int[][] matriz1 = new int[4][4];
        rellenar(matriz1);
        System.out.println("Resultado:");
        mostrar(matriz1);
        System.out.println("Es la Matriz Mágica? " + magica(matriz1));

    }

    private static void rellenar(int[][] matriz1) {
        Scanner teclado = new Scanner(System.in);
        for (int f = 0; f < matriz1.length; f++) {
            for (int c = 0; c < matriz1[f].length; c++) {
                System.out.println("Introduce un valor");
                matriz1[f][c] = teclado.nextInt();
            }
        }
    }

    private static boolean magica(int[][] matriz1) {
        int i = 0, x,col = 0;;
        int[] totales = new int[10];
        int sumaf = 0, sumac = 0;
        int sumad1 = 0, sumad2 = 0;
        //Se introduce al Array de totales los valores totales de las filas.
        for (int f = 0; f < matriz1.length; f++) {
            for (int c = 0; c < matriz1[f].length; c++) {
                sumaf = sumaf + matriz1[f][c];

            }
            totales[i] = sumaf;
            i++;
            sumaf = 0;
        }
        //Se introduce al Array de totales los valores totales de las columnas.
        for (int f = 0; f < matriz1.length; f++) {
            for (int c = 0; c < matriz1[f].length; c++) {
                sumac = sumac + matriz1[c][f];

            }
            totales[i] = sumac;
            i++;
            sumac = 0;
        }
        //Se introduce al Array de totales el valor total de la primera diagonal.
        for (int f = 0; f < matriz1.length; f++) {
            sumad1 = sumad1 + matriz1[f][f];

        }
        totales[i] = sumad1;
        i++;
        //Se introduce al Array de totales el valor total de la segunda diagonal.
        for (int f = 3; f >= 0; f--) {
            sumad2 = sumad2 + matriz1[f][col];
            col++;

        }
        totales[i] = sumad2;
        i++;
        //Muestro los valores del Array de totales.
        System.out.println(Arrays.toString(totales));
        //Bucle para comprobar si la matriz1 es magica o no.
        for (x = 1; x < totales.length; x++) {
            if (totales[x] != totales[x - 1]) {
                break;
            }
        }
        if (x == totales.length) {
            return true;
        } else {
            return false;
        }

    }

    //Metodo para mostrar la matriz introducida por el usuario.
    private static void mostrar(int[][] matriz1) {
        for (int f = 0; f < matriz1.length; f++) {
            for (int c = 0; c < matriz1[f].length; c++) {
                System.out.print(matriz1[f][c] + " ");
            }
            System.out.println("");
        }
    }

}
