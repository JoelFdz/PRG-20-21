/*
 * Clase Instituto.
 */
package tema9.Ejer4;

import java.util.*;

/**
 *
 * @author JFSam
 */
public class Instituto {
    private Curso[] cursos;
    
    public Instituto(){
        cursos = new Curso[10];
        iniciar();
    }

    private void iniciar() {        
        String c = "";
        Curso cur;

        for (int i = 0; i < 10; i++) {
            cur = new Curso();
            c = "Curso " + (i + 1);             
            cur.setNombre(c);
            this.cursos[i] = cur;
        }
    }

    public String listadoGeneral() {
        StringBuilder x = new StringBuilder();
        System.out.println("IDcurso " + "\t\t" + "Datos del alumno.");
        for (int i = 0; i < 10; i++) {
            x.append("\n" + "-----------------------------------------------------------------------------------------------------" 
            + "\n" +  cursos[i].getNombre() + "\t\t" + cursos[i]);
        }
        return x.toString();
    }

    public String consultaAlumno(int nExpediente) {
        Curso aux;
        Alumno alumnoAux;        
        
        for (int i = 0; i < 10; i++) {
            aux = cursos[i];
            alumnoAux = aux.consulta(nExpediente);            
            if (alumnoAux!=null) {
                return alumnoAux.toString();
            }
        }        
        return  "No se encuentra a dicho alumno.";       
        
    }
}



