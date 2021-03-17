/*
 * Clase Reloj.
 */
package tema9.Ejer7;

import java.util.*;

/**
 *
 * @author JFSam
 */
public class Reloj {

    private int horas, minutos, segundos;

    public Reloj(int horas, int minutos, int segundos) {
        setHoras(horas);
        setMinutos(minutos);
        setSegundos(segundos);
        validar();
    }

    public Reloj() {
        this(0, 0, 0);
        validar();
    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public void leer() {
        Scanner teclado = new Scanner(System.in);
        int horas, minutos, segundos;
        System.out.println("Introduce las horas");
        horas = teclado.nextInt();
        System.out.println("Introduce los minutos");
        minutos = teclado.nextInt();
        System.out.println("Introduce los segundos");
        segundos = teclado.nextInt();
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        validar();

    }

    private void validar() {
        int horas, minutos, segundos, resto;

        if (getSegundos() == 60) {
            resto = getSegundos() / 60;
            segundos = getSegundos() - (resto * 60);
            setMinutos(getMinutos() + resto);
            setSegundos(segundos);
        }
        if (getSegundos() > 60) {
            resto = getSegundos() % 60;
            segundos = getSegundos() - (resto * 60);
            setMinutos(getMinutos() + resto);
            setSegundos(segundos);
        }
        if (getMinutos() == 60) {
            resto = getMinutos() / 60;
            minutos = getMinutos() - (resto * 60);
            setMinutos(minutos);
            setHoras(getHoras() + resto);
        }
        if (getMinutos() > 60) {
            resto = getMinutos() % 60;
            minutos = getMinutos() - (resto * 60);
            setMinutos(minutos);
            setHoras(getHoras() + resto);
        }
        while (getHoras() > 24) {
            horas = getHoras() - 24;
            setHoras(horas);
        }

    }

    public String toString() {
        int horas = getHoras();
        int minutos = getMinutos();
        int segundos = getSegundos();
        String aux, horasAux, minutosAux, segundosAux;

        if (horas < 10) {
            horasAux = "0" + horas;
        } else {
            horasAux = "" + horas;
        }
        if (minutos < 10) {
            minutosAux = "0" + minutos;
        } else {
            minutosAux = "" + minutos;
        }
        if (segundos < 10) {
            segundosAux = "0" + segundos;
        } else {
            segundosAux = "" + segundos;
        }

        aux = horasAux + ":" + minutosAux + ":" + segundosAux;
        return aux;
    }

    public int aSegundos() {
        int total, horasS, minutosS, segundos;

        horasS = getHoras() * 3600;
        minutosS = getMinutos() * 60;
        segundos = getSegundos();

        total = horasS + minutosS + segundos;
        return total;
    }

    public void deSegundos(int totalSegundos) {
        int horas, minutos, segundos;

        horas = (totalSegundos / 3600);
        minutos = ((totalSegundos - horas * 3600) / 60);
        segundos = totalSegundos - (horas * 3600 + minutos * 60);
        setHoras(horas);
        setMinutos(minutos);
        setSegundos(segundos);
        validar();
    }

    public int segundosDesde(int hora) {
        int total, horaReloj;

        horaReloj = aSegundos();
        total = horaReloj - (hora * 3600);
        return total;
    }

    public void siguiente(int totalSegundos) {
        if (totalSegundos > 0) {
            setSegundos(this.segundos + totalSegundos);

            while (getSegundos() > 60) {
                setSegundos(getSegundos() - 60);
                setMinutos(getMinutos() + 1);
                if (getMinutos() == 60) {
                    setMinutos(0);
                    setHoras(getHoras() + 1);
                    if (getHoras() == 24) {
                        setHoras(0);
                    }
                }
            }
        }
        validar();
    }

    public void anterior(int totalSegundos) {
        if (totalSegundos > 0) {
            setSegundos(this.segundos - totalSegundos);

            while (getSegundos() < 0) {
                setSegundos(getSegundos() + 60);
                setMinutos(getMinutos() - 1);
                if (getMinutos() < 0) {
                    setMinutos(59);
                    setHoras(getHoras() - 1);
                    if (getHoras() < 0) {
                        setHoras(23);
                    }
                }
            }
        }
    }

    public Reloj copia() {
        Reloj aux;

        aux = new Reloj(getHoras(), getMinutos(), getSegundos());
        return aux;
    }

    @Override
    public boolean equals(Object o) {
        Reloj aux = (Reloj) o;

        if (getHoras() == aux.getHoras() && getMinutos() == aux.getMinutos() && getSegundos() == aux.getSegundos()) {
            return true;

        } else {
            return false;
        }

    }

    public String menorQue(int hora, int min, int seg) {
        String aux = "La hora es menor", aux2 = "La hora no es menor.";
        boolean x = false;
        if (hora > getHoras()) {
            x = true;
        } else if (hora == getHoras()) {
            if (min > getMinutos()) {
                x = true;
            } else if (min == getMinutos()) {
                if (seg > getSegundos()) {
                    x = true;
                } else {
                    x = false;
                }
            }
        } else {
            x = false;
        }
        if (x) {
            return aux;
        } else {
            return aux2;
        }
    }

    public String mayorQue(int hora, int min, int seg) {
        String aux = "La hora es mayor", aux2 = "La hora no es mayor.";
        boolean x = false;
        if (hora < getHoras()) {
            x = true;
        } else if (hora == getHoras()) {
            if (min < getMinutos()) {
                x = true;
            } else if (min == getMinutos()) {
                if (seg < getSegundos()) {
                    x = true;
                } else {
                    x = false;
                }
            }
        } else {
            x = false;
        }
        if (x) {
            return aux;
        } else {
            return aux2;
        }
    }

}
