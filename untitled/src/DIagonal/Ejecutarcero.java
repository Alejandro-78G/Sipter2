package DIagonal;

public class Ejecutarcero {
    public static void main(String[] args) {
        Cero c = new Cero();

        int[][] matriz = c.diagonal();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
