/*
 * Ejercicio 8
 */
package tema2;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer8 {
    public static void main(String[] args) {
        System.out.println("Introduce la base imponible: ");
        Scanner teclado = new Scanner (System.in);  
        double base = teclado.nextDouble();
        System.out.println("Introduce el % de IVA: ");
        int iva = teclado.nextInt();
        double importe_iva = base*iva/100;
        double total = base+importe_iva;  
        System.out.println("El resultado es:");
        System.out.println("Se tendra que pagar " + importe_iva + " de IVA.");
        System.out.println("El total con IVA es igual a " + total);
    }
}

