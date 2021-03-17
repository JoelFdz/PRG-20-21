/*
 * Ejercicio 2
 */
package tema7;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer2 {
    public static void main(String[] args) {
        System.out.println("Por favor introduce el numero total de nº que quieres ingresar a la lista.");
        int contador;
        Scanner teclado = new Scanner (System.in);
        contador = teclado.nextInt();
        
        int[] numerosE = new int[contador];
        
        for(int i = 0; i < numerosE.length; i++){
            System.out.println("Introduce un numero en la lista");
            numerosE[i] = teclado.nextInt();
        }
        
       System.out.println("El orden inverso de la introduccion de los numeros es:");
       
       for(int i = numerosE.length-1; i>=0; i--){
            if(numerosE[i] > 0){
                System.out.println(numerosE[i]);
            }
        }
    }
}
