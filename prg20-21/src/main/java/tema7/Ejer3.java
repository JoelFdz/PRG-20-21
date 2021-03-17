/*
 * Ejercicio 3
 */
package tema7;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer3 {
    public static void main(String[] args) {
        System.out.println("Por favor introduce el numero total de nº que quieres ingresar a la lista.");
        int contador,acumulador0 = 0;
        int positivos = 0, negativos = 0,mediaPo = 0,mediaNeg = 0;
        Scanner teclado = new Scanner (System.in);
        contador = teclado.nextInt();
        
        int[] listaNum = new int[contador];
        
        for(int i = 0; i < listaNum.length; i++){
            System.out.println("Introduce un numero en la lista");
            listaNum[i] = teclado.nextInt();
        }
        
        System.out.println("Estos son los resultados.");
        for(int i = 0; i < listaNum.length; i++){
            if(listaNum[i] > 0){
                positivos++;
                mediaPo = mediaPo + listaNum[i];
            }else if(listaNum[i] < 0){
                negativos++;
                mediaNeg = mediaNeg + listaNum[i];
            }else if(listaNum[i] == 0){
                acumulador0++;
            }
        }
        mediaPo = mediaPo/positivos;
        mediaNeg = mediaNeg/negativos;
        System.out.println("La media de positivos es: "+mediaPo);
        System.out.println("La media de negativos es: "+mediaNeg);
        System.out.println("Se han introducio "+acumulador0+" ceros.");
    }
}
