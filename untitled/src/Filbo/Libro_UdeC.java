package Filbo;

public class Libro_UdeC extends Libro_Curso {
    private String facultad;

    public Libro_UdeC(String titulo, String autor, double precio, String curso, String facultad) {
        super(titulo, autor, precio, curso);
        this.facultad = facultad;
    }

    public String getFacultad() { return facultad; }
    public void setFacultad(String facultad) { this.facultad = facultad; }

    @Override
    public double calcularPrecio() {
        return precio * 0.75;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("[Libro de Investigación UdeC] Título: " + titulo + ", Autor: " + autor +
                ", Curso: " + getCurso() + ", Facultad: " + facultad +
                ", Precio con descuento: " + calcularPrecio());
    }
}

