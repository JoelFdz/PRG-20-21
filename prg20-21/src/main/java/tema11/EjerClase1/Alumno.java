/*
 * Clase alumno
 */
package tema11.EjerClase1;

/**
 *
 * @author JFSam
 */
public class Alumno implements Comparable<Object>{

    private int numExp;
    private String nombre;
    private int edad;
    private float notaMedia;

    public Alumno(int numExp, String nombre) {
        this.numExp = numExp;
        this.nombre = nombre;
        setEdad(0);
        setNotaMedia((float) 0.0);
    }

    public String getNombre() {
        return nombre;
    }

    public float getNotaMedia() {
        return notaMedia;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }

    @Override
    public String toString() {
        return "NumExp: " + numExp + ",Nombre: " + nombre + ",Edad: " + edad + ",NotaMedia: " + notaMedia;
    }

    //Creamos el orden natural de alumno que es num de epediente.
    @Override
    public int compareTo(Object arg0) {
        Alumno aux = (Alumno) arg0;
        int dif;
        
        dif = this.numExp - aux.numExp;
        return dif;
    }

}
