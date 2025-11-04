
import javax.swing.JOptionPane;
    public class ColasCirculares {
        public static void main(String[] args) {
            int OP = 0;
            int V[] = new int[4];
            int Max = 3;
            int Ultimo = -1;
            int Primero = -1;
            String A = "\n";

            while (OP != 5) {

                OP = Integer.parseInt(JOptionPane.showInputDialog("Menu de Operaciones\n"
                        + "1. Insertar\n"
                        + "2. Eliminar\n"
                        + "3. Imprimir\n"
                        + "4. Imprimir Primero & Ultimo\n"
                        + "5. Salir\n"
                        + "Escoja Opcion"));

                switch (OP) {
                    case 1:

                        if ((Ultimo == Max && Primero == 0) || (Primero == Ultimo + 1)) {
                            JOptionPane.showMessageDialog(null, "La Cola esta Llena");
                        }
                        else if (Primero == -1 && Ultimo == -1) {
                            Ultimo++;
                            Primero++;
                            V[Ultimo] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Datos"));
                        }

                        else if (Primero != -1 && Ultimo != Max) {
                            Ultimo++;
                            V[Ultimo] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Datos"));
                        }

                        else if (Ultimo == Max && Primero != 0) {
                            Ultimo = 0;
                        }
                        break;


                    case 2:

                        if (Primero == -1 && Ultimo == -1) {
                            JOptionPane.showMessageDialog(null, "La Cola Esta Vacia");
                        }

                        else if (Primero == Ultimo) {
                            Ultimo = -1;
                            Primero = -1;
                            JOptionPane.showMessageDialog(null, "Se Ha Eliminado el Unico Elemento en la Cola");
                        }

                        else if (Primero != Ultimo) {
                            Primero++;
                            JOptionPane.showMessageDialog(null, "Se Ha Eliminado el Primer Elemento de la Cola");
                        }

                        else if (Primero == Max) {
                            Primero = 0;
                        }
                        break;


                    case 3:

                        if (Ultimo != -1 && Primero != -1) {
                            A = "";

                            if (Primero <= Ultimo) {
                                for (int i = Primero; i <= Ultimo; i++) {
                                    A = A + V[i] + ",";
                                }
                                JOptionPane.showMessageDialog(null, "Los Elementos de la Cola son: " + A);
                            } else {

                                for (int j = 0; j <= Ultimo; j++) {
                                    A = A + V[j] + ",";
                                }

                                for (int x = Primero; x <= Max; x++) {
                                    A = A + V[x] + ",";
                                }
                                JOptionPane.showMessageDialog(null, "Los Elementos de la Cola son: " + A);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "La Cola Esta Vacia");
                        }
                        break;


                    case 4:

                        if (Ultimo != -1 && Primero != -1) {
                            JOptionPane.showMessageDialog(null, "El Primer Elemento de la Cola es: " + V[Primero] + "\n" + "El Ultimo Elemento de la Cola es: " + V[Ultimo]);
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "La Cola Esta Vacia");
                        }
                        break;


                    case 5:
                        JOptionPane.showMessageDialog(null, "Gracias!!!");
                        break;


                    default:
                        JOptionPane.showMessageDialog(null, "Ha Digitado una Opcion Fuera de Rango");
                        break;
                }
            }
        }
    }

