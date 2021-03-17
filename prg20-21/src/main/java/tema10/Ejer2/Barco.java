/*
 * Clase Barco
 */
package tema10.Ejer2;

/**
 *
 * @author JFSam
 */
public class Barco {

    private int matricula;
    private short eslora;
    private int añoFabricacion;

    public Barco(int matricula, short eslora, int añoFabricacion) {
        setMatricula(matricula);
        setEslora(eslora);
        setAñoFabricacion(añoFabricacion);
    }

    public int getMatricula() {
        return matricula;
    }

    public short getEslora() {
        return eslora;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setMatricula(int matricula) {
        if (matricula < 0) {
            this.matricula = matricula * -1;
        } else {
            this.matricula = matricula;
        }
    }

    public void setEslora(short eslora) {
        if (eslora < 0) {
            this.eslora = (short) (eslora * -1);
        } else {
            this.eslora = eslora;
        }
    }

    public void setAñoFabricacion(int añoFabricacion) {
        if (añoFabricacion < 0) {
            this.añoFabricacion = añoFabricacion * -1;
        } else {
            this.añoFabricacion = añoFabricacion;
        }
    }

    public double precioAlquiler() {
        double total;

        total = (this.eslora / 10) * 2;
        return total;
    }

}
