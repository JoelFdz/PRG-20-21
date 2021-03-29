/*
 * Ejercicio de SWING
 */
package swing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author JFSam
 */
public class Ventana extends JFrame implements IVentana {

    //propiedades
    private JLabel lbDato1, lbOperador, lbDato2, lbResultado, lbResultado2;
    private JTextField txtDato1, txtDato2;
    private JComboBox<String> cboOperacion;
    private DefaultComboBoxModel<String> dcbm;
    private JButton jbCalcular, jbLimpiar;
    private GridLayout gl;

    public Ventana() {
        //Instanciar los objetos.
        lbDato1 = new JLabel("Primer dato");
        lbOperador = new JLabel("Operación");
        lbDato2 = new JLabel("Segundo dato");
        lbResultado = new JLabel("Resultado");
        lbResultado2 = new JLabel("xxx");
        txtDato1 = new JTextField();
        txtDato2 = new JTextField();
        dcbm = new DefaultComboBoxModel();
        cboOperacion = new JComboBox(dcbm);
        jbCalcular = new JButton("Calcular");
        jbLimpiar = new JButton("Limpiar");
        gl = new GridLayout(5, 2, 5, 5);
        

        dcbm.addElement("*");
        dcbm.addElement("/");
        dcbm.addElement("-");
        dcbm.addElement("+");
        dcbm.addElement("%");

        // 2.Introducir los datos en el panel.
        getContentPane().setLayout(gl);
        getContentPane().add(this.lbDato1);
        getContentPane().add(this.txtDato1);
        getContentPane().add(this.lbOperador);
        getContentPane().add(this.cboOperacion);
        getContentPane().add(this.lbDato2);
        getContentPane().add(this.txtDato2);
        getContentPane().add(this.jbCalcular);
        getContentPane().add(this.jbLimpiar);
        getContentPane().add(this.lbResultado);

        // 3. Progrmar los eventos.
        jbLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDato1.setText("");
                txtDato2.setText("");
                lbResultado2.setText("");
            }
        });

        // 4. Establecer propiedADES de la vantana.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Poder cerrar con el aspa.
        setTitle("Calculadora");
        setLocationRelativeTo(null);
        pack();
        setVisible(true);

    }

    @Override
    public double getDato1() {
        double aux;

        aux = Double.parseDouble(txtDato1.getText());
        return aux;
    }

    @Override
    public double getDato2() {
        return Double.parseDouble(txtDato2.getText());
    }

    @Override
    public String getOperador() {
        String aux = dcbm.getSelectedItem().toString();
        return aux;
    }

    @Override
    public void setResultado(double result) {
        lbResultado2.setText(result + "");
    }
}
