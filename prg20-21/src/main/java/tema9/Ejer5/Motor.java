/*
 * Clase Motor.
 */
package tema9.Ejer5;

import javax.swing.text.StyleConstants;

/**
 *
 * @author JFSam
 */
public class Motor {

    private int litrosDeAceite;
    private int potencia;

    public Motor(int potencia) {
        this.potencia = potencia;
        serLitrosAceite(0);
    }

    public int getLitrosDeAceite() {
        return litrosDeAceite;
    }

    public int getPotencia() {
        return potencia;
    }

    public void serLitrosAceite(int litrosAceite) {
        this.litrosDeAceite = this.litrosDeAceite + litrosAceite;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    public String toString(){
        String aux;
        
        aux = "Potencia: " + getPotencia() + "\t" +"Aceite: " + getLitrosDeAceite();
        return aux;
    }

}
