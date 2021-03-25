/*
 * Clase de pruebas.
 */
package tema11.Ejer2;

import com.github.javafaker.Faker;
import java.util.Arrays;
import tema11.Ejer3.OrdenacionPorEdadDeMayorAMenor;
import tema11.Ejer3.OrdenacionPorSaldoCreciente;

/**
 *
 * @author JFSam
 */
public class Test {

    public static void main(String[] args) {
        Cliente[] prueba = new Cliente[10];
        OrdenacionPorEdadDeMayorAMenor o1 = new OrdenacionPorEdadDeMayorAMenor();
        OrdenacionPorSaldoCreciente o2 = new OrdenacionPorSaldoCreciente();

        rellenar(prueba);
//        Arrays.sort(prueba);
//        Arrays.sort(prueba, o1);
        Arrays.sort(prueba, o2);
        mostrar(prueba);

    }

    private static void rellenar(Cliente[] prueba) {
        Faker faker = new Faker();
        Cliente c;
        int numDni;
        String nombre;
        double saldo;

        for (int i = 0; i < 10; i++) {
            numDni = faker.number().numberBetween(10000000, 99999999);
            nombre = faker.name().firstName();
            saldo = faker.number().numberBetween(1, 5000);
            c = new Cliente(numDni, nombre);
            c.setEdad(faker.number().numberBetween(1, 120));
            c.setSaldo(saldo);
            prueba[i] = c;
        }
    }

    private static void mostrar(Cliente[] prueba) {
        for (int i = 0; i < 10; i++) {
            System.out.println(prueba[i]);
        }
    }
}
