package Calculadora;


import javax.swing.*;
import java.awt.*;

public class Emergente extends JFrame {
    public JTextField pantalla;
    public JButton[] botonesNum;
    public JButton btnSuma, btnResta, btnMult, btnDiv, btnIgual, btnClear;

    public Emergente() {
        setTitle("Calculadora");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        pantalla = new JTextField();
        pantalla.setEditable(false);
        pantalla.setFont(new Font("Arial", Font.BOLD, 24));
        add(pantalla, BorderLayout.NORTH);

        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(4, 4, 5, 5));

        botonesNum = new JButton[10];
        for (int i = 0; i < 10; i++) {
            botonesNum[i] = new JButton(String.valueOf(i));
            panelBotones.add(botonesNum[i]);
        }

        btnSuma = new JButton("+");
        btnResta = new JButton("-");
        btnMult = new JButton("*");
        btnDiv = new JButton("/");
        btnIgual = new JButton("=");
        btnClear = new JButton("C");

        panelBotones.add(btnSuma);
        panelBotones.add(btnResta);
        panelBotones.add(btnMult);
        panelBotones.add(btnDiv);
        panelBotones.add(btnIgual);
        panelBotones.add(btnClear);

        add(panelBotones, BorderLayout.CENTER);
    }
}
