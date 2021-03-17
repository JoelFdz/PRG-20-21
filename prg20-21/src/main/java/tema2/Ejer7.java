/*
 * Ejercicio 7
 */
package tema2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer7 {
    public static void main(String[] args) {
        DecimalFormat  df = new DecimalFormat("#.00");
        System.out.println("Por favor dame el radio de la circunferencia: ");
        Scanner teclado = new Scanner (System.in);
        double radio = teclado.nextFloat();
        //Calcular el cuadrado del radio.
        double resultado;
        resultado = Math.pow(radio, 2);
        double L, A;
        L = 2 * Math.PI * radio;
        A = Math.PI * resultado;
        System.out.println("La longitud de la circunferncia es : "+df.format(L));
        System.out.println("El area de la circunferncia es de : "+df.format(A));
    }
}
