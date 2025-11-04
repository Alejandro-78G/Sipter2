package Java;

public class NumeroMayor {
    private Integer numeroA;
    private Integer numeroB;
    private Integer numeroC;
    private Integer numeroMayor;

    public void establecerNum(int numero1, int numero2, int numero3) {
        numeroA = numero1;
        numeroB = numero2;
        numeroC = numero3;
    }

    public void calcularNuMayor() {

        if (numeroA > numeroB && numeroA > numeroC) {
            numeroMayor = numeroA;
        } else if (numeroB > numeroA && numeroB > numeroC) {
            numeroMayor = numeroB;
        } else numeroMayor = numeroC;

    }

    public int obtenerNuMayor() {
        return numeroMayor;
    }
}
