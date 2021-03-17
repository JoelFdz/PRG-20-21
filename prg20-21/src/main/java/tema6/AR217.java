/*
 * Ejercicio de Acepta el reto 217(PARTE DEL EJERCICIO 5 TEMA 6 )
 */
package tema6;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class AR217 {
    public static void main(String[] args){
     //nPortal va a guardar el numero de portal.
     int nPortal;
     Scanner teclado = new Scanner (System.in);
     nPortal = teclado.nextInt();
     while(nPortal > 0){
	if(nPortal %2 == 0){ //Si el nº de portal resulta ser par pertence a la parte de la derecha de la calle.
	       System.out.println("DERECHA");
	} else { //Si el nº portal no resulta ser par pertence al lado izquierdo de l calle.
	       System.out.println("IZQUIERDA");
	}
	nPortal = teclado.nextInt();
     }
 }
}
