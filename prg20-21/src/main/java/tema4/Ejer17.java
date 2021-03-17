/*
 * Ejercicio 17
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer17 {
    public static void main(String[] args) {
        int resultado;
        int i =1;
        System.out.println("Introduce el primer número para multiplicar:");
        Scanner teclado = new Scanner (System.in); 
        int num1 = teclado.nextInt();
        resultado = 0;
        System.out.println("Introduce un segundo número para multiplicar:");
        int num2 = teclado.nextInt();
        while (i<=num2) {
            resultado = resultado +num1;
            i++;
        } 
        System.out.println("El resultado d ela multiplicacion es: "+resultado);
    }
}
