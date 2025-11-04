package DIagonal;

public class MatrizDiagonal {

    private final int FILAS=5,COLUMNAS=5;
    private int [][] Matriz=new int[FILAS+1][COLUMNAS+1];
    private int [] diagonalPrincipal=new int[FILAS+1];

    public void establecerValores(int [][]datos){
        Matriz=datos;
    }

    public void capturarDiagonalPrincipal(){
        for(int i=1;i<=FILAS;i++){
            diagonalPrincipal[i]=Matriz[i][i];
        }
    }

    public int [] obtenerDiagonalPrincipal(){
        return diagonalPrincipal;
    }


}
