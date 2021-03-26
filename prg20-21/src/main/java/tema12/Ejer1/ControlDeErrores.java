/*
 * Clase del Ejer1 del Tema 12.
 */
package tema12.Ejer1;

/**
 *
 * @author JFSam
 */
public class ControlDeErrores {

    public static void main(String[] args) {
        ControlDeErrores ce = new ControlDeErrores();

        ce.metodo1(5, 3);
    }

    public void metodo1(int dividendo, int divisor) {
        Resultado aux = new Resultado(0, 0);
        double cociente = 0;
        double resto;

        try {
            cociente = (double) dividendo / divisor;
            resto = dividendo - (divisor * cociente);
            aux = new Resultado(cociente, resto);

        } catch (java.lang.ArithmeticException o) {
            System.out.println("No se puede dividir entre 0");
            System.out.println(aux);
        } finally {
            System.out.println(aux);
        }
    }
}
