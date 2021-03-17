/*
 * Clase Alumno.
 */
package tema9.Ejer6;

/**
 *
 * @author JFSam
 */
public class Alumno {
    private int nExpediente;
    private String nombreCompleto;
    private Asignatura asignatura1;
    private Asignatura asignatura2;
    private Asignatura asignatura3;
    
    public Alumno(int nExpediente, String nombreCompleto) {
        this.nExpediente = nExpediente;
        setNombreCompleto(nombreCompleto);
        asignatura1 = null;
        asignatura2 = null;
        asignatura3 = null;
    }

    public Alumno(int nExpediente) {
        this(nExpediente, " ");
    }

    public int getnExpediente() {
        return nExpediente;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public Asignatura getAsignatura1() {
        return asignatura1;
    }

    public Asignatura getAsignatura2() {
        return asignatura2;
    }

    public Asignatura getAsignatura3() {
        return asignatura3;
    }

    private void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setAsignatura1(Asignatura asignatura1) {
        this.asignatura1 = asignatura1;
    }

    public void setAsignatura2(Asignatura asignatura2) {
        this.asignatura2 = asignatura2;
    }

    public void setAsignatura3(Asignatura asignatura3) {
        this.asignatura3 = asignatura3;
    }
    
    
}
