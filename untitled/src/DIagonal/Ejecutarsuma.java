package DIagonal;

public class Ejecutarsuma{
        public static void main(String[] args) {
            sumade9filas sf = new sumade9filas();

            int[][] matriz = sf.ComenzaMatr();


            System.out.println("Matriz generada:");
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
            sf.sumamayor();
        }
    }


