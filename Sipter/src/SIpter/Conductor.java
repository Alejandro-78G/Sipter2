package SIpter;

import java.util.List;

public class Conductor extends Usuario {
    // ATRIBUTOS
    String viajes;
    String pasajeroscant;
    Boolean inacistencia;


    public Conductor(String nombre, String apellido, long Cedula, String viajes,
                     String pasajeroscant, Boolean inacistencia) {

        super(nombre, apellido,Cedula);
        this.inacistencia = inacistencia;
        this.pasajeroscant = pasajeroscant;
        this.viajes = viajes;
    }

    public Conductor() {

    }

    public String getPasajeroscant() {
        return pasajeroscant;
    }

    public void setPasajeroscant(String pasajeroscant) {
        this.pasajeroscant = pasajeroscant;
    }

    @Override
    public List<String> getViajes() {
        return super.getViajes();
    }

    public void setViajes(String viajes) {
        this.viajes = viajes;
    }

    public Boolean getInacistencia() {
        return inacistencia;
    }

    public void setInacistencia(Boolean inacistencia) {
        this.inacistencia = inacistencia;
    }
}
