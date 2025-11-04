package Java;


public class Sueldo {
    double[] sueldos;
    int cantidadAl, cantidadMedia, cantidadBaja, cantidad;

    public void establecerSueldo(double[] sueldo, int cantidad) {
        this.sueldos = sueldo;
        this.cantidad = cantidad;
    }

    public void calcularSueldo() {
        for (int i = 0; i < cantidad; i++) {
            if (    sueldos[i] > 5000000) {
                cantidadAl++;
            } else if (sueldos[i] > 3200000) {
                cantidadMedia++;
            } else {
                cantidadBaja++;
            }
        }
    }

    public int obtenerAltos() { return cantidadAl; }
    public int obtenerMedios() { return cantidadMedia; }
    public int obtenerBajos() { return cantidadBaja; }
}
