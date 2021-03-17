
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.HeadlessException;
import javax.swing.*;

/**
 *
 * @author JSam
 */
public class V1 extends JFrame{
    private JLabel jlbet1, jlbet2, jlbet3;    
    private JList jlLista;
    private DefaultListModel modeloLista;
    private JScrollPane jsp;            
    private JComboBox jcboNombres;
    private DefaultComboBoxModel modeloCombo;    
    
    // Constructor
    public V1() {
        jlbet1 = new JLabel("Etiqueta1", SwingConstants.RIGHT);
        
        //ImageIcon ii = new ImageIcon(getClass().getResource("/gfx/bomb.png"));
        jlbet2 = new JLabel();
        //jlbet2.setIcon(ii);
        jlbet3 = new JLabel("Etiqueta3"); //,ii,SwingConstants.LEFT);
        
        // Definicion de la lista
        jlLista = new JList();
        modeloLista = new DefaultListModel();
        jlLista.setModel(modeloLista);
        modeloLista.addElement("Juan");
        modeloLista.addElement("Ana");
        modeloLista.addElement("Pepe");
        modeloLista.addElement("Antonio");
        modeloLista.addElement("Antonia");
        modeloLista.addElement("Antonie");
        modeloLista.addElement("Antonii");
        jsp = new JScrollPane();
        jsp.setViewportView(jlLista);
        
        // Combobox
        jcboNombres = new JComboBox();
        modeloCombo = new DefaultComboBoxModel();
        jcboNombres.setModel(modeloCombo);
        modeloCombo.addElement("Verde");
        modeloCombo.addElement("Rojo");
        modeloCombo.addElement("Amarrillo");
                
        
        getContentPane().setLayout(null);
        jlbet1.setBounds(10, 20,100, 20);
        jlbet2.setBounds(10, 40,100, 20);
        jlbet3.setBounds(10, 60,100, 20);
        jsp.setBounds(10, 90, 100, 100);
        jcboNombres.setBounds(150, 90, 100, 20);
        
        // Lo añadimos en la ventana
        getContentPane().add(jlbet1);
        getContentPane().add(jlbet2);
        getContentPane().add(jlbet3);
        getContentPane().add(jsp);
        getContentPane().add(jcboNombres);
        
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        V1 ventana = new V1();
    }
    
    
    
    
}