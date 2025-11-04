package Calculadora;

import java.awt.event.*;

public class Botones implements ActionListener {
    private Emergente vista;
    private operaciones modelo;

    private double num1, num2;
    private String operador;
    private boolean nuevoNumero = true;

    public Botones(Emergente vista, operaciones modelo) {
        this.vista = vista;
        this.modelo = modelo;

        for (int i = 0; i < vista.botonesNum.length; i++) {
            vista.botonesNum[i].addActionListener(this);
        }

        vista.btnSuma.addActionListener(this);
        vista.btnResta.addActionListener(this);
        vista.btnMult.addActionListener(this);
        vista.btnDiv.addActionListener(this);
        vista.btnIgual.addActionListener(this);
        vista.btnClear.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();


        for (int i = 0; i < vista.botonesNum.length; i++) {
            if (src == vista.botonesNum[i]) {
                if (nuevoNumero) {
                    vista.pantalla.setText("");
                    nuevoNumero = false;
                }
                vista.pantalla.setText(vista.pantalla.getText() + i);
                return;
            }
        }


        if (src == vista.btnSuma || src == vista.btnResta || src == vista.btnMult || src == vista.btnDiv) {
            num1 = Double.parseDouble(vista.pantalla.getText());
            operador = ((javax.swing.JButton) src).getText();
            nuevoNumero = true;
        }


        if (src == vista.btnIgual) {
            num2 = Double.parseDouble(vista.pantalla.getText());
            double resultado = modelo.operar(num1, num2, operador);
            vista.pantalla.setText(String.valueOf(resultado));
            nuevoNumero = true;
        }


        if (src == vista.btnClear) {
            vista.pantalla.setText("");
            num1 = num2 = 0;
            operador = "";
        }
    }
}
