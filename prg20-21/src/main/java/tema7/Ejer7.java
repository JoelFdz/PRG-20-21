/*
 * Ejercicio 7
 */
package tema7;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        int[] tri1 = {6, 8, 5, 3, 7};
        int[] tri2 = {4, 4, 5, 8, 5};
        int[] tri3 = {6, 7, 8, 2, 6};
        float[] medias = new float[3];
        int nAlumno, trimestre = 1;
        float media;
        System.out.println("Notas del 1º trimestre:");
        for (int i = 0; i < tri1.length; i++) {
            System.out.print(tri1[i] + " ");
            medias[0] = medias[0] + tri1[i];
        }
        System.out.println("");
        System.out.println("Notas del 2º trimestre:");
        for (int i = 0; i < tri2.length; i++) {
            System.out.print(tri2[i] + " ");
            medias[1] = medias[1] + tri2[i];
        }
        System.out.println("");
        System.out.println("Notas del 3º trimestre:");
        for (int i = 0; i < tri3.length; i++) {
            System.out.print(tri3[i] + " ");
            medias[2] = medias[2] + tri3[i];
        }
        System.out.println("");

        for (int i = 0; i < 3; i++) {
            medias[i] = medias[i] / 5; //Si varia el nº de alumnos el 5 deveria variar tambien
            System.out.println("Media del " + trimestre + "º trimestre es de: " + medias[i]);
            trimestre++;
        }
        System.out.println("");

        System.out.println("Seleciona un nº de alumno.");
        nAlumno = teclado.nextInt();
        while (nAlumno >= 0 && nAlumno < 5) {
            media = (float) (tri1[nAlumno] + tri2[nAlumno] + tri3[nAlumno]) / 3;
            System.out.println("La media del alumno" + nAlumno + " que ha sido seleccionado es de " + df.format(media) + " puntos.");
            System.out.println("Seleciona otro nº de alumno:");
            nAlumno = teclado.nextInt();
        }

    }
}
