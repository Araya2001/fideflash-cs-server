package fideflash.cs.server.model;

public abstract class Perfil {
    private Long id;
    private String nombre;
    private String alias;


    public Perfil(Long id, String nombre, String alias) {
        this.id = id;
        this.nombre = nombre;
        this.alias = alias;
    }

    public Perfil() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }


    public abstract Boolean actualizarPerfil(Perfil perfil);
}
