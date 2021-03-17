/*
 * Ejercicio 10
 */
package tema2;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer10 {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int edad, frec;
        double fMax, pulobj1, pulobj2, pulobj3;
        System.out.println("Por favor dime tu edad.");
        Scanner teclado = new Scanner (System.in); 
        edad = teclado.nextInt();
        System.out.println("Por favor dime tu frecuencia cardíaca en reposo.");
        frec = teclado.nextInt();
        fMax = 208-(0.7*edad);
            pulobj1 = ((fMax-frec)*0.7) + frec;
            pulobj2 = ((fMax-frec)*0.8) + frec;
            pulobj3 = ((fMax-frec)*0.9) + frec;
            
        System.out.println("***************************");
        System.out.println("* 70% * Objetivo: "+pulobj1+"  *");
        System.out.println("* 80% * Objetivo: "+pulobj2+"  *");
        System.out.println("* 90% * Objetivo: "+pulobj3+"  *");
        System.out.println("***************************");
    }
}
