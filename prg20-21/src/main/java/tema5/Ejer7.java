/*
 * Ejercicio 7
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer7 {
    public static boolean esPrimo(int num)
    {
        int dividendo = 2;
        while( dividendo < num){
            if( num % dividendo == 0){
                return false;
            }
            dividendo = dividendo +1;
        }
        return true;
    }  
    public static void main(String[] args) {
        System.out.println("Dame un numero:");
        Scanner teclado = new Scanner (System.in); 
        int num = teclado.nextInt();
        System.out.println("Es el numero introducido primo, la respuesta es:");
        System.out.println(esPrimo(num));
    }
}
