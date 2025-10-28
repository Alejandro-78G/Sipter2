package SIpter;
import java.time.LocalDateTime;
public class Viaje {
        private String origen;
        private String destino;
        private String tipoVehiculo;
        private String estado;
        private LocalDateTime fechaHora;


        public Viaje(String origen, String destino, String tipoVehiculo) {
            this.origen = origen;
            this.destino = destino;
            this.tipoVehiculo = tipoVehiculo;
            this.estado = "En curso";
            this.fechaHora = LocalDateTime.now();
        }
        public String getEstado() { return estado; }
        public void setEstado(String estado) { this.estado = estado; }

        @Override
        public String toString() {
            return "Viaje{" +
                    "origen='" + origen + '\'' +
                    ", destino='" + destino + '\'' +
                    ", tipoVehiculo='" + tipoVehiculo + '\'' +
                    ", estado='" + estado + '\'' +
                    ", fechaHora=" + fechaHora +
                    '}';
        }
    }

