/*
 * Clase Test.
 */
package tema9.Ejer7;

/**
 *
 * @author JFSam
 */
public class Test {

    public static void main(String[] args) {
        Reloj r1 = new Reloj(26, 59, 59);
        Reloj r2 = new Reloj(26, 59, 59);
        Hora12 r3 = new Hora12(13, 25, 45);
        Hora12 r4 = new Hora12(12, 55, 15);
        Hora12 r5 = new Hora12(2, 30, 45);

        System.out.println(r1.aSegundos());
        System.out.println(r1.getHoras());
        System.out.println(r1.getMinutos());
        System.out.println(r1.getSegundos());
        System.out.println(r1.toString());
        System.out.println(r1.menorQue(24, 5, 1));
        System.out.println(r1.mayorQue(24, 5, 3));
        System.out.println("");
        System.out.println(r1.equals(r2));
        System.out.println("Segundo de las 12 hasta la hora del reloj: " + r1.segundosDesde(12));
        r1.siguiente(150);
        System.out.println(r1.toString());
        r2.anterior(14400);
        System.out.println(r2.toString());

        System.out.println(r3.aSegundos());
        System.out.println(r3.getHoras());
        System.out.println(r3.getMinutos());
        System.out.println(r3.getSegundos());
        System.out.println(r3.mayorQue(14, 25, 22));
        System.out.println(r4.mayorQue(4, 45, 22));
        r3.siguiente(3600);
        r5.anterior(3600);
        System.out.println(r3.getHoras());
        System.out.println(r3.toString());
        System.out.println(r4.toString());
        System.out.println(r5.toString());
    }
}
