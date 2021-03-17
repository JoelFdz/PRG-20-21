/*
 * Clase CuentaAhorro.
 */
package tema10.Ejer1;

/**
 *
 * @author JFSam
 */
public class CuentaAhorro extends CuentaCorriente {

    private double interes;

    public CuentaAhorro(Titular titular, NumeroCuenta nCuenta, double saldo, double interes) {
        super(titular, nCuenta, saldo);
        this.interes = interes;
    }

    public CuentaAhorro(Titular titular, NumeroCuenta nCuenta, double interes) {
        this(titular, nCuenta, 15.3, interes);
    }

    public CuentaAhorro(Titular titular, NumeroCuenta nCuenta) {
        this(titular, nCuenta, 15.3, 2.5);
    }

    public double getInteres() {
        return interes;
    }

    @Override
    public Titular getTitular() {
        return super.getTitular();
    }

    public void calcularInteres() {
        ingresar((getSaldo() * (getInteres()/100)));
    }
}
