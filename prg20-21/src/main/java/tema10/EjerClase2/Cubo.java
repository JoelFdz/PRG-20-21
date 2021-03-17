/*
 * Cubo.
 */
package tema10.EjerClase2;

/**
 *
 * @author JFSam
 */
public class Cubo {

    private int[][][] cubo;

    public Cubo(int tamaño) {
        this.cubo = new int[tamaño][tamaño][tamaño];
    }

    public void rellenar(int numero) {
        int cont = 1;
        for (int f = 0; f < cubo.length; f++) {
            for (int c = 0; c < cubo[f].length; c++) {
                for (int p = 0; p < cubo[f][c].length; p++) {
                    if (cont > numero) {
                        cont = 1;
                        cubo[f][c][p] = cont;
                        cont++;
                    } else {
                        cubo[f][c][p] = cont;
                        cont++;
                    }
                }  
            }
            cont = 1;
        }
    }

    public String mostrar() {
        StringBuilder aux = new StringBuilder();
        for (int f = 0; f < cubo.length; f++) {
            for (int c = 0; c < cubo[f].length; c++) {
                for (int p = 0; p < cubo[f][c].length; p++) {
                    aux.append(cubo[f][c][p] + " ");
                }
                aux.append("\n");
            }
            aux.append("\n");
        }

        return aux.toString();
    }
}
