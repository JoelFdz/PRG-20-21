/*
 * Ejercicio 15
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer15 {
    public static void main(String[] args) {
        System.out.println("Introduce un número para dibujar un triángulo:");
        Scanner teclado = new Scanner (System.in); 
        int num = teclado.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = num-1-i; j >=0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
