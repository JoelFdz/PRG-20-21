/*
 * Ejercicio 10
 */
package tema7;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author JSam
 */
public class Ejer10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String hobbies;
        System.out.println("Introduce tus hobbies separados por comas.");
        hobbies = teclado.nextLine();
        rellenar(hobbies);
        mayus(rellenar(hobbies));
        minus(rellenar(hobbies));
        compuestos(rellenar(hobbies));
        masDiez(rellenar(hobbies));
    }

    private static StringTokenizer rellenar(String hobbies) {
        StringTokenizer misHobbies = new StringTokenizer(hobbies, ",");
        return misHobbies;

    }

    private static void mayus(StringTokenizer misHobbies) {
        String mayusS;
        int contador = 0;
        char C;
        StringBuilder sbMayusS = new StringBuilder();
        while (misHobbies.hasMoreTokens()) {
            mayusS = misHobbies.nextToken();
            C = mayusS.trim().charAt(0);

            if (Character.isUpperCase(C)) {
                sbMayusS.append(mayusS + ",");
                contador++;
            }
        }
        System.out.println("En mayusculas --> " + contador + "--> " + sbMayusS);
    }

    private static void minus(StringTokenizer misHobbies) {
        String minusS;
        int contador = 0;
        char C;
        StringBuilder sbMinusS = new StringBuilder();
        while (misHobbies.hasMoreTokens()) {
            minusS = misHobbies.nextToken();
            C = minusS.trim().charAt(0);

            if (Character.isLowerCase(C)) {
                sbMinusS.append(minusS + ",");
                contador++;
            }
        }
        System.out.println("En minusculas --> " + contador + " --> " + sbMinusS);
    }

    private static void compuestos(StringTokenizer misHobbies) {
        String compuestosS;
        int contador = 0;
        StringBuilder sbCompuestosS = new StringBuilder();
        while (misHobbies.hasMoreTokens()) {
            compuestosS = misHobbies.nextToken().trim();
            if(compuestosS.contains(" ")){
                sbCompuestosS.append(compuestosS + ",");
                contador++;
            }
        }
        System.out.println("Son compuestos --> " + contador + " --> " + sbCompuestosS);
    }

    private static void masDiez(StringTokenizer misHobbies) {
        String masDe10;
        int contador = 0;
        StringBuilder sbMasDe10 = new StringBuilder();
        while (misHobbies.hasMoreTokens()) {
            masDe10 = misHobbies.nextToken();
            if (masDe10.length() > 10) {
                sbMasDe10.append(masDe10 + ",");
                contador++;
            }
        }
        System.out.println("Tienen mas de 10 letas --> " + contador + " --> " + sbMasDe10);
    }
}
