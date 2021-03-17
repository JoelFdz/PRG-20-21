/*
 * Ejercicio 515
 */
package AceptaElReto;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer515 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int copasParaMesa;
        while (true) {
            copasParaMesa = teclado.nextInt();
            //Nº de copas del total.
            if (copasParaMesa == 0) {//Si se introducen 0 copas se acaba.
                break;
            }
            System.out.println(paseos(copasParaMesa, 1));
        }
    }

    public static int paseos(int nºCopas, int nºTurno) {
        int nºpaseos = 0;
        
        if (nºCopas <= 0) {
            return nºpaseos;
        }
        if (nºTurno == 1) {
            nºTurno++;
            nºpaseos = paseos(nºCopas - 1, nºTurno) + 1;
            return nºpaseos;
            //Primer paseo siempre hermano pequeño(1 copa.)
            //Se suma un paseo.
            //Se resta una copa del total en este paseo y se llama al turno del mayor (Turno 2).
        }else if (nºCopas % 2 == 0) {
            nºpaseos = paseos(nºCopas - 2, 1) + 1;
            return nºpaseos;
            //Si el total de copas es par se restan 2 copas.
            //Se suma un paseo.
            //Se llama al turno de menor de nuevo (Turno 1).
        } else {
            nºpaseos = paseos(nºCopas - 1, 1) + 1;
            return nºpaseos;
            //Se resta una copa del total si las copas no son pares.
            //Se suma un paseo.
            //Se llama al turno de menor de nuevo (Turno 1).
        }
    }
}
