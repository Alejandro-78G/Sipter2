package Normal;

public class Notas {
    double[] nota_estu;
    double promedio;
    int cantidabaja;
    int cantidadalta;

    public void EstablecerNota(double[] nota_estu) {
        this.nota_estu = nota_estu;
    }

     double CalcularPromedio() {
        double suma = 0;
        for (int i = 0; i < nota_estu.length; i++) {
            suma += nota_estu[i];
        }
        promedio = suma / nota_estu.length;
        return promedio;
    }


    public void CalcularCuantos() {
        cantidadalta = 0;
        cantidabaja = 0;
        for (int i = 0; i < nota_estu.length; i++) {
            if (nota_estu[i] >= promedio) {
                cantidadalta++;
            } else {
                cantidabaja++;
            }
        }
    }

    public double obtenerPromedio() {
        return promedio;
    }

    public int obtenerAltos() {
        return cantidadalta;
    }

    public int obtenerBajos() {
        return cantidabaja;
    }
}
