package SIpter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuario {
    private String nombre;
    private String apellido;
    private Long cedula;
    private String tipoDocumento;
    private String contrasena;
    private String nombreUsuario;
    private String ciudad;
    private String rol;
    private List<String> viajes = new ArrayList<>();
    public Usuario(String nombre, String apellido, Long cedula, String tipoDocumento,
                   String contrasena, String nombreUsuario, String ciudad, String rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.tipoDocumento = tipoDocumento;
        this.contrasena = contrasena;
        this.nombreUsuario = nombreUsuario;
        this.ciudad = ciudad;
        this.rol = rol;
    }

    public Usuario() {}

    public Usuario(String nombre, String apellido, Long cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public Long getCedula() { return cedula; }
    public void setCedula(Long cedula) { this.cedula = cedula; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getTipoDocumento() { return tipoDocumento; }
    public void setTipoDocumento(String tipoDocumento) { this.tipoDocumento = tipoDocumento; }

    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }

    public String getNombreUsuario() { return nombreUsuario; }
    public void setNombreUsuario(String nombreUsuario) { this.nombreUsuario = nombreUsuario; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }


    public void agregarViaje(String viaje) {
        viajes.add(viaje);
    }

    public List<String> getViajes() {
        return viajes;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " | Cédula: " + cedula + " | Ciudad: " + ciudad + " | Rol: " + rol;
    }
}
