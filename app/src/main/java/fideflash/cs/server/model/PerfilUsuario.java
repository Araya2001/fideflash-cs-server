package fideflash.cs.server.model;

public class PerfilUsuario extends Perfil {
    private String direccion;
    private String numeroDeContacto;

    public PerfilUsuario(Long id, String nombre, String alias, String direccion, String numeroDeContacto) {
        super(id, nombre, alias);
        this.direccion = direccion;
        this.numeroDeContacto = numeroDeContacto;
    }

    public PerfilUsuario() {

    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroDeContacto() {
        return numeroDeContacto;
    }

    public void setNumeroDeContacto(String numeroDeContacto) {
        this.numeroDeContacto = numeroDeContacto;
    }

    @Override
    public Boolean actualizarPerfil(Perfil perfil) {
        return null;
    }
}
