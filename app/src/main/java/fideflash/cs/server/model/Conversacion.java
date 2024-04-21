package fideflash.cs.server.model;

import java.util.Collection;

public class Conversacion {
    private Long id;
    private Collection<Mensaje> mensajesDeConversacion;

    private PerfilUsuario perfilUsuario;
    private PerfilSocioRepartidor perfilSocioRepartidor;

    private Collection<Long> identificadoresDePaquetesEnRuta;

    public Conversacion(Long id, Collection<Mensaje> mensajesDeConversacion, PerfilUsuario perfilUsuario, PerfilSocioRepartidor perfilSocioRepartidor, Collection<Long> identificadoresDePaquetesEnRuta) {
        this.id = id;
        this.mensajesDeConversacion = mensajesDeConversacion;
        this.perfilUsuario = perfilUsuario;
        this.perfilSocioRepartidor = perfilSocioRepartidor;
        this.identificadoresDePaquetesEnRuta = identificadoresDePaquetesEnRuta;
    }

    public Conversacion() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Collection<Mensaje> getMensajesDeConversacion() {
        return mensajesDeConversacion;
    }

    public void setMensajesDeConversacion(Collection<Mensaje> mensajesDeConversacion) {
        this.mensajesDeConversacion = mensajesDeConversacion;
    }

    public PerfilUsuario getPerfilUsuario() {
        return perfilUsuario;
    }

    public void setPerfilUsuario(PerfilUsuario perfilUsuario) {
        this.perfilUsuario = perfilUsuario;
    }

    public PerfilSocioRepartidor getPerfilSocioRepartidor() {
        return perfilSocioRepartidor;
    }

    public void setPerfilSocioRepartidor(PerfilSocioRepartidor perfilSocioRepartidor) {
        this.perfilSocioRepartidor = perfilSocioRepartidor;
    }

    public Collection<Long> getIdentificadoresDePaquetesEnRuta() {
        return identificadoresDePaquetesEnRuta;
    }

    public void setIdentificadoresDePaquetesEnRuta(Collection<Long> identificadoresDePaquetesEnRuta) {
        this.identificadoresDePaquetesEnRuta = identificadoresDePaquetesEnRuta;
    }

    public Collection<Mensaje> obtenerMensajesPorOrdenDeEntrega() {
        return null;
    }
}
