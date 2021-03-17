/*
 * Ejercicio 1.
 */
package tema9.Ejer1;

/**
 *
 * @author JFSam
 */
public class Test {
    public static void main(String[] args) {
        CuentaCorriente c1 = new CuentaCorriente("CuentaJoel", "1234567J");
        CuentaCorriente c2 = new CuentaCorriente(200);
        CuentaCorriente c3 = new CuentaCorriente(500, -100, "236458K", "CuentaJoel");
        
        c1.ingresar(1200);
        c2.sacarDinero(25);
        c3.sacarDinero(50);
        
        c1.mostrarInfo();
        c2.mostrarInfo();
        c3.mostrarInfo(); 
        
    }
}
