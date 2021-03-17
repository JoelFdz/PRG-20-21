/*
 * Ejercicio 3
 */
package tema6;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer3 {
    public static void main(String[] args) {
        String contraseña,prueba;
        int intentos = 0,n;
        System.out.println("J1, introduce una contraseña:");
        Scanner teclado = new Scanner (System.in);
        contraseña = teclado.nextLine();
        do{
            System.out.println("J2, prueba a adivinar la contraseña:");
            prueba= teclado.nextLine();
            if(contraseña.equals(prueba)){
                System.out.println("Has adivinado enhorabuena.");
                break;
            }else if(intentos<4){
                System.out.println("Prueba otra vez.");
                intentos++;
            }
            if(intentos>=4 && intentos<7){
                System.out.println("La contraseña tiene " + contraseña.length() + " caracteres.");
                intentos++;
            }
            if(intentos == 7){
                char ultimo = contraseña.charAt(contraseña.length()-1);
                char penultimo = contraseña.charAt(contraseña.length()-2);
                System.out.println("Los dos ultimos caracteres son: "+penultimo+ultimo);
                intentos++;
            }
            if(intentos>7){
                n=contraseña.compareTo(prueba);
                if(n<0){
                    System.out.println("La contraseña es menor alfabeticamente.");
                }else{
                    System.out.println("La contrasela es mayor alfabeticamente.");
                }
            }
        }while(!contraseña.matches(prueba));
    }
}


