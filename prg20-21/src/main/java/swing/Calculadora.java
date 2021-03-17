/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author JFSam
 */
public class Calculadora extends JFrame {
    private JButton jButtonNum1 = new JButton();
    private JButton jButtonNum2 = new JButton();
    private JButton jButtonNum3 = new JButton();
    private JButton jButtonNum4 = new JButton();
    private JButton jButtonNum5 = new JButton();
    private JButton jButtonNum6 = new JButton();
    private JButton jButtonNum7 = new JButton();
    private JButton jButtonNum8 = new JButton();
    private JButton jButtonNum9 = new JButton();
    private JButton jButtonNum0 = new JButton();
    private JButton jButtonSuma = new JButton();
    private JButton jButtonResta = new JButton();
    private JButton jButtonMulti = new JButton();
    private JButton jButtonDiv = new JButton();

    public Calculadora() {
        jButtonNum1.setText("1");
        jButtonNum2.setText("2");
        jButtonNum3.setText("3");
        jButtonNum4.setText("4");
        jButtonNum5.setText("5");
        jButtonNum6.setText("6");
        jButtonNum7.setText("7");
        jButtonNum8.setText("8");
        jButtonNum9.setText("9");
        jButtonNum0.setText("0");
        jButtonSuma.setText("+");
        jButtonResta.setText("-");
        jButtonMulti.setText("*");
        jButtonDiv.setText("/");
        

        //Ponemos un gestor de distribución.
        getContentPane().setLayout(new FlowLayout());
        //Metemos los componentes creados en la ventana.
        add(jButtonNum1);
        add(jButtonNum2);
        add(jButtonNum3);
        add(jButtonNum4);
        add(jButtonNum5);
        add(jButtonNum6);
        add(jButtonNum7);
        add(jButtonNum8);
        add(jButtonNum9);
        add(jButtonNum0);
        add(jButtonSuma);
        add(jButtonResta);
        add(jButtonMulti);
        add(jButtonDiv);
        
        

        //Porpiedades de la ventana.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Poder cerrar la ventana con el aspa.
        setVisible(true); //Mostrar la ventana.
        pack(); //Reducir al tamaño minimo posible pero que se vean los componentes.
    }

    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
    }
}

