package Colas;

import javax.swing.JOptionPane;

public class cola {
    public static void main(String[] args) {
        byte max = 9, op = 0;
        int i = 0, frente = -1, fin = -1;
        int v[] = new int[10];

        while (op != 4) {
            op = Byte.parseByte(JOptionPane.showInputDialog(
                    "Digite un número\n" +
                            "1. Insertar\n" +
                            "2. Eliminar\n" +
                            "3. Mostrar\n" +
                            "4. Salir"));

            switch (op) {
                case 1:
                    if (fin != max) {
                        if (frente == -1) {
                            fin++;
                            frente++;
                            v[fin] = Byte.parseByte(JOptionPane.showInputDialog("Digite el valor"));
                        } else {
                            fin++;
                            v[fin] = Byte.parseByte(JOptionPane.showInputDialog("Digite el valor"));
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Overflow");
                    }
                    break;

                case 2:
                    if (fin != -1) {
                        if (fin == frente) {
                            fin = -1;
                            frente = -1;
                        } else {
                            frente++;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Underflow");
                    }
                    break;

                case 3:
                    if (fin != -1) {
                        for (i = frente; i <= fin; i++) {
                            JOptionPane.showMessageDialog(null, v[i]);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Cola vacía");
                    }
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Gracias");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        }
    }
}

