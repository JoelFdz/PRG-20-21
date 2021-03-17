/*
 * Ejercicio 9
 */
package tema2;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer9 {
    public static void main(String[] args) {
        double a, b, c;
        System.out.println("ax² + bx +c = 0");
        System.out.println("Introduce valores para a:");
        Scanner teclado = new Scanner (System.in); 
        a = teclado.nextDouble();
        System.out.println("Introduce valores para b:");
        b = teclado.nextDouble();
        System.out.println("Introduce valores para c:");
        c = teclado.nextDouble();
        //---------------------------------------------
        double op_raiz = b*b-(4*a*c);
        double sol_raiz = Math.sqrt(op_raiz);
        double x1 = (-b-sol_raiz);
        double x2 = (-b+sol_raiz);
            x1= x1/(2*a);
            x2= x2/(2*a);
        System.out.println("Las soluciones de la ecuación son " + x1 + " y " + x2);
    }
}
