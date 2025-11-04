package Java;

public class Triangulo {
    private double baseTriangulo;
    private double alturaTriangulo;
    private double areaTriangulo;

    public void establecerDator (double base, double altura){
        baseTriangulo = base;
        alturaTriangulo = altura;
    }

    public void calcularAreaTriangulo(){
        areaTriangulo=(baseTriangulo*alturaTriangulo)/2;
    }

    public double obtenerAreaTriangulo(){
        return areaTriangulo;
    }

}

