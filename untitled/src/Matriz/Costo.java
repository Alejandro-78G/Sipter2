package Matriz;

public class Costo {
    private int [][] matrize = new int[4][5];
    private int maximo ;
    private int bajp=100;

    public void establecerCosto(int [][] matrize){
        this.matrize=matrize;
    }
    public void Calcularmaximo(){
        for (int i= 0 ; i<matrize.length;i++){
            for (int t=0 ;t<matrize[i].length;t++){
                if (matrize[i][t]>maximo){
                    maximo =matrize[i][t];
                }
            }
        }
    }
    public void Cacularminimo(){
        for (int i= 0 ; i<matrize.length;i++){
            for (int t=0 ;t<matrize[i].length;t++){
                if (matrize[i][t]< bajp){
                    bajp =matrize[i][t];
                }
            }
        }
    }
    public int obtenermaximo(){return maximo;}
    public int obtenerminimo(){return bajp;}

}

