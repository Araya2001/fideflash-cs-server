package fideflash.cs.server.model;

public abstract class Profile extends Model{

    private String name;
    private String alias;


    public Profile(Long id, String name, String alias) {
        this.id = id;
        this.name = name;
        this.alias = alias;
    }

    public Profile() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Profile profile)) return false;
        if (!super.equals(o)) return false;

        if (getName() != null ? !getName().equals(profile.getName()) : profile.getName() != null) return false;
        return getAlias() != null ? getAlias().equals(profile.getAlias()) : profile.getAlias() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getAlias() != null ? getAlias().hashCode() : 0);
        return result;
    }
}
