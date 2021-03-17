/*
 * Ejercicio 5
 */
package tema3;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer5 {
    public static void main(String[] args) {
        System.out.println("Introduce un nº decimal");
        Scanner teclado = new Scanner (System.in);
        float dec = teclado.nextFloat();
        if(dec>-0.99 && dec<0.99){
            System.out.println("El nº está proximo al 0.");
        }
    }
}
