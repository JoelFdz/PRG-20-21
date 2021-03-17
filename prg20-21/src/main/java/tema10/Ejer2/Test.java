/*
 * Clase Test
 */
package tema10.Ejer2;

import java.util.*;

/**
 *
 * @author JFSam
 */
public class Test {

    public static void main(String[] args) {
        GregorianCalendar fechaInicio = new GregorianCalendar(2020, 3, 15);
        GregorianCalendar fechaFinal = new GregorianCalendar(2021, 3, 15);
        Barco b = new Barco(1, (short) 10, 2001);
        Velero v = new Velero(2, (short) 20, 1999, 3);
        Deportiva d = new Deportiva(3, (short) 10, 2005, 450);
        Yate y = new Yate(4, (short) 30, 2012, 750, 6);

        Alquiler a1 = new Alquiler("nombre1", "12345", 1, fechaInicio, fechaFinal, b);
        Alquiler a2 = new Alquiler("nombre 2", "5678", 2, fechaInicio, fechaFinal, v);
        Alquiler a3 = new Alquiler("nombre 3", "5178", 3, fechaInicio, fechaFinal, d);
        Alquiler a4 = new Alquiler("nombre 4", "9678", 4, fechaInicio, fechaFinal, y);

        System.out.println(a1.calcularAlquiler() + "€");
        System.out.println(a2.calcularAlquiler() + "€");
        System.out.println(a3.calcularAlquiler() + "€");
        System.out.println(a4.calcularAlquiler() + "€");

    }
}
