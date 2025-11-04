package DIagonal;
import java.util.Random;
public class sumade9filas {
        private int[][] matriz;
    int filaMax = 0;
    int sumaMax = 0;

        public sumade9filas(){
            matriz = new int[10][10];
        }
        public int[][] ComenzaMatr() {
            Random rand = new Random();
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    matriz[i][j] = rand.nextInt(9) + 1;
                }
            }
            return matriz;
        }

        public int sumamayor() {
            for (int i = 0; i < 10; i++) {
                int sumaFila = 0;
                for (int j = 0; j < 10; j++) {
                    sumaFila += matriz[i][j];
                }
                if (sumaFila > sumaMax) {
                    sumaMax = sumaFila;
                    filaMax = i;
                }
            }
            System.out.println("La fila con mayor suma es la fila " + (filaMax + 1) +
                    " con una suma de " + sumaMax);
            return filaMax;
        }
    }


