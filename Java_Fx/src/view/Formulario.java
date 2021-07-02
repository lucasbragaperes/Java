/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import negocio.Figura;
import negocio.Retangulo;
import negocio.Trapezio;
import negocio.Triangulo;

/**
 *
 * @author FATEC_Lucas
 */
public class Formulario {

    private JFrame form;
    private JLabel lblValor1, lblValor2, lblValor3, lblFiguras, lblResultado;
    private JTextField txtValor1, txtValor2, txtValor3;
    private JComboBox cboArea;
    private JButton btnCalcularArea;

    public Formulario() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        form = new JFrame("CALCULO DE ÁREAs");
        form.setBounds(400, 150, 550, 350);
        form.setLayout(null);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container painel = form.getContentPane();

        lblFiguras = new JLabel("OPÇÕES: ");
        lblFiguras.setBounds(40, 30, 180, 20);
        painel.add(lblFiguras);

        lblValor1 = new JLabel("Valor 1: ");
        lblValor1.setBounds(300, 30, 100, 20);
        painel.add(lblValor1);

        txtValor1 = new JTextField();
        txtValor1.setBounds(390, 30, 80, 20);
        txtValor1.setEnabled(false);
        painel.add(txtValor1);

        lblValor2 = new JLabel("Valor 2: ");
        lblValor2.setBounds(300, 80, 100, 20);
        painel.add(lblValor2);

        txtValor2 = new JTextField();
        txtValor2.setBounds(390, 80, 80, 20);
        txtValor2.setEnabled(false);
        painel.add(txtValor2);

        lblValor3 = new JLabel("Valor 3: ");
        lblValor3.setBounds(300, 130, 100, 20);
        painel.add(lblValor3);

        txtValor3 = new JTextField();
        txtValor3.setBounds(390, 130, 80, 20);
        txtValor3.setEnabled(false);
        painel.add(txtValor3);

        cboArea = new JComboBox();
        cboArea.setBounds(40, 60, 200, 25);
        cboArea.addItem("<< SELECIONE >>");
        cboArea.addItem("Retangulo");
        cboArea.addItem("Trapezio");
        cboArea.addItem("Triangulo");
        cboArea.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    switch (cboArea.getSelectedIndex()) {
                        case 1:
                            lblValor1.setText("Base:");
                            lblValor2.setText("Altura:");
                            lblValor3.setText("-");
                            txtValor1.setEnabled(true);
                            txtValor2.setEnabled(true);
                            txtValor3.setEnabled(false);
                            break;
                        case 2:
                            lblValor1.setText("Base Menor:");
                            lblValor2.setText("Base Maior:");
                            lblValor3.setText("Altura:");
                            txtValor1.setEnabled(true);
                            txtValor2.setEnabled(true);
                            txtValor3.setEnabled(true);
                            break;
                        case 3:
                            lblValor1.setText("Base:");
                            lblValor2.setText("Altura:");
                            lblValor3.setText("-");
                            txtValor1.setEnabled(true);
                            txtValor2.setEnabled(true);
                            txtValor3.setEnabled(false);
                            break;
                        default:
                            lblValor1.setText("Valor 1:");
                            lblValor2.setText("Valor 2:");
                            lblValor3.setText("Valor 3:");
                            txtValor1.setEnabled(false);
                            txtValor2.setEnabled(false);
                            txtValor3.setEnabled(false);
                    }
                    lblResultado.setText("Resultado: ");
                    txtValor1.setText("");
                    txtValor2.setText("");
                    txtValor3.setText("");
                }
            }
        });
        painel.add(cboArea);

        btnCalcularArea = new JButton("Calcular Área");
        btnCalcularArea.setBounds(150, 180, 220, 25);
        btnCalcularArea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Figura objFigura = null;
                switch (cboArea.getSelectedIndex()) {
                    case 1:
                        Retangulo objRet = new Retangulo();
                        objRet.setBase(Float.parseFloat(txtValor1.getText()));
                        objRet.setAltura(Float.parseFloat(txtValor2.getText()));
                        objFigura = objRet;
                        break;
                    case 2:
                        Trapezio objTrap = new Trapezio();
                        objTrap.setBaseMenor(Float.parseFloat(txtValor1.getText()));
                        objTrap.setBaseMaior(Float.parseFloat(txtValor2.getText()));
                        objTrap.setAltura(Float.parseFloat(txtValor3.getText()));
                        objFigura = objTrap;
                        break;
                    case 3:
                        Triangulo objTri = new Triangulo();
                        objTri.setBase(Float.parseFloat(txtValor1.getText()));
                        objTri.setAltura(Float.parseFloat(txtValor2.getText()));
                        // atribui instÃ¢ncia de objeto especÃ­fico para objeto genÃ©rico (upcasting)
                        objFigura = objTri;
                        break;
                }
                objFigura.calcularArea();
                lblResultado.setText(String.format("Resultado: %.2fcm²", objFigura.getArea()));
            }
        });
        painel.add(btnCalcularArea);

        lblResultado = new JLabel("Resultado: ");
        lblResultado.setBounds(150, 230, 200, 30);
        lblResultado.setFont(new Font("Arial", Font.BOLD, 16));
        lblResultado.setForeground(Color.RED);
        painel.add(lblResultado);

        form.setVisible(true);
    }

}
