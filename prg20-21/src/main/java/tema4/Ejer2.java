/*
 * Ejercicio 2
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer2 {
    public static void main(String[] args) {
        System.out.println("Introduce el nº hasta el que quieres contar:");
        Scanner teclado = new Scanner (System.in); 
        int num1 = teclado.nextInt();
        System.out.println("La lista de nº es la siguiente:");
        for (int i = 0; i <= num1; i++) {
            System.out.print(" "+i );
        }
    }
}
