/*
 * Ejercicio 3.
 */
package tema9.Ejer3;

import java.util.Scanner;

/**
 *
 * @author JFSam
 */
public class Racional {

    private int numerador;
    private int denominador;

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Racional() {
        this.numerador = 0;
        this.denominador = 0;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public Racional suma(Racional x) {
        Racional aux = new Racional();
        if (x.getDenominador() == getDenominador()) {
            aux.setNumerador(x.getNumerador() + getNumerador());
            aux.setDenominador(x.getDenominador());
        }else {
            aux.setNumerador((x.getNumerador() * getDenominador()) + (getNumerador() * x.getDenominador()));
            aux.setDenominador(x.getDenominador() * getDenominador());
        }
        return aux;
    }

    public Racional resta(Racional x) {
        Racional aux = new Racional();

        if (x.getDenominador() == getDenominador()) {
            aux.setNumerador(x.getNumerador() - getNumerador());
            aux.setDenominador(x.getDenominador());
        }else {
            aux.setNumerador((x.getNumerador() * getDenominador()) - (getNumerador() * x.getDenominador()));
            aux.setDenominador(x.getDenominador() * getDenominador());
        }
        return aux;
    }

    public Racional multiplicacion(Racional x) {
        Racional aux = new Racional();

        aux.setNumerador(x.getNumerador() * getNumerador());
        aux.setDenominador(x.getDenominador() * getDenominador());
        return aux;
    }

    public Racional division(Racional x) {
        Racional aux = new Racional();

        aux.setNumerador(x.getNumerador() * getDenominador());
        aux.setDenominador(x.getDenominador() * getNumerador());
        return aux;
    }

    public boolean comparacion(Racional x) {
        if (x.getNumerador() == getNumerador() && x.getDenominador() == getDenominador()) {
            return true;
        } else {
            return false;
        }
    }

    public Racional copia(Racional x) {
        Racional aux = new Racional();

        aux.setNumerador(x.getNumerador());
        aux.setDenominador(x.getDenominador());
        return aux;
    }

    public void setRacional() {
        Scanner teclado = new Scanner(System.in);
        int n, d;
        
        System.out.println("Numerador para el racional.");
        n = teclado.nextInt();
        System.out.println("Denominador para el racional.");
        d = teclado.nextInt();
        this.numerador = n;
        this.denominador = d;

    }

    public double calcularReal() {
        double aux;

        aux = (double) (getNumerador() / getDenominador());
        return aux;
    }

    public String mostrar() {
        String aux;
        
        aux = getNumerador() + "\n" + "----" + "\n" + getDenominador();
        
        return aux;
    }

}

