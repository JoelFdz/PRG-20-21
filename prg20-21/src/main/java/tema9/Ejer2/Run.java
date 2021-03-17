/*
 * Ejercicio 2.
 */
package tema9.Ejer2;

import com.github.javafaker.Faker;
import java.util.*;

/**
 *
 * @author JFSam
 */
public class Run {

    public static void main(String[] args) {
        pruebaMetodos();
        System.out.println("");
        HashMap<Nif, Persona> lista = new HashMap();
        lista.putAll(generarPersonas());
        mostrarLista(lista);

    }

    public static void pruebaMetodos() {
        Persona p1 = new Persona();
        Nif n1 = new Nif(78456325);

        p1.setNombre("Joel");
        p1.setApellido1("Fernandez");
        p1.setApellido2("Sampedro");
        p1.setEdad(19);
        p1.setNif(18186101);

        p1.getNombre();
        p1.getApellido1();
        p1.getApellido2();
        p1.getEdad();
        System.out.println("DNI de p1");
        System.out.println(p1.getDNI());
        System.out.println("Datos de p1");
        System.out.println(p1.mostrarDatos());

        n1.getNumero();
        n1.getLetra();
        n1.mutador(65231425);
        n1.leer();
        System.out.println(n1.mostrar());
    }

    public static HashMap generarPersonas() {
        HashMap<Nif, Persona> aux = new HashMap();
        Faker faker = new Faker();
        Persona p;
        Nif n;
        String nombre, apellido1, apellido2, dni = "";
        int numDni, edad, x;

        for (int i = 0; i < 25; i++) {
            nombre = faker.artist().name().toString();
            apellido1 = faker.job().field().toString();
            apellido2 = faker.job().field().toString();
            edad = (int) (Math.random() * 80);
            for (int j = 0; j < 8; j++) {
                x = (int) (Math.random() * 9);
                dni = dni + x;
            }
            numDni = Integer.valueOf(dni);
            dni = "";

            p = new Persona();
            p.setNombre(nombre);
            p.setApellido1(apellido1);
            p.setApellido2(apellido2);
            p.setEdad(edad);
            p.setNif(numDni);
            n = new Nif(numDni);

            aux.put(n, p);
        }
        return aux;
    }

    public static void mostrarLista(HashMap<Nif, Persona> lista) {
        String x;
        Set s = lista.keySet();
        Iterator it = s.iterator();
        System.out.println("DNI"+"\t\t"+"Nombre"+"\t\t"+"Apellidos"+"\t\t"+"Edad"+"\t"+"DNI de la persona");
        while (it.hasNext()) {
            Nif indx = (Nif) it.next();
            x = indx.mostrar() + "\t" + lista.get(indx).mostrarDatos();
            System.out.println(x);
        }
    }
}
