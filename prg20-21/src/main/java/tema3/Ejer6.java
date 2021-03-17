/*
 * Ejercicio 6
 */
package tema3;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer6 {
    public static void main(String[] args) {
        System.out.println("Introduce el primer nº:");
        Scanner teclado = new Scanner (System.in); 
        float num1 = teclado.nextFloat();
        System.out.println("Introduce el segundo nº:");
        float num2 = teclado.nextFloat();
        System.out.println((num1>num2) ? ""+num1+" es mayor a "+ num2  : ""+num2+" es mayor a "+num1);
    }
}
