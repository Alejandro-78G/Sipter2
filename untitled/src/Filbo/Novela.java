package Filbo;

public class Novela extends Libro {
    private String tipo;

    public Novela(String titulo, String autor, double precio, String tipo) {
        super(titulo, autor, precio);
        this.tipo = tipo;
    }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    @Override
    public double calcularPrecio() {
        return precio * 0.85;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("[Novela] Título: " + titulo + ", Autor: " + autor +
                ", Tipo: " + tipo + ", Precio con descuento: " + calcularPrecio());
    }
}
