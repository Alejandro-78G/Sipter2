package Poli;

class Empleado1 extends Empleado12 {

    private float sueldoMensual;

    public void establecerSueldoMensual1(float sdo) {
        sueldoMensual = sdo;
    }

    public void calcularSueldoQna(){
        sueldoQna=sueldoMensual/2;
    }


}
