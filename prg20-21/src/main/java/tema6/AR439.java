/*
 * Ejercicio de Acepta el reto 439(PARTE DEL EJERCICIO 5 TEMA 6 )
 */
package tema6;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class AR439 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        char f1, f2;
        String o1 = new String("");
        String o2 = new String("");
        String salida = new String("");
        int contador=1, cont2;
        cont2 = teclado.nextInt();
        teclado.nextLine();
        for (;contador<=cont2;contador++) {
            int operadores1, operadores2;
            o1 = teclado.next();
            o2 = teclado.next();
            operadores1 = Integer.parseInt(o1.substring(2));
            f1 = (o1.substring(0, 1)).charAt(0);
            operadores2 = Integer.parseInt(o2.substring(2));
            f2 = (o2.substring(0, 1)).charAt(0);
            if (f1 != 'D' && f2 != 'D') {
                salida = salida + "D="+(operadores1*operadores2)+"\n";
            }else if (f1 != 'V' && f2 != 'V'){
                if (f1=='D') {
                    salida = salida + "V="+(operadores1/operadores2)+"\n"; 
                }else{
                    salida = salida + "V="+(operadores2/operadores1)+"\n";
                }
            }else{
                if (f1=='D') {
                    salida = salida + "T="+(operadores1/operadores2)+"\n";
                }else{
                    salida = salida + "T="+(operadores2/operadores1)+"\n";
                }
            } 
        }
        System.out.print(salida); 
    }
}

