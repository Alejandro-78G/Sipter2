package Normal;

import java.util.Scanner;

public class EjecutarAlgebra {
    public static void main(String[] args) {
        Scanner saber = new Scanner(System.in);
        System.out.println("***  Bienvenido a las notas de algebra  ***");

        Algebra alge = new Algebra();
        double[] notas = new double[25];


        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
            notas[i] = saber.nextDouble();
        }

        alge.EstablecerArreglo(notas);
        double promedio = alge.CalcularPromedioal();
        alge.CalcularCuantosal();


        System.out.println("El promedio general es: " + promedio);
        System.out.println("La cantidad de estudiantes con notas mayores o iguales a 3.0: " + alge.Pasaron());
        System.out.println("La cantidad de estudiantes con notas menores a 3.0 fueron: " + alge.Perdieron());
        System.out.println("La mayor nota fue "+alge.Mayornota());
        System.out.println("La posicion del estudiante con la nota mas baja es "+alge.Quienfue());
    }
}


