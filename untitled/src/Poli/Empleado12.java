package Poli;

abstract class Empleado12 {

    protected String nombreEmp;
    protected String deptoEmp;
    protected String puestoEmp;
    protected float sueldoQna;

    public void establecerNombreEmp(String nom){
        nombreEmp=nom;
    }

    public void establecerDeotoEmp(String dep){
        deptoEmp=dep;
    }

    public void establecerPuestoEmp(String pue){
        puestoEmp=pue;
    }

    abstract void calcularSueldoQna();

    public String obtenerNombreEmp(){
        return nombreEmp;
    }

    public String obtenerDeptoEmp(){
        return deptoEmp;
    }

    public String obtenerPuestoEmp(){
        return puestoEmp;
    }

    public float obtenerSueldoQna(){
        return sueldoQna;
    }

}
