package Ejercicio;
import java.util.*;
public class Dado {

    int [] resultado;
    int tiros;
    double cantidadAcumulada;
    Random aleatorio = new Random();

    public void establecertiros(int Ntiros){
        tiros=Ntiros;
        resultado= new int[tiros+1];
    }

    public void resultadoLanzamientos(){
        for(int i=1;i<=tiros;i++){
            resultado[i]=aleatorio.nextInt(1,7);
        }
    }

    public void calcularCantidadAcumulada (){
        for (int i=1;i<=tiros;i++){
            switch (resultado[i]){
                case 1 -> cantidadAcumulada=+1000;
                case 2,3,4,5 -> cantidadAcumulada=-2000;
                case 6 -> cantidadAcumulada=+5000;
                default -> cantidadAcumulada=+0;
            };
        }
    }

    public void mostrarLanzamientos(){
        for(int i=1;i<=tiros;i++){
            System.out.println("resultado del lanzamiento "+i+": "+resultado[i]);
        }
    }

    public double mostrarCantidadAcumulada(){
        return cantidadAcumulada;
    }
}

