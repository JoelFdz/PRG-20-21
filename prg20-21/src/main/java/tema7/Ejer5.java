/*
 * Ejercicio 5
 */
package tema7;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer5 {
    public static void main(String[] args) {
        System.out.println("Por favor introduce el numero total de nº que quieres ingresar a la lista.");
        int contador;
        Scanner teclado = new Scanner (System.in);
        contador = teclado.nextInt();
        int[] numeros = new int[contador];
        int[] pares;
        int[] impares;
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Introduce un numero en la lista");
            numeros[i] = teclado.nextInt();
        }
        pares = new int[contador];
        impares = new int[contador];
        
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] % 2 == 0){
               pares[i] = numeros[i]; 
            }else{
                impares[i] = numeros[i];
            }  
        }
        System.out.println("Lista de numeros pares:");
        for(int i = 0; i < pares.length; i++){
            if(pares[i] > 0){
                System.out.println(pares[i]);
            }
        }
        System.out.println("Lista de numeros impares:");
        for(int i = 0; i < impares.length; i++){
            if(impares[i] > 0){
                System.out.println(impares[i]);
            }
        }
    }
}

