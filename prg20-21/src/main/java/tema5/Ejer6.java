/*
 * Ejercicio 6
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer6 {
     public static boolean esVocal(char a){
        if (a=='a'|| a=='e' || a=='i'|| a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U') {
            return true;
        }else{
            return false;
        }
    }
     public static void main(String[] args) {
        System.out.println("Dame una Vocal:");
        Scanner teclado = new Scanner (System.in); 
        char caracter = teclado.next().charAt(0);
        boolean vocal;
        
        vocal = esVocal(caracter);
            if (vocal) {
                System.out.println("SI es una vocal.");
            }else {
                System.out.println("NO es una vocal, introduce una Vocal");
            }
    }
}
