/*
 * Clase Profesor
 */
package tema9.Ejer6;

import com.github.javafaker.Faker;

/**
 *
 * @author JFSam
 */
public class Profesor {

    public void ponerNotas(Alumno x){
        x.getAsignatura1().setCalificacion(Math.random()*10);
        x.getAsignatura2().setCalificacion(Math.random()*10);
        x.getAsignatura3().setCalificacion(Math.random()*10);
    }
    
    public double calcularMedia(Alumno x){
        double media;
        
        media = (x.getAsignatura1().getCalificacion()+x.getAsignatura2().getCalificacion()+x.getAsignatura3().getCalificacion())/3;
        return media;
    } 
}
