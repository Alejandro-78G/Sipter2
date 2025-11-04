package Normal;

import java.util.Scanner;

public class ControladroNotas {
    public static void main(String[] args) {
        Scanner inte = new Scanner(System.in);
        System.out.println("***  Bienvenido a las notas  ***");

        Notas notr = new Notas();
        double[] notas = new double[10];


        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
            notas[i] = inte.nextDouble();
        }

        notr.EstablecerNota(notas);
        double promedio = notr.CalcularPromedio();
        notr.CalcularCuantos();


        System.out.println("El promedio general es: " + promedio);
        System.out.println("La cantidad de estudiantes con nota >= promedio es: " + notr.obtenerAltos());
        System.out.println("La cantidad de estudiantes con nota < promedio es: " + notr.obtenerBajos());

    }
}
