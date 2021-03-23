/*
 * Interfaz pila
 */
package tema11.Ejer1;

/**
 *
 * @author Vespertino
 */
public interface Pila {
    //Crear: se crea la pila vacia.
    public abstract boolean crear();
    //Apilar: se añade un elemento a la pila(push).
    public abstract boolean apilar(Object o);
    //Desapilar: se elimina el elemento frontal d ela pila.
    public abstract Object desapilar();
    //Cima: Devuelve el elemeto que esta en la cima d ela pila.
    public abstract Object cima();
    //Vacia: Devuelve si la pila se encuentra vacia.
    public abstract boolean vacia();
}
