/*
 * Ejercicio 345.
 */
package AceptaElReto;

import java.util.*;

/**
 *
 * @author JFSam
 */
public class Ejer345 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nºsudokus;
        int[][] sudoku;
        String respuesta;

        nºsudokus = teclado.nextInt();
        sudoku = new int[9][9];

        for (int l = 0; l < nºsudokus; l++) {
            //Se rellena el sudoku con valores.
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sudoku[i][j] = teclado.nextInt();
                }
            }

        }
        if (magica(sudoku)) {
            respuesta = "SI";
        } else {
            respuesta = "NO";
        }

        System.out.println(respuesta);

    }

    //Metódo para comprobar si el sudoku es mágico.
    private static boolean magica(int[][] matriz1) {
        int i = 0, x;
        int[] totales = new int[18];
        int sumaf = 0, sumac = 0;
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

}
