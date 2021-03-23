/*
 * Pila de Arrays.
 */
package tema11.Ejer1;

/**
 *
 * @author JFSam
 */
public class PilaArrays implements Pila {

    private Object[] datos;
    private int tamaño;
    private int cont;

    public PilaArrays(int tamaño) {
        this.tamaño = tamaño;
        this.cont = 0;
    }

    @Override
    public boolean crear() {
        this.datos = new Object[this.tamaño];
        return true;
    }

    @Override
    public boolean apilar(Object o) {
        if (cont == this.tamaño) {
            return false;
        } else {
            this.datos[cont] = o;
            this.cont++;
            return true;
        }
    }

    @Override
    public Object desapilar() {
        Object aux = null;
        for (int i = this.tamaño - 1; i >= 0; i--) {
            if (this.datos[i] != null) {
                aux = this.datos[i];
                this.datos[i] = null;
                break;
            } else {
                aux = null;
            }
        }
        this.cont--;
        if (this.cont < 0) {
            this.cont = 0;
        }
        return aux;
    }

    @Override
    public Object cima() {
        Object aux = null;
        for (int i = this.tamaño - 1; i >= 0; i--) {
            if (this.datos[i] != null) {
                aux = this.datos[i];
                break;
            } else {
                aux = null;
            }
        }
        this.cont--;
        return aux;
    }

    @Override
    public boolean vacia() {
        int contLocal = 0;
        for (int i = 0; i < this.datos.length; i++) {
            if (this.datos[i] == null) {
                contLocal++;
            } else {
                contLocal = contLocal;
            }
        }
        if (contLocal == this.datos.length) {
            return true;
        } else {
            return false;
        }
    }
}
