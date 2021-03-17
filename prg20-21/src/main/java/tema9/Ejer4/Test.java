/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.Ejer4;

/**
 *
 * @author JFSam
 */
public class Test {
    public static void main(String[] args) {
       Alumno a1 = new Alumno(1, 123, 100);
       Alumno a2 = new Alumno(1, 123, 100);
        System.out.println("" + a1.equals(a2));
        
        
//        
        Curso c = new Curso();
        if (c.consulta(32)==null) {
            System.out.println("No esta");
            
        }
        Alumno modi = new Alumno(2, "Joel");
        Instituto insti1 = new Instituto();
        
        System.out.println(c.toString());
        System.out.println(c.consulta(1).toString());
        System.out.println(c.modificacion(23, modi));

        System.out.println(insti1.listadoGeneral());
        System.out.println(insti1.consultaAlumno(56));
    }
}
