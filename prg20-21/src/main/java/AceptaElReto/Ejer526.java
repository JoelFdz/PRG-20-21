/*
 * Ejercicio 526
 */
package AceptaElReto;

import java.util.*;

/**
 *
 * @author JFSam
 */
public class Ejer526 {

    public static void main(String[] args) {
        ArrayList<String> tPeriodica = new ArrayList<>(Arrays.asList(
                "h", "li", "na", "k", "rb", "cs", "fr", "uue",
                "be", "mg", "ca", "sr", "ba", "ra", 
                "sc", "y", 
                "ti", "zr", "hf", "rf", 
                "v", "nb", "ta", "db", 
                "cr", "mo", "w", "sg", 
                "mn", "tc", "re", "bh", 
                "fe", "ru", "os", "hs",
                "co", "rh", "ir", "mt",
                "ni", "pd", "pt", "ds",
                "cu", "ag", "au", "rg",
                "zn", "cd", "hg", "cn",
                "b", "al", "ga", "in", "tl", "nh",
                "c", "si", "ge", "sn", "pb", "fl",
                "n", "p", "as", "sb", "bi", "mc",
                "o", "s", "se", "te", "po", "lv",
                "f", "cl", "br", "i", "at", "ts",
                "he", "ne", "ar", "kr", "xe", "rn", "og",
                "la", "ce", "pr", "nd", "pm", "sm", "eu", "gd", "tb", "dy", "ho", "er", "tm", "yb", "lu",
                "ac", "th", "pa", "u", "np", "pu", "am", "cm", "bk", "cf", "es", "fm", "md", "no", "lr"));
        final Scanner teclado = new Scanner(System.in);
        String palabra;

        while (teclado.hasNext()) {
            palabra = teclado.nextLine().replace(" ", "").toLowerCase();
            if (contieneAtomos(palabra, tPeriodica)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }

    static boolean contieneAtomos(String frase, ArrayList tabla) {
        String aux;
        int contador = 0, x = 2;
        boolean cierto = false;

        for (int i = 0; i < frase.length(); i = i + 2) {
            if(x>frase.length()){
                x = frase.length();
            }
            aux = frase.substring(i, x);
            x = x + 2;
            if (tabla.contains(aux)) {
                contador++;
            }

        }
        if ((frase.length() / 2) == contador) {
            cierto = true;
        }
        return cierto;
    }

}
