/*
 * Ejercicio 1
 */
package tema7;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer1 {
    public static void main(String[] args) {
       double[] numeros = new double[5];
    for(int i = 0; i < numeros.length; i++){
            System.out.println("Introduce un numero");
            Scanner teclado = new Scanner (System.in);
            numeros[i] = teclado.nextDouble();
    }
    
    System.out.println("Los numeros introducidos son:");
        
    for(int i = 0; i < numeros.length; i++){
        if(numeros[i] > 0){
           System.out.println(numeros[i]);
        }
    }
    }
}
