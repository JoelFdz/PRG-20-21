/*
 * Ejercicio 11
 */
package tema7;

/**
 *
 * @author JSam
 */
public class Ejer11 {

    public static void main(String[] args) {
        int[][] tabla = new int[5][5];
        rellenar(tabla);
        System.out.println("Mostrado de datos:");
        mostrar(tabla);
    }

    private static void rellenar(int[][] tabla) {
        for (int f = 0; f < tabla.length; f++) {
            for (int c = 0; c < tabla[f].length; c++) {
                tabla[f][c] = f + c;
            }
        }
    }

    private static void mostrar(int[][] tabla) {
        for (int f = 0; f < tabla.length; f++) {
            for (int c = 0; c < tabla[f].length; c++) {
                System.out.print(tabla[f][c] + " ");
            }
            System.out.println("");
        }
    }
}
