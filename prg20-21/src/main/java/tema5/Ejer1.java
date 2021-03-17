/*
 * Ejercicio 1
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer1 {
    public static void eco(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("ECO..");
        }
    }
    public static void main(String[] args) {
        System.out.println("Introduce un número");
        Scanner teclado = new Scanner (System.in); 
        int num = teclado.nextInt();
        eco(num);
    }
}
