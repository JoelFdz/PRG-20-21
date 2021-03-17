/*
 * Ejercicio 18
 */
package tema5;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer18 {
    public static double fibonacci(double num){
        double result;
        if (num > 1){
            return result = fibonacci(num-1) + fibonacci(num-2);
        }else if (num == 1) {
        return 1;
        }else if (num == 0){
        return 0;
        }else{ //error
        System.out.println("Debes ingresar un tamaño mayor o igual a 1");
        return -1; 
    }
    }
    public static void main(String[] args) {
        DecimalFormat  df = new DecimalFormat("#.00");
        System.out.println("Bienvenido al calculador de fibonacci.");
        System.out.println("Introduce un numero para calcular su fibonacci:");
        Scanner teclado = new Scanner (System.in); 
        double num1 = teclado.nextDouble();
            System.out.println("El fibonacci de "+ num1 +" es "+ df.format(fibonacci(num1)));
    }
}
