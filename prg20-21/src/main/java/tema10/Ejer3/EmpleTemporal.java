/*
 * Clase de Empleado Temporal
 */
package tema10.Ejer3;

import java.util.*;

/**
 *
 * @author JFSam
 */
public class EmpleTemporal extends Empleado {

    private GregorianCalendar fechaAlta;
    private GregorianCalendar fechaBaja;

    public EmpleTemporal(String dni, String nombre, short edad, GregorianCalendar fechaAlta) {
        super(dni, nombre, edad);
        this.fechaAlta = fechaAlta;
    }

    public GregorianCalendar getFechaAlta() {
        return fechaAlta;
    }

    public GregorianCalendar getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(GregorianCalendar fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    @Override
    public double calcularSueldo() {
        return (double) super.getSalarioMinimo();
    }

}
