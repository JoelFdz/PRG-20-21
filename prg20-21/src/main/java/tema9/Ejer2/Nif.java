
/*
 * Ejercicio 2.
 */
package tema9.Ejer2;

import java.util.*;

/**
 *
 * @author JFSam
 */
public class Nif {

    private int numero;
    private char letra;

    public Nif() {
        numero = 0;
        letra = ' ';
    }

    public Nif(int numeroDni) {
        numero = numeroDni;
        obtenerLetra(numero);
    }

    public int getNumero() {
        return this.numero;
    }

    public char getLetra() {
        return this.letra;
    }

    public void mutador(int nuevoNumero) {
        numero = nuevoNumero;
        obtenerLetra(nuevoNumero);
    }

    public void leer() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número de DNI");
        numero = teclado.nextInt();
        obtenerLetra(numero);
    }

    public String mostrar() {
        String aux;

        aux = numero + "-" + letra;
        return aux;
    }

    private void obtenerLetra(int numeroDNI) {
        int aux = numeroDNI % 23;

        switch (aux) {
            case 0:
                letra = 'T';
                break;
            case 1:
                letra = 'R';
                break;

            case 2:
                letra = 'W';
                break;
            case 3:
                letra = 'A';
                break;
            case 4:
                letra = 'G';
                break;
            case 5:
                letra = 'M';
                break;
            case 6:
                letra = 'Y';
                break;
            case 7:
                letra = 'F';
                break;
            case 8:
                letra = 'P';
                break;
            case 9:
                letra = 'D';
                break;
            case 10:
                letra = 'X';
                break;
            case 11:
                letra = 'B';
                break;
            case 12:
                letra = 'N';
                break;
            case 13:
                letra = 'J';
                break;
            case 14:
                letra = 'Z';
                break;
            case 15:
                letra = 'S';
                break;
            case 16:
                letra = 'Q';
                break;
            case 17:
                letra = 'V';
                break;
            case 18:
                letra = 'H';
                break;
            case 19:
                letra = 'L';
                break;
            case 20:
                letra = 'C';
                break;
            case 21:
                letra = 'K';
                break;
            case 22:
                letra = 'E';
                break;
        }

    }
}
