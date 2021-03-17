/*
 * Ejercicio de Acepta el reto 116(PARTE DEL EJERCICIO 5 TEMA 6 )
 */
package tema6;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class AR116 {
    private static void casoDePrueba()
    {
        System.out.println("Hola mundo.");
    }
    
    public static void main (String args[]) 
    {
        Scanner teclado = new Scanner (System.in);
        int numCasosDePrueba = teclado.nextInt();

        for (int i = 1; i <= numCasosDePrueba; i++) {
            casoDePrueba();
        }
    }
}
