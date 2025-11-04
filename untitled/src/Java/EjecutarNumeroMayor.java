package Java;

import java.util.Scanner;

public class EjecutarNumeroMayor {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numero1,numero2,numero3;
        NumeroMayor objNumeroMayor= new NumeroMayor();
        System.out.println("Calcular numero mayor");
        System.out.print("Ingrese el primer numero : ");
        numero1=teclado.nextInt();
        System.out.print("Ingresa el segundo numero : ");
        numero2=teclado.nextInt();
        System.out.print("Ingresa el tercer numero: ");
        numero3=teclado.nextInt();
        objNumeroMayor.establecerNum(numero1,numero2,numero3);
        objNumeroMayor.calcularNuMayor();
        System.out.println("El numero mayor de los tres ingresados es: " + objNumeroMayor.obtenerNuMayor());

    }

}

