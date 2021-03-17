/*
 * Ejercicio 2.
 * Realiza el diseño de la siguiente ventana, cuando se seleccione un animal debe
 * aparecer la imagen de dicho animal.
 */
package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author JFSam
 */
public class Ejer2 extends JFrame {
    private JComboBox jComboAnimales;
    private DefaultComboBoxModel modeloCombo;
    private JLabel jLabelImg;
    
    public Ejer2(){
        ImageIcon tiburon = new ImageIcon(getClass().getResource("/multimedia/shark.png"));
        ImageIcon perro = new ImageIcon(getClass().getResource("/multimedia/dog.png"));
        ImageIcon lagarto = new ImageIcon(getClass().getResource("/multimedia/lagarto.png"));
        jLabelImg = new JLabel();
        jLabelImg.setIcon(tiburon);
        
        // Combobox
        jComboAnimales = new JComboBox();
        modeloCombo = new DefaultComboBoxModel();
        jComboAnimales.setModel(modeloCombo);
        modeloCombo.addElement("Tiburón");
        modeloCombo.addElement("Perro");
        modeloCombo.addElement("Lagarto");
        
        getContentPane().setLayout(null);
        jComboAnimales.setBounds(10, 20,100, 20);
        jLabelImg.setBounds(10, 40,250, 250);

        
        // Lo añadimos en la ventana
        getContentPane().add(jComboAnimales);
        getContentPane().add(jLabelImg);
        
        setSize(550,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        jComboAnimales.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String x = (String) jComboAnimales.getSelectedItem();
                if(x.equals("Tiburón")){
                    jLabelImg.setIcon(tiburon);
                }
                if(x.equals("Perro")){
                    jLabelImg.setIcon(perro);
                }
                if(x.equals("Lagarto")){
                    jLabelImg.setIcon(lagarto);
                }
                
            }
        });
                



    }
    
    public static void main(String[] args) {
        Ejer2 ventana = new Ejer2();
    }
}
