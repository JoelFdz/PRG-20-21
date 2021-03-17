/*
 * Ejercicio 3.
 * Ejercicio 2 con Radio buttons.
 */
package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author JFSam
 */
public class Ejer3 extends JFrame{
    private JRadioButton b1, b2, b3;
    private JPanel p1, p2;
    private ButtonGroup bg;
    private JLabel jLabelImg;
    
    public Ejer3(){
        b1= new JRadioButton("Tiburon");
        b2= new JRadioButton("Perro");
        b3= new JRadioButton("Lagarto");
        bg = new ButtonGroup();
        jLabelImg = new JLabel();
        p1 = new JPanel();
        p2 = new JPanel();
        ImageIcon tiburon = new ImageIcon(getClass().getResource("/multimedia/shark.png"));
        ImageIcon perro = new ImageIcon(getClass().getResource("/multimedia/dog.png"));
        ImageIcon lagarto = new ImageIcon(getClass().getResource("/multimedia/lagarto.png"));
        
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
        jLabelImg.setIcon(tiburon);
        
        p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
        p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
        BoxLayout bl = new BoxLayout(getContentPane(), BoxLayout.X_AXIS);
        getContentPane().setLayout(bl);
        getContentPane().add(p1);
        getContentPane().add(p2);
        p1.add(b1);        
        p1.add(b2);
        p1.add(b3);
        p2.add(jLabelImg);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabelImg.setIcon(tiburon);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabelImg.setIcon(perro);
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabelImg.setIcon(lagarto);
            }
        });
        
    }
    public static void main(String[] args) {
        Ejer3 ventana = new Ejer3();
    }
}
