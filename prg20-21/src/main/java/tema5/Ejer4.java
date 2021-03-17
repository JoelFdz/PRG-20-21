/*
 * Ejercicio 4
 */
package tema5;


import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author JFSam
 */
public class Ejer4 {
    public static double area(double alt,double rad){
        double result;
        result = (2*Math.PI)*rad*(alt+rad);
        return result;
    }
    public static double volumen(double alt,double rad){
        double result;
        result = Math.PI*rad*rad*alt;
        return result;
    }
    public static void main(String[] args) {
        DecimalFormat  df = new DecimalFormat("#.00");
        System.out.println("Dame la altura del cilindro:");
        Scanner teclado = new Scanner (System.in);
        double alt = teclado.nextDouble();
        System.out.println("Dame el radio del cilindro:");
        double rad = teclado.nextDouble();
        System.out.println("Que quieres calcular, area(1) o volumen(2).");
        int respuesta = teclado.nextInt();
        switch(respuesta){
            case 1: System.out.println("El area del cilindro es: "+df.format(area(alt,rad)));
                    break;
            case 2: System.out.println("El volumen del cilindro es: "+df.format(volumen(alt,rad)));
                    break;
            default:System.out.println("Elige: 1 o 2.");
                    break;
        }
    }
}

