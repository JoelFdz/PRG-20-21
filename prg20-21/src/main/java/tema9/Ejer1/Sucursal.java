

/*
 * Clase Sucursal
 */
package tema9.Ejer1;

import com.github.javafaker.Faker;
import java.util.*;


/**
 *
 * @author JFSam
 */
public class Sucursal {
    
    private int nSucursal;
    private String direccion;
    private ArrayList<CuentaCorriente> baseDatos;
    
    public Sucursal() {
        baseDatos = new ArrayList();
    }

    public Sucursal(int nSucur, String sDirec, int nºCuentas) {
        nSucursal = nSucur;
        direccion = sDirec;
        baseDatos = new ArrayList();
        iniciarSucursal(nºCuentas);
    }

    public void añadirCuenta(CuentaCorriente cuenta) {
        baseDatos.add(cuenta);
    }

    public void iniciarSucursal(int nºcuentas) {
        Faker faker = new Faker();
        CuentaCorriente ct;
        int saldo, limite;
        String dni, nombre;

        for (int i = 0; i < nºcuentas; i++) {
            saldo = (int) (Math.random() * 500);
            limite = (int) ((Math.random() * 500));
            if(limite > saldo){
                saldo = limite;
                limite = saldo;
            }
            dni = faker.address().buildingNumber();
            nombre = faker.company().name().toString();
            ct = new CuentaCorriente(saldo, -limite, dni, nombre);
            añadirCuenta(ct);
        }
    }

    public void listado() {
        for (CuentaCorriente cuenta : baseDatos) {
            System.out.println(cuenta.mostrarInfo());
        }
    }
}
