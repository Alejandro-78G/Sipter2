package Filbo;

public class Ejecutar_libro {
    public static void main(String[] args) {
        Controlador controlador = new Controlador();

        Libro libro1 = new Libro_Curso("Matemáticas Básicas", "Juan Pérez", 100000, "Ingeniería");
        Libro libro2 = new Libro_UdeC("Investigación en IA", "Ana Gómez", 150000, "Sistemas", "Ingeniería");
        Libro libro3 = new Novela("El enigma del tiempo", "Carlos Ruiz", 80000, "Ciencia Ficción");

        controlador.agregarLibro(libro1);
        controlador.agregarLibro(libro2);
        controlador.agregarLibro(libro3);

        controlador.mostrarLibros();
    }
}
