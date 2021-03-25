/*
 * Clase para pruebas de 4 y 5
 */
package tema11.Ejer2;

import com.github.javafaker.Faker;
import java.util.*;
import tema11.Ejer3.OrdenacionPorEdadDeMayorAMenor;
import tema11.Ejer3.OrdenacionPorSaldoCreciente;

/**
 *
 * @author JFSam
 */
public class Test2 {

    public static void main(String[] args) {
        ArrayList<Cliente> prueba = new ArrayList();
        ArrayList<Cliente> prueba2 = new ArrayList();
        OrdenacionPorEdadDeMayorAMenor o1 = new OrdenacionPorEdadDeMayorAMenor();
        OrdenacionPorSaldoCreciente o2 = new OrdenacionPorSaldoCreciente();

        rellenar(prueba);
        rellenar(prueba2);

        Collections.sort(prueba, o2);
        Collections.sort(prueba2, o1);
        mostrar(prueba);
        System.out.println("----------\t----------\t----------\t----------");
        mostrar(prueba2);
        Collections.sort(prueba);
        System.out.println("----------\t----------\t----------\t----------");
        mostrar(prueba);

    }

    private static void rellenar(List x) {
        Faker faker = new Faker();
        Cliente c;
        int numDni;
        String nombre;
        double saldo;

        for (int i = 0; i < 50; i++) {
            numDni = faker.number().numberBetween(10000000, 99999999);
            nombre = faker.name().firstName();
            saldo = faker.number().numberBetween(1, 5000);
            c = new Cliente(numDni, nombre);
            c.setEdad(faker.number().numberBetween(1, 120));
            c.setSaldo(saldo);
            x.add(c);
        }
    }

    private static void mostrar(List x) {
        for (Object c : x) {
            System.out.println(c);
        }
    }
}
