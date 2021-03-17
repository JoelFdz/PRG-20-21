/*
 * Clase Libro
 */
package tema10.EjerClase1;

/**
 *
 * @author JFSam
 */
public class Libro extends Item {

    private String autor;
    private String isbn;

    public Libro(String titulo, short numPaginas, String editorial, String fechaPubli, String tematica, String autor, String isbn) {
        super(titulo, numPaginas, editorial, fechaPubli, tematica);
        setAutor(autor);
        setIsbn(isbn);
    }

    public Libro() {
        this("", (short) 0, "", "", "", "", "");
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        String aux;

        aux = "ISBN: " + getIsbn() + "\t\t" + "Titulo del Libro: " + super.getTitulo() + "\t\t" + "Autor: " + getAutor();
        return aux;
    }

}
