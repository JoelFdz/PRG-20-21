/*
 * Codifica ahora la clase Hora12 heredando de la clase Reloj, con la diferencia de que las horas
 * solo pueden tomar un valor entre 1 y las 12 y se distingue la mañana de la tarde mediante
 * "am" o "pm". Modifica la funcionalidad de aquellos métodos que consideres oportuno.
 */
package tema9.Ejer7;

/**
 *
 * @author JFSam
 */
public class Hora12 extends Reloj {

    public Hora12(int hora, int minutos, int segundos) {
        super(hora, minutos, segundos);
    }

    public Hora12() {
        this(0, 0, 0);
    }

    @Override
    public String toString() {
        int horasAux = 0;
        String minAux = "", segAux = "";
        String aux;
        if (super.getHoras() == 12) {
            horasAux = 12;
            if (super.getMinutos() < 10) {
                minAux = "0" + super.getMinutos();
            } else {
                minAux = minAux + super.getMinutos();
            }
            if (super.getSegundos() < 10) {
                segAux = "0" + super.getSegundos();
            } else {
                segAux = segAux + super.getMinutos();
            }
            aux = horasAux + ":" + minAux + ":" + segAux + " pm";
        } else if (super.getHoras() > 12) {
            horasAux = super.getHoras() - 12;
            super.setHoras(horasAux);
            aux = super.toString() + " pm";
        } else {
            aux = super.toString() + " am";
        }

        return aux;
    }

}
