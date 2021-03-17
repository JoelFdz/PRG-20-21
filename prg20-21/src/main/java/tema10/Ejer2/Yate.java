/*
 * Clase Yate de Lujo
 */
package tema10.Ejer2;

/**
 *
 * @author JFSam
 */
public class Yate extends Barco {

    private int cv;
    private int numCamarotes;

    public Yate(int matricula, short eslora, int añoFabricacion, int cv, int numCamarotes) {
        super(matricula, eslora, añoFabricacion);
        setCv(cv);
        setNumCamarotes(numCamarotes);
    }

    public void setCv(int cv) {
        if (cv < 0) {
            this.cv = cv * -1;
        } else {
            this.cv = cv;
        }
    }

    public void setNumCamarotes(int numCamarotes) {
        if (numCamarotes < 0) {
            this.numCamarotes = numCamarotes * -1;
        } else {
            this.numCamarotes = numCamarotes;
        }
    }

    @Override
    public double precioAlquiler() {
        int cv, camarotes;
        double total;

        cv = this.cv * 1;
        camarotes = this.numCamarotes * 20;
        total = super.precioAlquiler() + cv + camarotes;
        return total;
    }

}
