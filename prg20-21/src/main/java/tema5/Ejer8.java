/*
 * Ejercicio 8
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer8 {
    public static boolean esDivisor (float a, float b){

        boolean resultado;
        if(a % b == 0){
            resultado = true;
        }else{
            resultado = false;
        }
        return resultado;
    }
    public static void main(String[] args) {
        System.out.println("Dime el primer numero:");
        Scanner teclado = new Scanner (System.in); 
        float num1 = teclado.nextFloat();
        System.out.println("Dame otro número:");
        float num2 = teclado.nextFloat();
        System.out.println("La respuesta si el num2 es divisor de num1 es:");
        System.out.println(esDivisor(num1,num2));
    }
}
