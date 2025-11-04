package Ejercicio;
import java.util.*;

public class NumerosAleatorios {

    Random aleatorio = new Random();
    int numA, numB
            , numC,
            dosSuma,
            intentos;
    boolean sumatoriaCumple,cumpleCondicion;

    public void numerosAleatorios(){
        intentos++;
        numA=aleatorio.nextInt(1,10);
        numB =aleatorio.nextInt(1,10);
        numC =aleatorio.nextInt(1,10);
        dosSuma =numA+ numB;
    }

    public void cumplenCondiciones(){
        if (numC == dosSuma){
            sumatoriaCumple=true;
        }

        if(sumatoriaCumple==true){
            cumpleCondicion=true;
        }
    }

    public int cantidadIntentos(){
        return intentos;
    }

    public int numeroA(){
        return numA;
    }

    public int numeroB(){
        return numB;
    }

    public int numeroC(){
        return numC;
    }

    public int sumaDosPrimeros(){
        return numA+ numB;
    }

    public boolean cumplenCondicion(){
        return cumpleCondicion;
    }

}
