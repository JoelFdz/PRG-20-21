/*
 * Ejercicio 2
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer2 {
    public static void rango(int num1, int num2){
        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        System.out.println("Dame un número:");
        Scanner teclado = new Scanner (System.in); 
        int num1 = teclado.nextInt();
        System.out.println("Dame otro número:");
        int num2 = teclado.nextInt();
        System.out.println("El rango de números entre los propuestos es:");
        rango(num1,num2);
    }
}
