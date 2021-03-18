/*
 * Clase para realizar pruebas.
 */
package tema10.Ejer3;

import java.util.*;

/**
 *
 * @author JFSam
 */
public class Test {
    public static void main(String[] args) {
        EmpleTemporal eP = new EmpleTemporal("1234567P", "EmpleTemp", (short)31, new GregorianCalendar(2020, 3, 15));
        EmplePorHoras eH = new EmplePorHoras("2652547O", "EmpPorHoras", (short)27, 9.45);
        EmpleFijo eF = new EmpleFijo("7592315I", "EmpleFijo", (short)45, 7);
        
        eH.setNumHoras(35);
        eF.setComplemento(55.45);
        System.out.println("Salario del emple1: " + eP.toString() + "\t" + eP.calcularSueldo() + "€");
        System.out.println("Salario del emple2: " + eH.toString() + "\t" + eH.calcularSueldo() + "€");
        System.out.println("Salario del emple3: " + eF.toString() + "\t" + eF.calcularSueldo() + "€");
    }
}
