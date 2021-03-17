/*
 * Ejercicio 4.
 */
package swing;

import javax.swing.*;

/**
 *
 * @author JFSam
 */
public class Ejer4 extends JFrame{
    private JCheckBox check1, check2, check3, check4;
    private JPanel p1, p2;
    private JLabel jLabelImg;
    
    public Ejer4(){
        check1 = new JCheckBox("Menton"); 
        check2 = new JCheckBox("Gafas"); 
        check3 = new JCheckBox("Pelo"); 
        check4 = new JCheckBox("Dientes");
        jLabelImg = new JLabel();
        p1 = new JPanel();
        p2 = new JPanel();
        ImageIcon muñeco = new ImageIcon(getClass().getResource("/multimedia/muñeco.png"));
        ImageIcon menton = new ImageIcon(getClass().getResource("/multimedia/menton.png"));
        ImageIcon gafas = new ImageIcon(getClass().getResource("/multimedia/gafas2.png"));
        ImageIcon pelo = new ImageIcon(getClass().getResource("/multimedia/pelo2.png"));
        ImageIcon dientes = new ImageIcon(getClass().getResource("/multimedia/dienets2.png"));
        ImageIcon dientesmenton = new ImageIcon(getClass().getResource("/multimedia/dientes.png"));
        ImageIcon gafasmenton = new ImageIcon(getClass().getResource("/multimedia/gafas.png"));
        ImageIcon gdm = new ImageIcon(getClass().getResource("/multimedia/gafasdientes.png"));
        ImageIcon gd = new ImageIcon(getClass().getResource("/multimedia/gafasdientes2.png"));
        ImageIcon gpm = new ImageIcon(getClass().getResource("/multimedia/gafaspelo.png"));
        ImageIcon gp = new ImageIcon(getClass().getResource("/multimedia/gafaspelo2.png"));
        ImageIcon gpdm = new ImageIcon(getClass().getResource("/multimedia/gafaspelodientes.png"));
        ImageIcon gpd = new ImageIcon(getClass().getResource("/multimedia/gafaspelodientes2.png"));
        ImageIcon pm = new ImageIcon(getClass().getResource("/multimedia/pelo.png"));
        ImageIcon pdm = new ImageIcon(getClass().getResource("/multimedia/pelodienets.png"));
        ImageIcon pd = new ImageIcon(getClass().getResource("/multimedia/pelodientes2.png"));
        
        jLabelImg.setIcon(muñeco);
        
        p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
        p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
        BoxLayout bl = new BoxLayout(getContentPane(), BoxLayout.X_AXIS);
        getContentPane().setLayout(bl);
        getContentPane().add(p1);
        getContentPane().add(p2);
        
        p1.add(check1);        
        p1.add(check2);
        p1.add(check3);
        p1.add(check4);
        p2.add(jLabelImg);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Ejer4 ventana = new Ejer4();
    }
}
