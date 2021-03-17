/*
 * Ejercicio de Acepta el reto 219(PARTE DEL EJERCICIO 5 TEMA 6 )
 */
package tema6;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class AR219 {
    public static void main(String[] args) {
        int cp, ndec,cont=0, comparador=0, salida=0;
        Scanner teclado = new Scanner (System.in);
        cp = teclado.nextInt();
        while (cont < cp) {
            ndec = teclado.nextInt();
            salida = 0;
            for (int i = 0; i < ndec; i++) {
                comparador = Integer.parseInt(teclado.next());
                if (comparador%2==0) {
                    salida++;
                }
            }
            cont++;
            System.out.println(salida);
        }
    }
}
