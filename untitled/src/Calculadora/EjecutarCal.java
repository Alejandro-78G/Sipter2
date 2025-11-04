package Calculadora;

public class EjecutarCal {
    public static void main(String[] args) {
        Emergente vista = new Emergente();
        operaciones modelo = new operaciones();
        Botones control = new Botones(vista, modelo);

        vista.setVisible(true);
    }
}
