package fideflash.cs.server.model;

import java.time.LocalDateTime;

public class PuntoUbicacionRuta {
    private Long id;
    private Double latitud;
    private Double longitud;

    private LocalDateTime horaDeUbicacionRegistrada;

    public PuntoUbicacionRuta(Long id, Double latitud, Double longitud, LocalDateTime horaDeUbicacionRegistrada) {
        this.id = id;
        this.latitud = latitud;
        this.longitud = longitud;
        this.horaDeUbicacionRegistrada = horaDeUbicacionRegistrada;
    }

    public PuntoUbicacionRuta() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public LocalDateTime getHoraDeUbicacionRegistrada() {
        return horaDeUbicacionRegistrada;
    }

    public void setHoraDeUbicacionRegistrada(LocalDateTime horaDeUbicacionRegistrada) {
        this.horaDeUbicacionRegistrada = horaDeUbicacionRegistrada;
    }
}
