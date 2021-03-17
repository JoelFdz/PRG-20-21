/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer4 {
    public static void main(String[] args) {
        System.out.println("Introduce el nº hasta el que quieres contar:");
        Scanner teclado = new Scanner (System.in); 
        int num1 = teclado.nextInt();
        System.out.println("La lista de nº es la siguiente:");
        for (int i = 0; i <= num1; i++) {
            if(i==num1){
            System.out.print(" "+i+"." );
            }else{
                System.out.print(" "+i+"," );
            }
        }
    }
}
