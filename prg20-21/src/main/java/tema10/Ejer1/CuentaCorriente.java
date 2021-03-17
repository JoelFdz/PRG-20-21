/*
 * Clase CuentaCorriente.
 */
package tema10.Ejer1;

/**
 *
 * @author JFSam
 */
public class CuentaCorriente {

    private Titular titular;
    private NumeroCuenta nCuenta;
    private double saldo;

    public CuentaCorriente(Titular titular, NumeroCuenta nCuenta, double saldo) {
        this.titular = titular;
        this.nCuenta = nCuenta;
        setSaldo(saldo);
    }

    public CuentaCorriente(Titular titular, NumeroCuenta nCuenta) {
        this(titular, nCuenta, 15.3);
    }

    public Titular getTitular() {
        return titular;
    }

    public NumeroCuenta getnCuenta() {
        return nCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingresar(double ingreso) {
        setSaldo(getSaldo() + ingreso);
    }

    public boolean reintegro(double reintegro) {
        if (reintegro > getSaldo()) {
            return false;
        } else {
            setSaldo(getSaldo() - reintegro);
            return true;
        }
    }

    @Override
    public String toString() {
        String aux;

        aux = getnCuenta().toString() + " Con saldo:" + getSaldo();
        return aux;
    }

    @Override
    public boolean equals(Object cuenta) {
        CuentaCorriente aux = (CuentaCorriente) cuenta;
        if (getnCuenta().getNumeroCuenta() == aux.getnCuenta().getNumeroCuenta()) {
            return true;
        } else {
            return false;
        }

    }

}
