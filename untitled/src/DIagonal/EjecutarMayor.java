package DIagonal;

import Matriz.Costo;

import java.util.Random;

public class EjecutarMayor {
    public static void main(String[] args) {
        Costo Ubt = new Costo();
        Random aleatorio = new Random();

        int [][] mayoraletorio = new int[4][5];
        for (int i=0;i<mayoraletorio.length;i++) {
            for (int t = 0; t < mayoraletorio[i].length; t++) {
                mayoraletorio[i][t] = aleatorio.nextInt(100)+1;
            }

        }
        System.out.println("\n***********Costo**********\n");
        Ubt.establecerCosto(mayoraletorio);

        for (int i = 0; i < mayoraletorio.length; i++) {
            for (int t = 0; t < mayoraletorio[i].length; t++) {
                System.out.print(mayoraletorio[i][t] + "\t");
            }
            System.out.println();
        }
        Ubt.Calcularmaximo();
        System.out.println("el numero mas grande en la matriz es : "+Ubt.obtenermaximo());
    }
}
