/*
 * Clase Revista.
 */
package tema10.EjerClase1;

/**
 *
 * @author JFSam
 */
public class Revista extends Item {

    private String numRevista;
    private String adjunto;

    public Revista(String titulo, short numPaginas, String editorial, String fechaPubli, String tematica, String numRevista, String adjunto) {
        super(titulo, numPaginas, editorial, fechaPubli, tematica);
        setNumRevista(numRevista);
        setAdjunto(adjunto);
    }

    public Revista() {
        this("", (short) 0, "", "", "", "", "");
    }

    public String getNumRevista() {
        return numRevista;
    }

    public String getAdjunto() {
        return adjunto;
    }

    public void setNumRevista(String numRevista) {
        this.numRevista = numRevista;
    }

    public void setAdjunto(String adjunto) {
        this.adjunto = adjunto;
    }

    @Override
    public String toString() {
        String aux;

        aux = "Numero de Revista: " + getNumRevista() + "\t\t" + "Tematica: " + super.getTematica() + "\t\t" + " Con adjunto: " + getAdjunto();
        return aux;
    }

}
