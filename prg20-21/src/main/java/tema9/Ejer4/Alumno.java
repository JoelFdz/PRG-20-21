/*
 * Clase Alumno.
 */
package tema9.Ejer4;

import tema9.Ejer1.CuentaCorriente;
import tema9.Ejer2.Nif;

/**
 *
 * @author JFSam
 */
public class Alumno {

    private int nExpediente;
    private Nif dni;
    private CuentaCorriente cuenta;
    private String nombre;
    private String ape1;
    private String ape2;

    public Alumno(int nExpediente, int dni, int saldo, String nombre, String ape1, String ape2) {
        setExpediente(nExpediente);
        setNif(dni);
        setCuenta(saldo);
        setNombre(nombre);
        setApellido1(ape1);
        setApellido2(ape2);
    }

    public Alumno() {
        this(0, 0, 0, " ", " ", " ");
    }

    public Alumno(int ne, int numDni, int saldoCuenta) {
        this(ne, numDni, saldoCuenta, " ", " ", " ");

    }

    public Alumno(int nExpediente, String nombre) {
        this(nExpediente, 0, 0, nombre, " ", " ");
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApe1() {
        return this.ape1;
    }

    public String getApe2() {
        return this.ape2;
    }

    public Nif getNif() {
        return this.dni;
    }

    public CuentaCorriente getCuenta() {
        return this.cuenta;
    }

    public int getExpediente() {
        return this.nExpediente;
    }

    public void setNombre(String nombre) {
        if (nombre.length() == 0) {
            this.nombre = "Desconocido";
        } else {
            this.nombre = nombre;
        }
    }

    public void setApellido1(String apellido1) {
        this.ape1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.ape2 = apellido2;
    }

    public void setNif(int numDni) {
        this.dni = new Nif(numDni);
    }

    public void setCuenta(int saldo) {
        this.cuenta = new CuentaCorriente(saldo);
    }

    public void setExpediente(int nExpediente) {
        // Aqui podria haber mucho código y con el this en el contructor
        // no se ejecutaría
        if (nExpediente < 0) {
            this.nExpediente = -1 * nExpediente;
        } else {
            this.nExpediente = nExpediente;
        }

    }

    @Override
    public String toString() {
        String aux;
        aux = getNif().mostrar() + "\t" + getNombre() + "\t" + getExpediente();
        return aux;
    }

    @Override
    public boolean equals(Object o) {
        Alumno x = (Alumno) o;

        String dni = getNif().mostrar();
        String dni2 = x.getNif().mostrar();
        if (getExpediente() == x.getExpediente() && dni.equals(dni2)) {
            return true;
        } else {
            return false;
        }

    }

}
