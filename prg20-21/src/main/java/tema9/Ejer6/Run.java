/*
 * Clase para pruebas
 */
package tema9.Ejer6;

/**
 *
 * @author JFSam
 */
public class Run {
    public static void main(String[] args) {
        Asignatura asig1 = new Asignatura(1);
        Asignatura asig2 = new Asignatura(2);
        Asignatura asig3 = new Asignatura(3);
        Profesor prof1 = new Profesor();
        Alumno alu1 = new Alumno(1, "Tulipan");
        
        alu1.setAsignatura1(asig1);
        alu1.setAsignatura2(asig2);
        alu1.setAsignatura3(asig3);
        
        prof1.ponerNotas(alu1);
        System.out.println(prof1.calcularMedia(alu1));
    }
}
