/*
 * Clase para Pila de LinkedList.
 */
package tema11.Ejer1;

import java.util.LinkedList;

/**
 *
 * @author JFSam
 */
public class PilaLinkedList implements Pila {

    private LinkedList<Object> datos;
    private int cont;

    public PilaLinkedList() {
        crear();
    }

    @Override
    public boolean crear() {
        this.datos = new LinkedList();
        return true;
    }

    @Override
    public boolean apilar(Object o) {
        this.datos.add(o);
        return true;
    }

    @Override
    public Object desapilar() {
        Object aux;
        
        if (vacia()) {
            return null;
        } else {
            this.cont = this.datos.size() - 1;
            aux = this.datos.get(cont);
            this.datos.remove(cont);
            return aux;
        }
    }

    @Override
    public Object cima() {
        Object aux;
        
        if (vacia()) {
            return null;
        } else {
            this.cont = this.datos.size() - 1;
            aux = this.datos.get(cont);
            return aux;
        }
    }

    @Override
    public boolean vacia() {
        return this.datos.isEmpty();
    }

}
