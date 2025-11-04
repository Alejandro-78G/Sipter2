package DIagonal;

public class Datos {

    private final int FILAS=5,COLUMNAS=5;
    private int [][] Matriz=new int[FILAS+1][COLUMNAS+1];
    private int max;

    public void establecerDatos(int [][]datos){
        Matriz=datos;
    }

    public void calcularMaximo(){
        for(int i=1;i<=FILAS;i++){
            for (int j=1;j<=COLUMNAS;j++){
                if(Matriz[i][j]>max){
                    max=Matriz[i][j];
                }
            }
        }
    }

    public int obtenerMaximo(){
        return max;
    }

}
