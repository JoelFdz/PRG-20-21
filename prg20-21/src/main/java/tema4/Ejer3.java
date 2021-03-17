/*
 * Ejercicio 3
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer3 {
    public static void main(String[] args) {
        System.out.println("Introduce el nº max del rango:");
        Scanner teclado = new Scanner (System.in); 
        int max = teclado.nextInt();
        System.out.println("Introduce el nº min del rango:");
        int min = teclado.nextInt();
        System.out.println("Dime un número");
        int num = teclado.nextInt();
            while(num>max || num<min){
                    System.out.println("Introduce un valor dentro del rango.");
                    num = teclado.nextInt();
                    if(num < max && num > min){
                    break;
                    }
                }
                System.out.println("El número esta dentro del rango.");
    }
}
