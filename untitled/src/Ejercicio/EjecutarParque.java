package Ejercicio;

import java.util.Scanner;

class EjecutarParque {
    public static void main(String[] args) {
        Scanner reto = new Scanner(System.in);
        Parque paque = new Parque();

        System.out.println("\nPodras subirte\n");

        while (true) {
            System.out.print("Ingresa la altura: ");
            int altura = reto.nextInt();

            int[] alturas = {altura};
            paque.establecerAltura(alturas);

            boolean puedePasar = paque.calcularAltura();

            System.out.println(
                    "Si el sistema arroja True puede pasar y si arroja False no puede pasar. La respuesta es: "
                            + puedePasar
            );
        }
    }
}
