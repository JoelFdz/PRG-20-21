/*
 * Ejercicio 4
 */
package tema6;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer4 {
     public static void main(String[] args) {
        String cadena;
        int cont=0;
        char caracter;

        do{
            System.out.println("Introduce una cadena de texto.");
            Scanner teclado = new Scanner (System.in);
            cadena= teclado.nextLine();
            do{
                caracter = cadena.charAt(cont);
                if(caracter==' '){
                    cont++;
                    continue;
                }
                if(cont == cadena.length()-1){
                    System.out.print(caracter);
                    break;
                }
                    System.out.print(caracter + " ");
                    cont++;
            }while(cont < cadena.length());
                cont=0;
                System.out.println("");
        }while(!cadena.equalsIgnoreCase("FIN") || !cadena.equalsIgnoreCase("fin"));
        System.out.println("El programa finalizo");
    }
}           


