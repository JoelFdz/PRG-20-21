/*
 * Clase Número Cuenta
 */
package tema10.Ejer1;

/**
 *
 * @author JFSam
 */
public class NumeroCuenta {

    private int banco, sucursal, digitoControl, numeroCuenta;

    public NumeroCuenta(int banco, int sucursal, int digitoControl, int numeroCuenta) {
        setBanco(banco);
        setSucursal(sucursal);
        setDigitoControl(digitoControl);
        setnCuenta(numeroCuenta);
    }

    public int getBanco() {
        return banco;
    }

    public int getSucursal() {
        return sucursal;
    }

    public int getDigitoControl() {
        return digitoControl;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setBanco(int banco) {
        this.banco = banco;
    }

    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }

    public void setDigitoControl(int digitoControl) {
        this.digitoControl = digitoControl;
    }

    public void setnCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return "NumeroCuenta: " + " Banco:" + getBanco() + " Sucursal:" + getSucursal() + " DigitoControl:" + getDigitoControl() + " NºCuenta:" + getNumeroCuenta();
    }

}
