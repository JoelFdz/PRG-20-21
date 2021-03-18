/*
 * Clase EMpleado Fijo
 */
package tema10.Ejer3;

/**
 *
 * @author JFSam
 */
public class EmpleFijo extends Empleado {

    private int añosTrabajado;
    private double complemento;

    public EmpleFijo(String dni, String nombre, short edad, int añosTrabajado) {
        super(dni, nombre, edad);
        this.añosTrabajado = añosTrabajado;
        this.complemento = 50.0;
    }

    public void setComplemento(double complemento) {
        if (complemento < 0) {
            this.complemento = -1 * complemento;
        } else {
            this.complemento = complemento;
        }

    }

    @Override
    public double calcularSueldo() {
        double salario;

        salario = (double) super.getSalarioMinimo() + (this.complemento * this.añosTrabajado);
        return salario;
    }

}
