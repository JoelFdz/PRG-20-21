/*
 * CLase Item.
 */
package tema10.EjerClase1;

/**
 *
 * @author JFSam
 */
public class Item {

    private String titulo;
    private short numPaginas;
    private String editorial;
    private String fechaPubli;
    private String tematica;
    private boolean estaPrestado;

    public Item(String titulo, short numPaginas, String editorial, String fechaPubli, String tematica) {
        setTitulo(titulo);
        setNumPaginas(numPaginas);
        setEditorial(editorial);
        setFechaPubli(fechaPubli);
        setTematica(tematica);
        this.estaPrestado = false;
    }

    public Item() {
        this("", (short) 0, "", "", "");

    }

    public String getTitulo() {
        return titulo;
    }

    public short getNumPaginas() {
        return numPaginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getFechaPubli() {
        return fechaPubli;
    }

    public String getTematica() {
        return tematica;
    }

    public boolean getEstaPrestado() {
        return estaPrestado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumPaginas(short numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setFechaPubli(String fecha) {
        this.fechaPubli = fecha;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public void prestado() {
        this.estaPrestado = !this.estaPrestado;
    }

    @Override
    public String toString() {
        String aux;

        aux = "Titulo: " + getTitulo() + "\t\t" + "Tematica: " + getTematica() + "\t\t" + "Publicado el: " + getFechaPubli();
        return aux;
    }

}
