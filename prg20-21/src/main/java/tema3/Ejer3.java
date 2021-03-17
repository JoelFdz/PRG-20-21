/*
 * Ejercicio 3
 */
package tema3;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer3 {
    public static void main(String[] args) {
        System.out.println("Introduce el primer nº:");
        Scanner teclado = new Scanner (System.in); 
        float num1 = teclado.nextFloat();
        System.out.println("Introduce el segundo nº distinto al primero:");
        float num2 = teclado.nextFloat();
        if(num1>num2){
            System.out.println("El n1 mayor es el "+num1);
        }else if(num2>num1){
            System.out.println("El nº mayor es el "+num2);
        }
}
}
