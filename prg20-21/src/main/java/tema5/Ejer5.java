/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Ejer5 {
    public static void mayorque(int num1,int num2,int num3){
        if(num1>num2 && num1>num3){
            System.out.println(num1+" es mayor que "+num2+" y "+num3);
        }else if(num2>num1 && num2>num3){
            System.out.println(num2+" es mayor que "+num1+" y "+num3);
        }else if(num3>num1 && num3>num2){
            System.out.println(num3+" es mayor que "+num1+" y "+num2);
        }else{
            System.out.println("Los numeros deben de ser distintos.");
        }
    }
    public static void main(String[] args) {
        System.out.println("Introduce el primer nº:");
        Scanner teclado = new Scanner (System.in); 
        int num1 = teclado.nextInt();
        System.out.println("Introduce el segundo nº:");
        int num2 = teclado.nextInt();
        System.out.println("Introduce un tercer nº:");
        int num3 = teclado.nextInt();
        mayorque(num1,num2,num3);
    }
}
