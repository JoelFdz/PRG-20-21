/*
 * Clase TItular
 */
package tema10.Ejer1;

/**
 *
 * @author JFSam
 */
public class Titular {
    private String nombre;
    private String apellidos;
    private int edad;

    public Titular(String nombre, String apellidos, int edad) {
        setNombre(nombre);
        setApellidos(apellidos);
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Titular: " + "Nombre: " + getNombre() +  "\t" +"Apellidos: " + getApellidos() + "\t" + "Edad:" + getEdad();
    }
    
    
    
}
