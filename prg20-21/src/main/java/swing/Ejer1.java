/*
 * Ejercicio 1.
 * Haciendo uso del layout null, realiza una ventana con una etiqueta y dos botones.
 * La etiqueta contendrá la pregunta. ¿Te gusta la informática? y los botones tendrán
 * el texto "Si" y "No". El ejercicio consiste en programar los eventos del ratón para
 * que cuando se posicione encima del botón "No" este se desplace a otro punto dentro de la
 * ventana y nunca pueda ser pulsado.
 */
package swing;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

/**
 *
 * @author JSam
 */
public class Ejer1 extends JFrame {

    private JLabel jLabelEtiqueta;
    private JButton jButtonSi, jButtonNo;

    //Constructor
    public Ejer1() {
        jLabelEtiqueta = new JLabel("¿Te gusta la informática?");
        jButtonSi = new JButton();
        jButtonNo = new JButton();

        jButtonSi.setText("Si");
        jButtonNo.setText("No");

        getContentPane().setLayout(null);
        jLabelEtiqueta.setBounds(10, 20, 200, 20);
        jButtonSi.setBounds(10, 40, 70, 20);
        jButtonNo.setBounds(80, 40, 70, 20);

        // Lo añadimos en la ventana
        getContentPane().add(jLabelEtiqueta);
        getContentPane().add(jButtonSi);
        getContentPane().add(jButtonNo);

        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        jButtonNo.addMouseListener(new MouseListener() {


            @Override
            public void mouseEntered(MouseEvent e) {
                jButtonNo.setLocation((int) (Math.random()*150), (int) (Math.random()*150));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jButtonNo.setLocation((int) (Math.random()*150), (int) (Math.random()*150));
            }

        });

    }

    public static void main(String[] args) {
        Ejer1 ventana = new Ejer1();
    }
}

