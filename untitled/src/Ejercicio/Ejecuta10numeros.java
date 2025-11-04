package Ejercicio;

import java.util.Scanner;

public class Ejecuta10numeros {
    public static void main(String[] args) {
        Scanner nic = new Scanner(System.in);
        final int numero = 10;
        Fun funcion = new Fun();
        System.out.println("\n Bienvenido a los 10 numeros \n");

        int []ene = new int [numero];
        for (int i=0;i<numero;i++){
            System.out.println("Ingresa el numero " +(i+1)+": ");
            ene [i]=nic.nextInt();
        }
        funcion.establecerNumero(ene);
        funcion.iterar();
        System.out.println("Numero menor en la posicion 0 del arreglo "+funcion.Menor());
        System.out.println("Numero mayor en la posicion 0 del arreglo "+funcion.Mayor());
    }
}
