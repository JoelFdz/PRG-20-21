/*
 * Ejercicio 4
 */
package tema7;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Se va iniciar un array de numeros tranquilo.");
        int[] numeros = {9,8,5,3,7};
        System.out.println("Ahora toca borrar unos cuantos numeros d ela lista.");
        int num, numerosLista = 5;
        boolean listaEnBlanco = false;
        for(int i = 0;i < numeros.length; i++){
            do{
                System.out.println("¿Indice que quieres borrar?");
                num = teclado.nextInt();
            }while(num>4);
            //Si se introduce un numero negativo el borrado de datos cesa.
                if(num<0){
                    break;
                }
            numeros[num] = 0;
            if(numeros[num] == 0){
                numerosLista--;
            }
            if(numerosLista == 0){
                listaEnBlanco=true;
            }
            //Si el usuario vacia la lista al completo cesara el borrado de datos.
            if(listaEnBlanco){
                System.out.println("La lista esta vacia.");
                break;
            }
        }
        System.out.println("Los numeros que se encuentran en la lista son:");
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > 0){
                System.out.println(numeros[i]);
            }
    }
    }
}

