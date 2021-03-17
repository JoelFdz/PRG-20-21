/*
 * Clase Garaje
 */
package tema9.Ejer5;

/**
 *
 * @author JFSam
 */
public class Garaje {

    private Coche coche;
    private String averia;
    private int cochesAtendidos;

    public Garaje() {
        coche = null;
        this.cochesAtendidos = 0;
    }

    public boolean atenderCoche(Coche coche, String averia) {
        if (this.coche == null) {
            this.coche = coche;
            this.averia = averia.toLowerCase();
            if(averia.toLowerCase().equals("aceite")){
                coche.getMotor().serLitrosAceite(10);
            }
            return true;
        } else if (this.coche == coche) {
            coche.acumularAveria(Math.random()*1000);
            return true;
        } else {
            return false;
        }
    }

    public Coche devolverCoche(){
        Coche aux = this.coche;
        this.coche = null;
        this.averia = "";
        this.cochesAtendidos = this.cochesAtendidos++;
        return aux;
    }
}
