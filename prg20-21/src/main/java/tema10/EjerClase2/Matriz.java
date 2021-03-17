/*
 * Clase Matriz.
 */
package tema10.EjerClase2;

/**
 *
 * @author JFSam
 */
public class Matriz {

    private int[][] matriz;

    public Matriz(int tamaño) {
        this.matriz = new int[tamaño][tamaño];
    }

    public void rellenar() {
        int cont = 1;
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                if (cont > 3) {
                    cont = 1;
                    matriz[f][c] = cont;
                    cont++;
                } else {
                    matriz[f][c] = cont;
                    cont++;
                }
            }
        }
    }

    public String mostrar() {
        StringBuilder aux = new StringBuilder();
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                aux.append(matriz[f][c] + " ");
            }
            aux.append("\n");
        }
        return aux.toString();
    }
}
