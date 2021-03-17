/*
 * Ejercicio 11
 */
package tema2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer11 {
    public static void main(String[] args) {
        DecimalFormat  df = new DecimalFormat("#.00");
        int h, i, n;
        double r, m, solu;
        System.out.println("Introduce el valor de la casa: ");
        Scanner teclado = new Scanner (System.in); 
        h = teclado.nextInt();
        System.out.println("Introduce la tasa de interes: ");
        i = teclado.nextInt();
        System.out.println("Introduce los años para el plazo: ");
        n = teclado.nextInt();
        r = i/(100*12);
            //Operación de la parte de abajo de la fracción.
                double exp, base;
                base = (1+r);
                exp = (-12*n);
                solu = Math.pow(base, exp);
        m = h*r/(1-(solu));
             
        System.out.println("La cuata a pagar es de "+df.format(m)+"€");
    }
}
