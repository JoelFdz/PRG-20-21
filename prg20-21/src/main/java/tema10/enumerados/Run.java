/*
 * Clase para Pruebas.
 */
package tema10.enumerados;

import static tema10.enumerados.enumerados.*;

/**
 *
 * @author JFSam
 */
public class Run {

    public static void main(String[] args) {
        StringBuilder aux = new StringBuilder();
        AlfabetoRadiofonico af = AlfabetoRadiofonico.JULIET;
        Genero g = Genero.OTRO;
        PuntosCardinales pc = PuntosCardinales.NOROESTE;
        System.out.println(pc + "\n");

        for (AlfabetoRadiofonico af2 : AlfabetoRadiofonico.values()) {
            System.out.println(af2.toString());
        }

        if (af == AlfabetoRadiofonico.JULIET) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }

        switch (g) {
            case MASCULINO:
                System.out.println("De genero " + g.toString());
                break;
            case FEMENINO:
                System.out.println("De genero " + g.toString());
                break;
            case OTRO:
                System.out.println("Genero no definido.");
                break;
        }
        
        aux.append(" " + af.toString());
        af = AlfabetoRadiofonico.OSCAR;
        aux.append(" " + af.toString());
        af = AlfabetoRadiofonico.ROMEO;
        aux.append(" " + af.toString());
        af = AlfabetoRadiofonico.GOLF;
        aux.append(" " + af.toString());
        af = AlfabetoRadiofonico.ECHO;
        aux.append(" " + af.toString());
        System.out.println(aux.toString());
        
        
    }
}
