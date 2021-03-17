/*
 * Clase Alquiler
 */
package tema10.Ejer2;

import java.util.*;

/**
 *
 * @author JFSam
 */
public class Alquiler {

    private String nombre;
    private String dni;
    private GregorianCalendar fechaInicio;
    private GregorianCalendar fechaFinal;
    private int posicion;
    private Barco barco;

    public Alquiler(String nombre, String dni, int posicion, GregorianCalendar fechaInicio, GregorianCalendar fechaFinal, Barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.posicion = posicion;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.barco = barco;
    }

    public Alquiler() {
        this("Desconocido", "Desconocido", 0, new GregorianCalendar(2021, 1, 1), new GregorianCalendar(2021, 1, 1), null);
    }

    public double calcularAlquiler() {
        double total;
        long difms = fechaFinal.getTimeInMillis() - fechaInicio.getTimeInMillis();
        long diferencia = difms / (1000 * 60 * 60 * 24);

        total = diferencia * this.barco.precioAlquiler();
        return total;
    }
}
