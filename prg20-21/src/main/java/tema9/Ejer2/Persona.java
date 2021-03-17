/*
 * Ejercicio 2.
 */
package tema9.Ejer2;

/**
 *
 * @author JFSam
 */
public class Persona {

    private String nombre;
    private String ape1;
    private String ape2;
    private int edad;
    private Nif dni;

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return ape1;
    }

    public String getApellido2() {
        return ape2;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        this.ape1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.ape2 = apellido2;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNif(int numeroDni) {
        this.dni = new Nif(numeroDni);
    }

    public String getDNI() {
        String aux = dni.mostrar();
        return aux;
    }

    public String mostrarDatos() {
        String aux;

        aux = nombre + "\t" + ape1 + "," + ape2 + "\t" + edad + "\t" + getDNI();
        return aux;
    }

}
