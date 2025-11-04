package Normal;

public class Algebra {
    double[] nota_estudiantes;
    double promedioAl;
    int baja;
    int lta;
    double notaalta;
    double notaBaja=50;
    int posición;

    public void EstablecerArreglo(double [] nota){
        this.nota_estudiantes=nota;
    }
    double CalcularPromedioal() {
        double suma = 0;
        for (int i = 0; i < nota_estudiantes.length; i++) {
            suma += nota_estudiantes[i];
        }
        promedioAl = suma / nota_estudiantes.length;
        return promedioAl;
    }


    public void CalcularCuantosal() {
        for (int i = 0; i < nota_estudiantes.length; i++) {
            if (nota_estudiantes[i] >= 30) {
                lta++;
                if (notaalta<nota_estudiantes[i]){
                    notaalta=nota_estudiantes[i];
                }
            } else {
                baja++;
                if (notaBaja>nota_estudiantes[i]){
                    notaBaja=nota_estudiantes[i];
                    posición=(i)+1;
                }
            }
        }
    }

    public int Pasaron(){return lta;}
    public int Perdieron(){return baja;}
    public double Mayornota(){return notaalta;}
    public int Quienfue(){return posición;}
    }
