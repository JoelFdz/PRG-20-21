/*
 * Clase Empleado
 */
package tema10.Ejer3;

/**
 *
 * @author JFSam
 */
public abstract class Empleado {

    private String dni;
    private String nombre;
    private short edad;
    private final float salarioMinimo;

    public Empleado(String dni, String nombre, short edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.salarioMinimo = 645;
    }

    public float getSalarioMinimo() {
        return salarioMinimo;
    }

    @Override
    public String toString() {
        return "DNI: " + dni + "\t Nombre: " + nombre + "\t Edad: " + edad;
    }

    public abstract double calcularSueldo();

}
