/*
 * Ejercicio 3
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer3 {
    public static void mayorque(int num1,int num2){
        if(num1>num2){
            System.out.println(num1+" mayor que "+num2);
        }else{
            System.out.println(num2+" mayor que "+num1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Dame un número:");
        Scanner teclado = new Scanner (System.in); 
        int num1 = teclado.nextInt();
        System.out.println("Dame otro número:");
        int num2 = teclado.nextInt();
        mayorque(num1,num2);
    }
}
