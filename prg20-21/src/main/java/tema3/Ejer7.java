/*
 * Ejercicio 7
 */
package tema3;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer7 {
    public static void main(String[] args) {
        System.out.println("Introduce el primer nº:");
        Scanner teclado = new Scanner (System.in); 
        float num1 = teclado.nextFloat();
        System.out.println("Introduce el segundo nº:");
        float num2 = teclado.nextFloat();
        System.out.println("Introduce un tercer nº:");
        float num3 = teclado.nextFloat();
        if(num1>num2 && num1>num3){
            System.out.println("El mayor es: "+num1);
        }else if(num2>num1 && num2>num3){
            System.out.println("El mayor es: "+num2);
        }else{
            System.out.println("El mayor es: "+num3);
        }
    }
    
}

