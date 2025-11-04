package DIagonal;

import java.util.*;

public class EjecutarMatrizDiagonalPrincipal {

    public static void main(String[] args) {
        MatrizDiagonal objvalores =new MatrizDiagonal();
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

        objvalores.establecerValores(datos);
        objvalores.capturarDiagonalPrincipal();

        System.out.println("Generando matriz");

        for(int i=1;i<=FILAS;i++){
            for (int j=1;j<=COLUMNAS;j++){
                System.out.print("  ");
                System.out.print(datos[i][j]);
                System.out.print("  ");
            }
            System.out.println("  ");
        }

        System.out.println("los numeros encontrados en la diagonal principal son:");

        for (int i=1;i<=FILAS;i++){
            System.out.print(objvalores.obtenerDiagonalPrincipal()[i]);
            System.out.print(" ");
        }
    }





}
