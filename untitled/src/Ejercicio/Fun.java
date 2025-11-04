package Ejercicio;

public class Fun {
    int [] enteros;
    final int can =10;
    int menor,mayor;


    public void establecerNumero(int [] numeros){
        this.enteros=numeros;
    }

    public int iterar() {
        for (int i = 1; i < can; i++) { // recorre desde el 2do hasta el último
            if (enteros[0] > enteros[i]) {

                return mayor =enteros[0];
            }
        }

        return menor = enteros[0];
    }
    public int Menor(){return menor;}
    public int Mayor(){return mayor;}
}
