/*
 * Ejercicio 182
 */
package AceptaElReto;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer182 {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int numCasosDePrueba = teclado.nextInt();

        for (int i = 0; i < numCasosDePrueba; i++) {
            numero = teclado.nextInt();
            casoDePrueba(numero);
        }
    }

    public static void casoDePrueba(int numero) {
        int num1, contador = 0;
        num1 = numero;
        int contenedor = 1;
        String x;
        if (num1 < 10) {//Si el numero solo tiene un digito se acaba.
            System.out.println(0);
        } else {
            x = String.valueOf(num1);
            do {
                contador++;
                for (int i = 0; i < x.length(); i++) {
                    contenedor = contenedor * Integer.parseInt("" + x.charAt(i));
                }
                x = String.valueOf(contenedor);
                num1 = contenedor;
                contenedor = 1;
            } while (num1 > 9);//Si el numero tienes 2 digitos el bucle sigue.
            System.out.println(contador);
        }
    }
}
