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
public class vent3 extends JFrame {

    private JLabel jLabelNombre = new JLabel();
    private JButton jButtonFinalizar = new JButton();
    private JTextField jTextFieldNombre = new JTextField();

    public vent3() {
        jLabelNombre.setText("Introduce un numero.");
        jButtonFinalizar.setText("Crear");
        jTextFieldNombre.setText("Escribe el nº de labels que quiera.");

        //Ponemos un gestor de distribución.
        getContentPane().setLayout(new FlowLayout());
        //Metemos los componentes creados en la ventana.
        add(jLabelNombre);
        add(jTextFieldNombre);
        add(jButtonFinalizar);
        
        //Programar el evento click del boton.
        jButtonFinalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num;
                num  = Integer.parseInt(jTextFieldNombre.getText()); 
                for (int i = 0; i < num; i++) {
                    JLabel jLabelResultado = new JLabel();
                    add(jLabelResultado);
                    jLabelResultado.setText("*");
                }
            }
        });

        //Porpiedades de la ventana.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Poder cerrar la ventana con el aspa.
        setVisible(true); //Mostrar la ventana.
        pack(); //Reducir al tamaño minimo posible pero que se vean los componentes.
    }

    public static void main(String[] args) {
        vent3 v3 = new vent3();
    }
}
