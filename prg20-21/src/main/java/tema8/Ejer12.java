/*
 * Ejercicio 12.
 * Haciendo uso de la clase Mapa crea un juego que permita al usuario dado una palabra en un
 * idioma indicar la misma palabra en idiomas diferentes (3 para el ejemplo):
 * ● El programa debe tener al menos 10 palabras con su traducción pertinente.
 * ● Al usuario se le mostrarán preguntas del tipo: ¿Cómo se dice en inglés volar?. Estas serán
 * seleccionadas al azar de entre las 10.
 * ● Los idiomas a tratar serán: Castellano, Inglés, y otro más a elegir por el alumno.
 * ● El test consta de 5 preguntas y por cada contestación se le mostrará el marcado que lleva.
 * Por ejemplo: Acertadas 2/4 ...
 */
package tema8;

import java.util.*;

/**
 *
 * @author JFSam
 */
public class Ejer12 {

    public static void main(String[] args) {
        HashMap<String, String[]> palabras = new HashMap();
        iniciar(palabras);
        juego(palabras);
    }

    private static void iniciar(HashMap<String, String[]> listaPalabras) {
        String idioma1 = "Castellano", idioma2 = "Ingles", idioma3 = "Italiano";
        String[] pEsp = {"hola", "hombre", "coche", "comer", "niño", "edificio", "avion", "rueda", "playa", "manzana"};
        String[] pIng = {"hello", "man", "car", "eat", "kid", "building", "plane", "wheel", "beach", "apple"};
        String[] pIta = {"ciao", "uomo", "macchina", "mangiar", "costruzione", "aereo", "ruota", "spiaggia", "mela"};

        listaPalabras.put(idioma1, pEsp);
        listaPalabras.put(idioma2, pIng);
        listaPalabras.put(idioma3, pIta);
    }

    private static void juego(HashMap<String, String[]> listaPalabras) {
        Scanner teclado = new Scanner(System.in);
        String respuesta;
        String[] pEsp = listaPalabras.get("Castellano");
        String[] pIng = listaPalabras.get("Ingles");
        String[] pIta = listaPalabras.get("Italiano");
        int contadorA = 0, totales = 0, pregunta, nPalabra;
        
        for (int i = 0; i < 5; i++) {
            pregunta = (int) (Math.random()*2);
            nPalabra = (int) (Math.random()*10);
            if(pregunta % 2 == 0){
                System.out.println("Como se escribe en Italiano la palabra en castellano: " + pEsp[nPalabra]);
                respuesta = teclado.nextLine().toLowerCase();
                if(respuesta.equals(pIta[nPalabra])){
                    totales++;
                    contadorA++;
                    System.out.println("Llevas acertadas " + contadorA + "/" + totales);
                }else{
                    totales++;
                    System.out.println("Has fallado, llevas "+ contadorA + "/" + totales + " acertadas");
                }
            }else{
                System.out.println("Como se escibre en Ingles la palabra en castellano: "+ pEsp[nPalabra]);
                respuesta = teclado.nextLine().toLowerCase();
                if(respuesta.equals(pIng[nPalabra])){
                    totales++;
                    contadorA++;
                    System.out.println("Llevas acertadas " + contadorA + "/" + totales);
                }else{
                    totales++;
                    System.out.println("Has fallado, llevas "+ contadorA + "/" + totales + " acertadas");
                }
            }
        }
        System.out.println("Tu puntuación final es de " + contadorA + " aciertos de " + totales);
    }
}
