/*
 * Ejercicio 9
 */
package tema5;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer9 {
    public static double operacion(double b,double e){
        double resultado;
        resultado = Math.pow(b,e);
        return resultado;
    }
    public static void main(String[] args) {
        DecimalFormat  df = new DecimalFormat("#.00");
        System.out.println("Introduce la base(entero, entre -9999 y 9999):");
        Scanner teclado = new Scanner (System.in); 
        double base = teclado.nextDouble();
        System.out.println("Introduce el exponente(entero positivo + cero entre 0 y 99):");
        double exp = teclado.nextDouble();
        System.out.println("El resultado es: "+df.format(operacion(base,exp)));
    }
       
            
}
