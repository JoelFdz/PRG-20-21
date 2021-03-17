/*
 * Clase Usuario
 */
package tema10.EjerClase1;

/**
 *
 * @author JFSam
 */
public class Usuario {

    private String nombreCompleto;
    private String dni;
    private int numSocio;
    private int telefono;
    private int cont;
    private Item[] listaPrestamos;
    private boolean estaSancionado;

    public Usuario(String nombreCompelto, String dni, int numSocio, int tlf) {
        setNombreCompleto(nombreCompelto);
        setDni(dni);
        setNumSocio(numSocio);
        setTelefono(tlf);
        this.cont = 0;
        this.listaPrestamos = new Item[5];
        this.estaSancionado = false;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String tomarItem(Item item) {
        if (cont >= 5) {
            return "Ha alcanzado el limite de prestamos.";
        } else {
            if (item.getEstaPrestado() == true) {
                return "No disponible actualmente.";
            } else {
                this.listaPrestamos[cont] = item;
                item.prestado();
                cont++;
                return "Prestamo realizado con exito";
            }
        }
    }

    public String devolverItem(Item item) {
        Item vacio;
        vacio = new Item("", (short) 12, "", "", "");
        if (cont == 0) {
            return "No tiene nada que devolver.";
        } else {
            for (int i = 0; i < this.listaPrestamos.length; i++) {
                if (this.listaPrestamos[i] == item) {
                    this.listaPrestamos[i] = vacio;
                }
            }
            item.prestado();
            cont--;
            return "Devuelto con exito.";
        }
    }

    public String listarPrestamos() {
        StringBuilder aux = new StringBuilder();
        Item iAux;

        aux.append("Usuario de Nombre: " + this.nombreCompleto + "\t" + "Con DNI: " + this.dni + "\n" + "Lista de prestados:");
        for (int i = 0; i < 5; i++) {
            iAux = this.listaPrestamos[i];
            if (iAux instanceof Revista) {
                aux.append("\n" + "Revista: " + iAux.toString());
            } else if (iAux instanceof Libro) {
                aux.append("\n" + "Libro: " + iAux.toString());
            } else {
                aux.append("\n" + "Espacio disponible");
            }

        }
        return aux.toString();
    }

}
