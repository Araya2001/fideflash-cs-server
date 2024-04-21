package fideflash.cs.server.model;

import java.time.LocalDateTime;

public class Mensaje {
    private Long id;
    private Perfil perfil;
    private String contenido;
    private LocalDateTime horaDeEntrega;

    private Boolean esMensajeEliminado;

    public Mensaje(Long id, Perfil perfil, String contenido, LocalDateTime horaDeEntrega, Boolean esMensajeEliminado) {
        this.id = id;
        this.perfil = perfil;
        this.contenido = contenido;
        this.horaDeEntrega = horaDeEntrega;
        this.esMensajeEliminado = esMensajeEliminado;
    }

    public Mensaje() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDateTime getHoraDeEntrega() {
        return horaDeEntrega;
    }

    public void setHoraDeEntrega(LocalDateTime horaDeEntrega) {
        this.horaDeEntrega = horaDeEntrega;
    }

    public Boolean getEsMensajeEliminado() {
        return esMensajeEliminado;
    }

    public void setEsMensajeEliminado(Boolean esMensajeEliminado) {
        this.esMensajeEliminado = esMensajeEliminado;
    }

    public Boolean enviarMensaje() {
        return Boolean.FALSE;
    }

    public Boolean eliminarMensaje() {
        return Boolean.FALSE;
    }


}
