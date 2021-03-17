/*
 * Clase embarcaciones deportivas.
 */
package tema10.Ejer2;

/**
 *
 * @author JFSam
 */
public class Deportiva extends Barco {

    private int cv;

    public Deportiva(int matricula, short eslora, int añoFabricacion, int cv) {
        super(matricula, eslora, añoFabricacion);
        setCv(cv);
    }

    public void setCv(int cv) {
        if (cv < 0) {
            this.cv = cv * -1;
        } else {
            this.cv = cv;
        }
    }

    @Override
    public double precioAlquiler() {
        int cv;
        double total;

        cv = this.cv * 1;
        total = super.precioAlquiler() + cv;
        return total;
    }

}
