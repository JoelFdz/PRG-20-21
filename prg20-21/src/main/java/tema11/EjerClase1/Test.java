/*
 * Clase Para Pruebas
 */
package tema11.EjerClase1;

import java.util.*;

/**
 *
 * @author JFSam
 */
public class Test {
    public static void main(String[] args) {
        Alumno a1 = new Alumno(1, "Uno");
        Alumno a2 = new Alumno(2, "Dos");
        Alumno a3 = new Alumno(2, "Dos");
        ComparadorNombre cn = new ComparadorNombre();
        ComparadorNotaMedia cnm = new ComparadorNotaMedia();
        TreeSet<Alumno> ts = new TreeSet(cnm);
        
        a3.setNotaMedia((float) 5.2);
        a2.setNotaMedia((float) 6.2);
        a1.setNotaMedia((float) 2.2);
        
        ts.add(a2);
        ts.add(a1);
        ts.add(a3);
        
        Iterator it;
        it = ts.iterator();
        while(it.hasNext()){
            System.out.println("" + it.next());
        }
                
    }
}
