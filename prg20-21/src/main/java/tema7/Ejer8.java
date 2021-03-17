/*
 * Ejercicio clase:
 * Realiza un programa en Java que cree una tabla de 5 filas, de forma irregular y que este rellena de numeros aleatorios.
 * Luego muestra los valores d ela tabla.
 */
package tema7;

/**
 *
 * @author JSam
 */
public class Ejer8 {

    public static void main(String[] args) {
        int[][] tabla = new int[5][];
        tabla[0] = new int[1];
        tabla[1] = new int[2];
        tabla[2] = new int[3];
        tabla[4] = new int[4];

        rellenar(tabla);
        System.out.println("Mostrado de los valores.");
        mostrar(tabla);

    }

    private static void rellenar(int[][] tabla) {
        for (int f = 0; f < tabla.length; f++) {
            for (int c = 0; tabla[f] != null && c < tabla[f].length; c++) {
                tabla[f][c] = (int) (Math.random() * 100);
            }
        }
    }

    private static void mostrar(int[][] tabla) {
        for (int f2 = 0; f2 < tabla.length; f2++) {
            for (int c2 = 0; tabla[f2] != null && c2 < tabla[f2].length; c2++) {
                System.out.print(tabla[f2][c2] + " ");
            }
            System.out.println("");
        }
    }
}
