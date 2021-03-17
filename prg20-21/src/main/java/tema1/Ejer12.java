/*
 * Ejercicio12
 */
package tema1;

import java.util.Scanner;

/**
 *
 * @author Joel Fernandez Sampedro
 */
public class Ejer12 {
    public static void main(String[] args) {
        System.out.println("Pulsa Enter para ver un triángulo: ");
        Scanner teclado = new Scanner (System.in);        
        teclado.nextLine();
        System.out.println("  * ");
        System.out.println(" ***");
        System.out.println("*****");
        
        System.out.println("Pulsa Enter para ver un cuadrado: ");       
        teclado.nextLine();
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        
        System.out.println("Pulsa Enter para ver un circulo: ");
        teclado.nextLine();
        System.out.println(" *** ");
        System.out.println("*****");
        System.out.println(" *** ");
        
    }
}
