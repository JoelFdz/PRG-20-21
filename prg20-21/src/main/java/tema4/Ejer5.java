/*
 * Ejercicio 5
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer5 {
    public static void main(String[] args) {
        System.out.println("Introduce un número:");
        Scanner teclado = new Scanner (System.in); 
        int num = teclado.nextInt();
        while(num!=0){
            if(num%2 == 0 && num>0){
                System.out.println("El número "+num+" es par.");
                System.out.println("El numero "+num+" es positivo.");
                int cuadrado = num*num;
                System.out.println("El cuadrado de: "+num+" es "+cuadrado);
            }else{
                System.out.println("El numero "+num+" no es par.");
                System.out.println("El numero "+num+" es positivo.");
                int cuadrado = num*num;
                System.out.println("El cuadrado de: "+num+" es "+cuadrado);
            }
            System.out.println("Introduce un nuevo valor.");
            num = teclado.nextInt();
            if(num==0){
                break;
            }
            
        }
        System.out.println("Gracias por usar el programa.");
    }
}
