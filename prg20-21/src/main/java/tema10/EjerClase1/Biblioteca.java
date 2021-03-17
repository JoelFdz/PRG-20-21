/*
 * Clase Biblioteca
 */
package tema10.EjerClase1;

import java.util.*;

/**
 *
 * @author JFSam
 */
public class Biblioteca {

    private int numSecciones;
    private String nombre;
    private String direccion;
    private int numItems;
    private int numPlazas;
    private HashMap<Integer, Item> listadeitems;

    public Biblioteca(int numSecciones, String nombre, String direccion, int numPlazas) {
        setNumSecciones(numSecciones);
        setNombre(nombre);
        setDireccion(direccion);
        setNumPlazas(numPlazas);
        this.numItems = 0;
        this.listadeitems = new HashMap();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNumItems() {
        return numItems;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumSecciones(int numSecciones) {
        if (numSecciones < 0) {
            this.numSecciones = numSecciones * -1;
        } else {
            this.numSecciones = numSecciones;
        }
    }

    public void setNombre(String nombre) {
        if (nombre.equals(" ")) {
            this.nombre = "Desconocido";
        } else {
            this.nombre = nombre;
        }
    }

    public void setDireccion(String direccion) {
        if (direccion.equals(" ")) {
            this.direccion = "No disponible";
        } else {
            this.direccion = direccion;
        }
    }

    public void setNumPlazas(int numPlazas) {
        if (numPlazas < 0) {
            this.numPlazas = numPlazas * -1;
        } else {
            this.numPlazas = numPlazas;
        }
    }

    public void altaItem(Item item) {
        int aux = this.numItems;
        this.listadeitems.put(aux, item);
        this.numItems++;
    }

    public void bajaItem(Integer numItem) {
        this.listadeitems.remove(numItem);
        this.numItems--;
    }

    public String listarRevistas() {
        StringBuilder aux = new StringBuilder();
        Item iAux;
        Integer indx;
        Iterator it = this.listadeitems.keySet().iterator();
        aux.append("Revistas:");
        while (it.hasNext()) {
            indx = (Integer) it.next();
            iAux = this.listadeitems.get(indx);
            if (iAux instanceof Revista) {
                aux.append("\n" + indx + " " + iAux.toString());
            }
        }
        return aux.toString();
    }

    public String listarLibros() {
        StringBuilder aux = new StringBuilder();
        Item iAux;
        Integer indx;
        Iterator it = this.listadeitems.keySet().iterator();
        aux.append("Libros:");
        while (it.hasNext()) {
            indx = (Integer) it.next();
            iAux = this.listadeitems.get(indx);
            if (iAux instanceof Libro) {
                aux.append("\n" + indx + " " + iAux.toString());
            }
        }
        return aux.toString();
    }
    
    public String listarTodo(){
        StringBuilder aux = new StringBuilder();
        StringBuilder aux2 = new StringBuilder();
        Item iAux;
        Integer indx;
        Iterator it = this.listadeitems.keySet().iterator();
        aux.append("Libros:");
        while(it.hasNext()){
            indx = (Integer) it.next();
            iAux = this.listadeitems.get(indx);
            if(iAux instanceof Libro){
                aux.append("\n" + indx + " " + iAux.toString());
            }else{
                aux2.append("\n" + indx + " " + iAux.toString());
            }
            
        }
        aux.append("\n\n" + "Revistas:" + aux2);
        return aux.toString();
    }
    
    public String listadoPorTema(String tema){
        StringBuilder aux = new StringBuilder();
        Item iAux;
        Integer indx;
        Iterator it = this.listadeitems.keySet().iterator();
        aux.append("Articulos sobre el tema:" + tema);
        while (it.hasNext()) {
            indx = (Integer) it.next();
            iAux = this.listadeitems.get(indx);
            if(iAux.getTematica().equals(tema)){
                aux.append("\n" + indx + " " + iAux.toString());
            }
        }
        return aux.toString();
    }
}
