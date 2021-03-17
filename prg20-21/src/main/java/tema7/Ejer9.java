/*
 * Inicializar un cubo de numeros aleatorios definidos por el programador de tamaño 3x2x3.
 */
package tema7;

/**
 *
 * @author JSam
 */
public class Ejer9 {

    public static void main(String[] args) {
        int[][][] cubo = {
            {{1, 2}, {3, 4}, {5, 6}},//Se rellena primera tabla.
            {{7, 8}, {9, 10}, {11, 12}},//Se rellena segunda tabla.
            {{13, 14}, {15, 16}, {17, 18}}//Se rellena tercera tabla.
        };
        System.out.println("Mostrado de datos:");
        mostrar(cubo);
    }
    
    private static  void mostrar(int[][][] cubo){
        for (int f = 0; f < cubo.length; f++) {
            for (int c = 0; c < cubo[f].length; c++) {
                for (int p = 0; p < cubo[f][c].length; p++) {
                    System.out.print(cubo[f][c][p]+" ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}