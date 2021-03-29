/*
 * Ventana por consola
 */
package swing;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class VentanaConsola implements IVentana{
    
    private double dato1, dato2, resultado;
    private String operacion;

    public VentanaConsola() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dato 1: ");
        dato1 = teclado.nextDouble();
        System.out.println("Operación (*, /, + , -, %):");
        teclado.next();
        operacion = teclado.nextLine();
        System.out.println("Dato 2 :");
        dato2 = teclado.nextDouble();
    }

    @Override
    public double getDato1() {
        return this.dato1;
    }

    @Override
    public double getDato2() {
        return this.dato2;
    }

    @Override
    public String getOperador() {
        return this.operacion;
    }

    @Override
    public void setResultado(double d) {
        System.out.println("El resultado es: " + d);
    }
    
}
