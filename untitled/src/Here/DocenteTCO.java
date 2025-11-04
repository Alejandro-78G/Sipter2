package Here;

public class DocenteTCO extends DocenteP{

    private double sueldoBasico;
    private int canTrabGrado;
    private double valorHoraAsesor;
    private double sueldoMensual;

    public DocenteTCO() {}

    public void calcularSueldo(){
        double asesoriaDoc=(canTrabGrado*valorHoraAsesor)*2;
        sueldoMensual=sueldoBasico+asesoriaDoc;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public int getCanTrabGrado() {
        return canTrabGrado;
    }

    public void setCanTrabGrado(int canTrabGrado) {
        this.canTrabGrado = canTrabGrado;
    }

    public double getValorHoraAsesor() {
        return valorHoraAsesor;
    }

    public void setValorHoraAsesor(double valorHoraAsesor) {
        this.valorHoraAsesor = valorHoraAsesor;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

}
