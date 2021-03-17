/*
 * Clase Asignatura.
 */
package tema9.Ejer6;

/**
 *
 * @author JFSam
 */
public class Asignatura {
    private int identificador;
    private double calificacion;
    
    public Asignatura(int identificador){
        this.identificador = identificador;
        setCalificacion(0);
    }

    public int getIdentificador() {
        return identificador;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        if (calificacion < 0.0) {
            this.calificacion = -1 * calificacion;
        } else {
            this.calificacion = calificacion;
        }

    }
    
    
}
