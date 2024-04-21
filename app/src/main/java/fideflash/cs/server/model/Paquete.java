package fideflash.cs.server.model;

public class Paquete {

    private Long id;
    private PerfilUsuario usuario;
    private String direccionOrigen;
    private String direccionDestino;
    private String tipoDePaquete;

    private String estadoDePaquete;
    private Double calificacionEntrega;

    public Paquete(Long id, PerfilUsuario usuario, String direccionOrigen, String direccionDestino, String tipoDePaquete,
                   String estadoDePaquete, Double calificacionEntrega) {
        this.id = id;
        this.usuario = usuario;
        this.direccionOrigen = direccionOrigen;
        this.direccionDestino = direccionDestino;
        this.tipoDePaquete = tipoDePaquete;
        this.estadoDePaquete = estadoDePaquete;
        this.calificacionEntrega = calificacionEntrega;
    }

    public Paquete() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PerfilUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(PerfilUsuario usuario) {
        this.usuario = usuario;
    }

    public String getDireccionOrigen() {
        return direccionOrigen;
    }

    public void setDireccionOrigen(String direccionOrigen) {
        this.direccionOrigen = direccionOrigen;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public void setDireccionDestino(String direccionDestino) {
        this.direccionDestino = direccionDestino;
    }

    public String getTipoDePaquete() {
        return tipoDePaquete;
    }

    public void setTipoDePaquete(String tipoDePaquete) {
        this.tipoDePaquete = tipoDePaquete;
    }

    public String getEstadoDePaquete() {
        return estadoDePaquete;
    }

    public void setEstadoDePaquete(String estadoDePaquete) {
        this.estadoDePaquete = estadoDePaquete;
    }

    public Double getCalificacionEntrega() {
        return calificacionEntrega;
    }

    public void setCalificacionEntrega(Double calificacionEntrega) {
        this.calificacionEntrega = calificacionEntrega;
    }

    public Long generarIdentificadorUnico() {
        return null;
    }

    public Boolean cambiarEstadoDePaquete(String estadoACambiar) {
        return null;
    }

    public Boolean calificarEntrega(Double calificacion) {
        return null;
    }


}
