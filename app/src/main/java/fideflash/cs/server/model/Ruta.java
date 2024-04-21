package fideflash.cs.server.model;

import java.time.LocalDateTime;
import java.util.Collection;

public class Ruta {

    private Long id;
    private PerfilSocioRepartidor socioRepartidor;
    private Collection<Paquete> paquetes;
    private String estadoRuta;
    private LocalDateTime horaCreacion;
    private LocalDateTime horaFinalizacion;

    private Collection<PuntoUbicacionRuta> puntosDeUbicacionDeRuta;

    public Ruta(Long id, PerfilSocioRepartidor socioRepartidor, Collection<Paquete> paquetes, String estadoRuta, LocalDateTime horaCreacion, LocalDateTime horaFinalizacion, Collection<PuntoUbicacionRuta> puntosDeUbicacionDeRuta) {
        this.id = id;
        this.socioRepartidor = socioRepartidor;
        this.paquetes = paquetes;
        this.estadoRuta = estadoRuta;
        this.horaCreacion = horaCreacion;
        this.horaFinalizacion = horaFinalizacion;
        this.puntosDeUbicacionDeRuta = puntosDeUbicacionDeRuta;
    }

    public Ruta() {
    }

    public PerfilSocioRepartidor getSocioRepartidor() {
        return socioRepartidor;
    }

    public void setSocioRepartidor(PerfilSocioRepartidor socioRepartidor) {
        this.socioRepartidor = socioRepartidor;
    }

    public Collection<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(Collection<Paquete> paquetes) {
        this.paquetes = paquetes;
    }

    public String getEstadoRuta() {
        return estadoRuta;
    }

    public void setEstadoRuta(String estadoRuta) {
        this.estadoRuta = estadoRuta;
    }

    public LocalDateTime getHoraCreacion() {
        return horaCreacion;
    }

    public void setHoraCreacion(LocalDateTime horaCreacion) {
        this.horaCreacion = horaCreacion;
    }

    public LocalDateTime getHoraFinalizacion() {
        return horaFinalizacion;
    }

    public void setHoraFinalizacion(LocalDateTime horaFinalizacion) {
        this.horaFinalizacion = horaFinalizacion;
    }

    public Collection<PuntoUbicacionRuta> getPuntosDeUbicacionDeRuta() {
        return puntosDeUbicacionDeRuta;
    }

    public void setPuntosDeUbicacionDeRuta(Collection<PuntoUbicacionRuta> puntosDeUbicacionDeRuta) {
        this.puntosDeUbicacionDeRuta = puntosDeUbicacionDeRuta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean agregarPaquete(Paquete paquete) {
        return paquetes.add(paquete);
    }

    public Boolean agregarPuntoDeUbicacion(PuntoUbicacionRuta puntoUbicacionRuta) {
        return puntosDeUbicacionDeRuta.add(puntoUbicacionRuta);
    }

    public Boolean iniciarRuta() {
        return Boolean.FALSE;
    }

    public Boolean finalizarRuta() {
        return Boolean.FALSE;
    }
}
