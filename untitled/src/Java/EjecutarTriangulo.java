package Java;
import java.util.*;
public class EjecutarTriangulo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double basTri, altuTri;
        Triangulo triangulo = new Triangulo();
        System.out.println("\n      CALCULA AREA DE UN TRIANGULO \n");
        System.out.print("Ingrese la base del triangulo: ");
        basTri = teclado.nextInt();
        System.out.print("Ingrese la altura del triangulo: ");
        altuTri=teclado.nextInt();
        triangulo.establecerDator(basTri,altuTri);
        triangulo.calcularAreaTriangulo();
        System.out.println("El area del triangulo es: "+triangulo.obtenerAreaTriangulo());
    }
}

