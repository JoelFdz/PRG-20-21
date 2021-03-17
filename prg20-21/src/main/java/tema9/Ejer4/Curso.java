/*
 * Clase Curso.
 */
package tema9.Ejer4;

import com.github.javafaker.Faker;
import java.util.*;

public class Curso {
    private String nombre;
    private HashMap<Integer, Alumno> alumanado;

    public Curso() {
        nombre = "";
        alumanado = new HashMap();
        
        // Añadimos datos aleatorios
        Faker faker = new Faker();
        Alumno alu;
        for (int i = 1; i < 21; i++) {
            alu = new Alumno();
            alu.setNombre(faker.name().firstName().toString());
            alu.setApellido1(faker.name().lastName().toString());
            alu.setApellido2(faker.name().lastName().toString());
            alu.setExpediente(faker.number().numberBetween(1, 200));
            alu.setCuenta(faker.number().numberBetween(100, 1500));
            alu.setNif(faker.number().numberBetween(10000000, 99999999));

            alumanado.put((Integer) alu.getExpediente(), alu);
        }
    }

    public HashMap getAlumanado() {
        return this.alumanado;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setAlumando(HashMap<Integer, Alumno> nuevoAlumanado){
        this.alumanado = nuevoAlumanado;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        StringBuilder x = new StringBuilder();
        Integer indx;
        Set s = alumanado.keySet();
        Iterator it = s.iterator();
        
        while (it.hasNext()) {
            indx = (Integer) it.next();
            x.append("\n" + indx + "\t\t\t" + alumanado.get(indx).toString());
        }        
        return x.toString();
    }

    public Alumno consulta(int nºExpediente) {        
        Integer x = nºExpediente;

        if (!alumanado.containsKey(x)) {
            return null; 
        } else {
            return alumanado.get(x);
        }
        
    }

    public boolean modificacion(int nºExpediente, Alumno alum) {
        Integer x = nºExpediente;
        if (!alumanado.containsKey(x)) {
            return false;
        } else {
            alumanado.replace(x, alum);
            return true;
        }
    }
}
