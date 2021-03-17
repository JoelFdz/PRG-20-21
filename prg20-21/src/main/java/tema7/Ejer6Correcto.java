/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer6Correcto {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vector1 = new int[6];
        System.out.println("Rellena la primera lista. Con 6 valores.");
        for (int i = 0; i < vector1.length; i++) {
            System.out.println("Introduce un valor.");
            vector1[i] = teclado.nextInt();
        }
        Arrays.sort(vector1);
        System.out.println("El primer Array ordenado que asi:");
        for (int x : vector1) {
            System.out.println(x);
        }
        System.out.println("Rellena la segunda lista. Con 6 valores.");
        int[] vector2 = new int[6];
        for (int i = 0; i < vector1.length; i++) {
            System.out.println("Introduce un valor.");
            vector2[i] = teclado.nextInt();
        }
        Arrays.sort(vector2);
        System.out.println("EL segundo Array ordenado que asi:");
        System.out.println(Arrays.toString(vector2));

        int[] vector3 = new int[vector1.length + vector2.length];
        //Union de los 2 Arrays en uno.
        int i = 0,cont1 = 0, cont2 = 0;
        System.out.println("El Array conjunto ordenado es:");
        for (i = 0; i < vector3.length; i++) {
            if (vector1[cont1] < vector2[cont2]) {
                vector3[i] = vector1[cont1];
                cont1++;
            } else if (vector1[cont1] >= vector2[cont2]) {
                vector3[i] = vector2[cont2];
                cont2++;
            }
            if (cont1 == 6 || cont2 == 6) {
                break;
            }
        }
        if (cont1 == 6) {
            for (; cont2 < 6; cont2++) {
                vector3[++i] = vector2[cont2];
            }
        } else {
            for (; cont1 < 6; cont1++) {
                vector3[++i] = vector1[cont1];
            }
        }
        for(int x : vector3){
            System.out.println(x);
        }
    }
}
