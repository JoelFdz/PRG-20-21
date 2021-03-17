/*
 * Ejercicio 10
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer10 {
    public static void divisores(int a){
        for(int i=1;i <= a; i++){
            boolean r;
            r = Ejer8.esDivisor(a,i);
            if(r == true){
            System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Introduce un numero para saber sus divisores:");
        Scanner teclado = new Scanner (System.in); 
        int num1 = teclado.nextInt();
        divisores(num1);
    }
}
