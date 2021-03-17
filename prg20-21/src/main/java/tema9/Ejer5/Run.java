/*
 * Clase para pruebas.
 */
package tema9.Ejer5;

/**
 *
 * @author JFSam
 */
public class Run {
    public static void main(String[] args) {
        Garaje g1 = new Garaje();
        Coche c1 = new Coche("Toyota", "Land Cruiser");
        Coche c2 = new Coche("Toyota", "Supra MK-4");
        
        g1.atenderCoche(c1, "Perdida de liquido de Dirección");
        g1.atenderCoche(c1, "Rotura en la aleta lateral trasera derecha");
        c1 = g1.devolverCoche();
        
        g1.atenderCoche(c2, "Faro izquierdo trasero roto");
        g1.atenderCoche(c2, "Cambio del disco de embrague");
        c2 = g1.devolverCoche();
        
        g1.atenderCoche(c1, "Aceite");
        c1 = g1.devolverCoche();
        
        g1.atenderCoche(c2, "Cambio pinzas de freno");
        c2 = g1.devolverCoche();
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        
    }
}
