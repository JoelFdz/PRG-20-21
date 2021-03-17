/*
 * Ejercicio 17
 */
package tema5;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer17 {
    public static double suma(double num1,double num2){
        double result;
        result = num1+num2;
        return result;
    }
    public static double resta(double num1,double num2){
        double result;
        result = num1-num2;
        return result;
    }
    public static double mult(double num1,double num2){
        double result;
        result = num1*num2;
        return result;
    }
    public static double div(double num1,double num2){
        double result;
        result = num1/num2;
        return result;
    }
    public static void main(String[] args) {
        DecimalFormat  df = new DecimalFormat("#.00");
        System.out.println("Bienvenido a nuestra calculadora.");
        System.out.println("Introduce un numero:");
        Scanner teclado = new Scanner (System.in); 
        double num1 = teclado.nextDouble();
        System.out.println("Dame otro número:");
        double num2 = teclado.nextDouble();
        System.out.println("Que quieres calcular, suma(1),resta(2),multiplicacion(3) y division(4).");
        int respuesta = teclado.nextInt();
        switch(respuesta){
            case 1: System.out.println("El resultado de la suma  es: "+df.format(suma(num1,num2)));
                    break;
            case 2: System.out.println("El resultado de la resta  es: "+df.format(resta(num1,num2)));
                    break;
            case 3: System.out.println("El resultado de la multiplicacion  es: "+df.format(mult(num1,num2)));
                    break;
            case 4: System.out.println("El resultado de la division  es: "+df.format(div(num1,num2)));
                    break;        
            default:System.out.println("Elige: 1, 2, 3 o 4.");
                    break;
        }
    }
}
