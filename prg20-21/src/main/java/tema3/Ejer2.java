/*
 * Ejercicio 2
 */
package tema3;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer2 {
    public static void main(String[] args) {
        System.out.println("Introduce el primer nº:");
        Scanner teclado = new Scanner (System.in); 
        float num1 = teclado.nextFloat();
        System.out.println("Introduce el segundo nº:");
        float num2 = teclado.nextFloat();
        if(num1==num2){
            System.out.println("Los números son iguales.");
        }else{
            System.out.println("Los números no son iguales.");
        }
    }
}
