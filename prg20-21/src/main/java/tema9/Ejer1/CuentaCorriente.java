/*
 * Clase CuentaCorriente
 */
package tema9.Ejer1;

/**
 *
 * @author JFSam
 */
public class CuentaCorriente {

    private int saldo;
    private int limiteDescu;
    private String nombre;
    private String dniTitu;

    public CuentaCorriente(String xnombre, String xDNITitu) {
        nombre = xnombre;
        dniTitu = xDNITitu;
        limiteDescu = -50;
    }

    public CuentaCorriente(int xsaldo) {
        saldo = xsaldo;
        limiteDescu = 0;
    }

    public CuentaCorriente(int xsaldo, int xlimite, String xDNITitu, String xnombre) {
        saldo = xsaldo;
        limiteDescu = xlimite;
        dniTitu = xDNITitu;
        nombre = xnombre;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void sacarDinero(int dinero) {
        if (saldo - dinero > limiteDescu) {
            saldo = saldo - dinero;
            System.out.println("Tu operación se realizo con exito.");
        } else {
            System.out.println("No ha sido posible realizar tu operación.");
        }
    }

    public void ingresar(int dinero) {
        saldo = saldo + dinero;
    }

    public String mostrarInfo() {
        String aux;

        aux = "DNI: " + dniTitu + " , Nombre de la cuenta: " + nombre + ", Saldo: " + saldo + ", Limite descubierto: " + limiteDescu;
        return aux;
    }

}
