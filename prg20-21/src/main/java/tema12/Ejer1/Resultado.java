/*
 * Clase para el Ejercicio 2.
 */
package tema12.Ejer1;

/**
 *
 * @author JFSam
 */
public class Resultado {
    private double cociente;
    private double resto;

    public Resultado(double cociente, double resto) {
        this.cociente = cociente;
        this.resto = resto;
    }

    @Override
    public String toString() {
        return "Cociente: " + cociente + "\tResto: " + resto;
    }
    
    
}
