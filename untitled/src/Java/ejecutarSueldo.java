package Java;

import java.util.Scanner;

public class ejecutarSueldo {
    public static void main(String[] args) {
        Scanner teca = new Scanner(System.in);
        int cantidade;
        Sueldo suel = new Sueldo();

        System.out.println("\n Sueldos de empleados \n");
        System.out.println("Ingrese la cantidad de empleados");
        cantidade = teca.nextInt();

        double [] sueldo = new double[cantidade];
        for (int i = 0 ;i<cantidade;i++){
            System.out.println("INGRESE EL SUELDO "  + (i+1) + ": " );
            sueldo [i] = teca.nextDouble();
        }
        suel.establecerSueldo(sueldo,cantidade);
        suel.calcularSueldo();
        System.out.println("La cantidad de sueldo altos son "+suel.cantidadAl);
        System.out.println("La cantidad de sueldo amedios son "+suel.cantidadMedia);
        System.out.println("La cantidad de sueldo bajos son "+suel.cantidadBaja);
    }

}
