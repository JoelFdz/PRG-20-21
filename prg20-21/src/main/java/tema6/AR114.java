/*
 * Ejercicio de Acepta el reto 114(PARTE DEL EJERCICIO 5 TEMA 6 )
 */
package tema6;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class AR114 {
    public static void main(String[] args) {
        int contador, num;
        String salida = "", cadena = "";
        Scanner teclado = new Scanner (System.in);
        contador = teclado.nextInt();
        for (int i = 0; i < contador; i++) {
            do {
                num = teclado.nextInt();
            } while (num <= 0);
            for (int num2 = num - 1; num2 > 0; num2--){
                num = num * (num2);
            }
            cadena = String.valueOf(num);
            salida = salida + cadena.substring(cadena.length()-1)+"\n";
        }
        System.out.print(salida);
    }
}
