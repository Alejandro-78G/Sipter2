package Ejercicio;

public class Parque {
    int [] altura;
    int maxima, minima, cantidadBaja;
    final int canti = 10000000;

    public void establecerAltura(int[] altura) {
        this.altura = altura;
    }

    public boolean calcularAltura() {
        for (int i = 0; i < altura.length; i++) {
            if (altura[i] >= 140 && altura[i] <= 180) {
                return true;  // puede pasar
            }
        }
        return false;  // si ninguna cumple
    }
    }




