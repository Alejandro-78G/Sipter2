package Here;

public class DocenteHC extends DocenteP {

    private int horasTrab;
    private double valorHora;
    private double sueldoMesHoras;

    public DocenteHC() {}

    public void calcularSueldo(){
        sueldoMesHoras=horasTrab*valorHora;
    }

    public int getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(int horasTrab) {
        this.horasTrab = horasTrab;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getSueldoMesHoras() {
        return sueldoMesHoras;
    }

    public void setSueldoMesHoras(double sueldoMesHoras) {
        this.sueldoMesHoras = sueldoMesHoras;
    }

}
