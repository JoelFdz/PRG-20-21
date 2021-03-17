/*
 * Test ejercicio 3.
 */
package tema9.Ejer3;

/**
 *
 * @author JFSam
 */
public class Test {
    public static void main(String[] args) {
        Racional r;
        Racional r2;
        Racional result;
        r = new Racional();
        r2 = new Racional(4, 3);
        
        r.setNumerador(2);
        r.setDenominador(4);
        System.out.println(r.comparacion(r2));
        result = r.suma(r2);
        System.out.println(result.mostrar());
    }
}
