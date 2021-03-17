/*
 * Ejercicio 1
 */
package tema3;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer1 {
    public static void main(String[] args) {
        System.out.println("Introduce un número:");
        Scanner teclado = new Scanner (System.in); 
        int n = teclado.nextInt();
        if(n%2 == 0){
            System.out.println("El número introducido es par.");
        }else{
            System.out.println("El número introducido es impar.");
        }
        }
}
