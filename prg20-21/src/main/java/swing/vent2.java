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
public class vent2 extends JFrame {

    private JLabel jLabelNombre = new JLabel();
    private JLabel jLabelSalida = new JLabel();
    private JButton jButtonFinalizar = new JButton();
    private JTextField jTextFieldNombre = new JTextField();

    public vent2() {
        jLabelNombre.setText("Dime tu edad.");
        jButtonFinalizar.setText("Calcular");
        jTextFieldNombre.setText("Escribe aqui tu edad.");
        jLabelSalida.setText("¿?");

        //Ponemos un gestor de distribución.
        getContentPane().setLayout(new FlowLayout());
        //Metemos los componentes creados en la ventana.
        add(jLabelNombre);
        add(jTextFieldNombre);
        add(jButtonFinalizar);
        add(jLabelSalida);
        
        
        //Programar el evento click del boton.
        jButtonFinalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int edad;
                edad = Integer.parseInt(jTextFieldNombre.getText());
                if (edad > 17) {
                    jLabelSalida.setText("Usted es mayor de edad.");
                } else {
                    jLabelSalida.setText("Usted es menor de edad.");
                }
            }
        });
        
        //Porpiedades de la ventana.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Poder cerrar la ventana con el aspa.
        setVisible(true); //Mostrar la ventana.
        pack(); //Reducir al tamaño minimo posible pero que se vean los componentes.
    }

    public static void main(String[] args) {
        vent2 v2 = new vent2();
    }
}
