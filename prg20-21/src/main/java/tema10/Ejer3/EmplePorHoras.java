/*
 * Clase de Empleado Por Horas
 */
package tema10.Ejer3;

/**
 *
 * @author JFSam
 */
public class EmplePorHoras extends Empleado {

    private final double precioHora;
    private int numHoras;

    public EmplePorHoras(String dni, String nombre, short edad, double precioHora) {
        super(dni, nombre, edad);
        this.precioHora = precioHora;
    }

    public void setNumHoras(int numHoras) {
        if (numHoras < 0) {
            this.numHoras = numHoras * -1;
        } else {
            this.numHoras = numHoras;
        }

    }

    @Override
    public double calcularSueldo() {
        double salario;

        salario = (double) super.getSalarioMinimo() + (this.precioHora * this.numHoras);
        return salario;
    }

}
