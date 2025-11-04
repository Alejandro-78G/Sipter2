package Matriz;

import java.util.Random;
import java.util.Scanner;

public class Ejecutarcosto {
    public static void main(String[] args) {
        Scanner inte = new Scanner(System.in);
        Costo cos = new Costo();
        Random aleatorio = new Random();

        int [][] numeros = new int[4][5];
        for (int i=0;i<numeros.length;i++) {
            for (int t = 0; t < numeros[i].length; t++) {
                numeros[i][t] = aleatorio.nextInt(100)+1;
            }

        }
        System.out.println("\n***********Costo**********\n");
        cos.establecerCosto(numeros);

        for (int i = 0; i < numeros.length; i++) {
            for (int t = 0; t < numeros[i].length; t++) {
                System.out.print(numeros[i][t] + "\t");
            }
            System.out.println();
        }
        cos.Calcularmaximo();
        cos.Cacularminimo();
        System.out.println("el numero mas grande en la matriz es : "+cos.obtenermaximo());
        System.out.println("el numero mas pequeño en la matriz es : "+cos.obtenerminimo());
    }
    }

