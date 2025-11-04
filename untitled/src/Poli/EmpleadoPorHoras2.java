package Poli;

class EmpleadoPorHoras2 extends Empleado12 {

    private int horasTrab;
    private float cuotaHora;

    public void establecerHorasTrab(int horasTr){
        horasTrab=horasTr;
    }

    public void establecerCuotaHora(float cuotaHr){
        cuotaHora=cuotaHr;
    }

    public void calcularSueldoQna(){
        sueldoQna=horasTrab*cuotaHora;
    }
}
