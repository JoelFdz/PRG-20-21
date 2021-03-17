/*
 * Clase Velero
 */
package tema10.Ejer2;

/**
 *
 * @author JFSam
 */
public class Velero extends Barco {

    private int numMastiles;

    public Velero(int matricula, short eslora, int añoFabricacion, int numMastiles) {
        super(matricula, eslora, añoFabricacion);
        setNumMastiles(numMastiles);
    }

    public void setNumMastiles(int numMastiles) {
        if (numMastiles < 0) {
            this.numMastiles = numMastiles * -1;
        } else {
            this.numMastiles = numMastiles;
        }
    }

    @Override
    public double precioAlquiler() {
        int mastiles;
        double total;

        mastiles = this.numMastiles * 5;
        total = super.precioAlquiler() + mastiles;
        return total;
    }

}
