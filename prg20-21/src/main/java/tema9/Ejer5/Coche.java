/*
 * Clase Coche.
 */
package tema9.Ejer5;

import java.text.DecimalFormat;

/**
 *
 * @author JFSam
 */
public class Coche {

    private Motor motor;
    private String marca;
    private String modelo;
    private double acumulado;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.acumulado = 0.0;
        motor = new Motor(70);
    }

    public Motor getMotor() {
        return motor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getAcumulado() {
        return acumulado;
    }

    public void acumularAveria(double importe) {
        this.acumulado = this.acumulado + importe;
    }

    public String toString() {
        DecimalFormat dc = new DecimalFormat("########.##");
        String aux;

        aux = getMotor().toString() + "\t" + "Modelo: " + getModelo() + "\t" + "Marca: " + getMarca()
                + "\t" + "Acumulado: " + dc.format(getAcumulado());
        return aux;
    }
}
