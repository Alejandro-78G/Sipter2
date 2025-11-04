package Ejercicio;

public class EjecutarNumAle {
    public static void main(String[] args) {
        NumerosAleatorios numeros=new NumerosAleatorios();
        System.out.println("*** GENERADOR DE NÚMEROS ALEATORIOS ***");
        System.out.println("Generando números hasta que los dos primeros sean iguales y que el tercero sea igual a la suma de los dos primeros");

        while (!numeros.cumpleCondicion){
            numeros.numerosAleatorios();
            System.out.println("intento numero "+numeros.cantidadIntentos() + ":");
            System.out.println("Número 1: "+numeros.numeroA());
            System.out.println("Número 2: "+numeros.numeroB());
            System.out.println("Número 3: "+numeros.numeroC());
            System.out.println("Suma de los dos primeros: "+numeros.sumaDosPrimeros());
            numeros.cumplenCondiciones();
            if (numeros.cumplenCondicion()) {
                System.out.println("¡CONDICIÓN CUMPLIDA! Los dos primeros numeros son iguales y la suma de estos da como resultado el numero tres.");
            } else {
                System.out.println("La condición no se cumple. Continuando...");
            }
        }

        System.out.println("\n*** RESULTADOS ***");
        System.out.println("Total de intentos realizados: "+numeros.cantidadIntentos());
        System.out.println("Números finales: "+numeros.numeroA()+", "+numeros.numeroB()+", "+numeros.numeroC());
        System.out.println("Suma verificada: "+numeros.numeroA()+" + "+numeros.numeroB()+" = "+numeros.sumaDosPrimeros());
    }
}
