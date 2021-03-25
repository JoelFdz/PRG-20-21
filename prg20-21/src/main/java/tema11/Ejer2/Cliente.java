/*
 * Clase Cliente Tema11
 */
package tema11.Ejer2;

import java.util.Objects;
import tema9.Ejer2.Nif;

/**
 *
 * @author JFSam
 */
public class Cliente implements Comparable<Object> {

    private Nif dni;
    private String nombre;
    private int edad;
    private double saldo;

    public Cliente(int dni, String nombre) {
        this.dni = new Nif(dni);
        this.nombre = nombre;
        setEdad(edad);
        setSaldo(saldo);
    }

    public Nif getDni() {
        return dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Dni: " + this.dni.mostrar() + "\t Nombre: " + nombre + "\t Edad: " + edad + "\t Saldo=" + saldo;
    }

    @Override
    public boolean equals(Object o) {
        Cliente aux = (Cliente) o;
        if (this.dni.getNumero() == aux.dni.getNumero()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(Object o) {
        Cliente aux = (Cliente) o;
        int dif;

        dif = this.dni.getNumero() - aux.dni.getNumero();
        return dif;
    }


    
}
