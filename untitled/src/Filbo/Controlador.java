package Filbo;
import java.util.ArrayList;

public class Controlador {
    private ArrayList<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarLibros() {
        System.out.println("\n=== Catálogo de Libros ===");
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }
}
