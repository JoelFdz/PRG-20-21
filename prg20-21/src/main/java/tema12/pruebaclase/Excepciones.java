/*
 * Clase para excepciones.
 */
package tema12.pruebaclase;

/**
 *
 * @author JFSam
 */
public class Excepciones {

    public static void main(String[] args) {
        int x = 5, d = 0, r;
        try{
           r = (x / d);
        System.out.println(r); 
        }catch(java.lang.ArithmeticException objeto){
            System.out.println("El divisor no puede ser 0");
            //Guardar en un log de ERRORES
            //objeto.printStackTrace();
        }
        
    }
}
