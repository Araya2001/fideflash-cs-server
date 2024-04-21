package fideflash.cs.server.model;

public class PerfilSocioRepartidor extends Perfil {
    private Double calificacion;

    public PerfilSocioRepartidor(Long id, String nombre, String alias, Double calificacion) {
        super(id, nombre, alias);
        this.calificacion = calificacion;
    }

    public PerfilSocioRepartidor() {
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public Boolean actualizarPerfil(Perfil perfil) {
        return null;
    }
}
