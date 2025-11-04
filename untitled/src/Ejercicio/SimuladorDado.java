package Ejercicio;
import java.util.*;
public class SimuladorDado {
    public static void main(String[] args) {
        Scanner donde=new Scanner(System.in);
        Dado reto=new Dado();
        int CantiLna;
        System.out.println("*** SIMULADOR LANZAMIENTOS DADO ***");
        System.out.println("""
                    REGLAS.
                *Si sale 6, ganas 5000
                *Si sale 1, ganas 1000
                *Si sale 2,3,4 0 5, pierdes 2000
                """);
        System.out.print("Ingrese los tiros que desea realizar: ");
        CantiLna=donde.nextInt();
        reto.establecertiros(CantiLna);
        reto.resultadoLanzamientos();
        reto.calcularCantidadAcumulada();
        reto.mostrarLanzamientos();
        System.out.println("La cantidad acumulada del juego fue de "+reto.mostrarCantidadAcumulada());
    }
}
