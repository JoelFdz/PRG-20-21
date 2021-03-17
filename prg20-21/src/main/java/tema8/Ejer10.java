/*
 * Ejercicio 10.
 * Escribir un programa que cree un diccionario simulando una cesta de la compra. El programa
 * debe preguntar el artículo y su precio y añadir el par al diccionario, hasta que el usuario decida
 * terminar. Después se debe mostrar por pantalla la lista de la compra y el coste total, con el siguiente formato:
 * LISTA DE LA COMPRA
 * Artículo  Precio
 * Tomates   2,49 €
 * Lechuga   0,76 €
 * Lubina   12,50 €
 * Total compra xxx,xx €
 */
package tema8;

import java.util.*;

/**
 *
 * @author JFSam
 */
public class Ejer10 {
    public static void main(String[] args) {
        HashMap listaCompra;
        
        listaCompra = (HashMap) rellenar();
        System.out.println("LISTA DE LA COMPRA");
        System.out.println("Articulo Precio");
        mostrar(listaCompra);
        System.out.println("Total de compra " + calculoTotal(listaCompra)+"€");
        
    }
    
    private static Map rellenar() {
        Map<String, Double> aux = new HashMap();
        Scanner teclado = new Scanner(System.in);
        String articulo;
        Double precio;

        do {
            System.out.println("Introduce el nombre del articulo, para finalizar introduce la palabra 'fin'");
            articulo = teclado.next();
            if (articulo.equals("fin")) {
                break;
            }
            System.out.println("Introduce el precio del articulo introducido anterior mente.");
            precio = teclado.nextDouble();

            aux.put(articulo, precio);

        } while (true);

        return aux;
    }
    
    private static Double calculoTotal(Map<String, Double> mapa){
        Double total = 0.0;
        Set s = mapa.keySet();
        Iterator it = s.iterator();
        while(it.hasNext()){
            String indx = (String) it.next();
            total = total + mapa.get(indx);
        }
        
        return total;
    }
    
    private static void mostrar(Map<String, Double> mapa){
        Set s = mapa.keySet();
        Iterator it = s.iterator();
        while(it.hasNext()){
            String indx = (String) it.next();
            System.out.println(indx + "        " + mapa.get(indx) +"€");
        }
    }
    
    
}
