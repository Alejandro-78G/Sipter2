package DIagonal;

public class Mayor {
    private int [][] matriz = new int[4][5];
    private int maximo ;

    public void establecerMatriz(int [][] matrize){
        this.matriz=matrize;
    }
    public void Calcularmaximo(){
        for (int i= 0 ; i<matriz.length;i++){
            for (int t=0 ;t<matriz[i].length;t++){
                if (matriz[i][t]>maximo){
                    maximo =matriz[i][t];
                }
            }
        }
    }

    public int obtenermaximo(){return maximo;}
}
