/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

/**
 *
 * @author JFSam
 */
public class Modelo implements IModelo {

    @Override
    public double suma(double d1, double d2) {
        return d1 + d2;
    }

    @Override
    public double resta(double d1, double d2) {
        return d1 - d2;
    }

    @Override
    public double multiplicacion(double d1, double d2) {
        return d1 * d2;
    }

    @Override
    public double division(double d1, double d2) {
        return d1 / d2;
    }

    @Override
    public double modulo(double d1, double d2) {
        return d1 % d2;
    }

}
