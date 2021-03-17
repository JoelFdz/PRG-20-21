/*
 * Clase Run o Test para probar cosas.
 */
package tema10.Ejer1;

/**
 *
 * @author JFSam
 */
public class Run {

    public static void main(String[] args) {
        Titular t1 = new Titular("Primero", "Apellidos", 19);
        NumeroCuenta n1 = new NumeroCuenta(1212, 3333, 0001, 1);
        Titular t2 = new Titular("Segundo", "Apellidos", 20);
        NumeroCuenta n2 = new NumeroCuenta(1212, 4322, 0005, 2);
        CuentaCorriente cc1 = new CuentaCorriente(t1, n1, 500);
        CuentaAhorro ca1 = new CuentaAhorro(t2, n2);

        System.out.println("Saldo de la cuenta corriente: " + cc1.getSaldo());
        System.out.println("Saldo de la cuenta de ahorro: " + ca1.getSaldo());

        System.out.println("Son las cuentas iguales? " + cc1.equals(ca1));
        System.out.println(cc1.getTitular());
        System.out.println(ca1.getTitular());
        System.out.println(ca1.toString());
        ca1.ingresar(25);

    }
}
