/*
 * Clase para guardar enumerados.
 */
package tema10.enumerados;

/**
 *
 * @author Vespertino
 */
public class enumerados {

    enum Dias {
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;
    }

    enum PuntosCardinales {
        NORTE, SUR, OESTE, ESTE, NOROESTE, NORESTE, SUROESTE, SURESTE;
    }

    enum Meses {
        ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE;
    }

    enum Color {
        ROJO, AZUL, AMARILLO, VERDE, MARRON, MORADO, NARANJA, NEGRO, BLANCO;
    }

    enum Genero {
        MASCULINO, FEMENINO, OTRO;
    }

    enum ArtesMarciales {
        KARATE, JUDO, KUNGFU, BOXEO, JIUJITSU, CAPOERIA, MUAYTHAI, KRAVMAGA;
    }

    enum AlfabetoRadiofonico {
        ALPHA, BRAVO, CHARLIE, DELTA, ECHO, FOXTROT, GOLF, HOTEL, INDIA, JULIET, KILO,
        LIMA, MIKE, NOVEMBER, OSCAR, PAPA, QUEBEC, ROMEO, SIERRA, TANGO, UNIFORM, VICTOR, WHISKEY, XRAY, YANKEE, ZULU;
    }
}
