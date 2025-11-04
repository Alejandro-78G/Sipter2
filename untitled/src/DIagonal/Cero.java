package DIagonal;

public class Cero {
    private int[][] matriz;

    public Cero() {
        matriz = new int[10][10];
    }


    public int[][] diagonal() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        return matriz;
    }

}



