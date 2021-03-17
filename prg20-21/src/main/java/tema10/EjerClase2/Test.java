/*
 * Pruebas
 */
package tema10.EjerClase2;

/**
 *
 * @author JFSam
 */
public class Test {
    public static void main(String[] args) {
        Matriz m1 = new Matriz(5);
        Cubo c1 = new Cubo(3);
        
        m1.rellenar();
        c1.rellenar(5);
        System.out.println(m1.mostrar());
        System.out.println(c1.mostrar());
    }
}
