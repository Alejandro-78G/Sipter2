package DIagonal;

import java.util.*;

public class EjecutarMatriz {
    public static void main(String[] args) {
        Datos objdatos=new Datos();
        Random numerosRamdon=new Random();
        final int FILAS=5,COLUMNAS=5;
        int [][] datos =new int[FILAS+1][COLUMNAS+1];

        System.out.println("*** MATRIZ COSTOS ***");
        System.out.println("Generando numeros para la matriz");
        for(int i=1;i<=FILAS;i++){
            for (int j=1;j<=COLUMNAS;j++){
                datos[i][j]=numerosRamdon.nextInt(100)+1;
            }
        }

        objdatos.establecerDatos(datos);
        objdatos.calcularMaximo();


        System.out.println("Generando matriz");

        for(int i=1;i<=FILAS;i++){
            for (int j=1;j<=COLUMNAS;j++){
                System.out.print("  ");
                System.out.print(datos[i][j]);
                System.out.print("  ");
            }
            System.out.println("  ");
        }

        System.out.println("Dato mayor: "+objdatos.obtenerMaximo());

    }
}
