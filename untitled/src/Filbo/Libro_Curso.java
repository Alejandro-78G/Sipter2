package Filbo;

public class Libro_Curso extends Libro {
    private String curso;

    public Libro_Curso(String titulo, String autor, double precio, String curso) {
        super(titulo, autor, precio);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public double calcularPrecio() {
        return precio * 0.6;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("[Libro de Texto] Título: " + titulo + ", Autor: " + autor +
                ", Curso: " + curso + ", Precio con descuento: " + calcularPrecio());
    }
}
