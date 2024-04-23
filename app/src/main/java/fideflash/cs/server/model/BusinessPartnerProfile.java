package fideflash.cs.server.model;

public class BusinessPartnerProfile extends Profile {
    private Double rating;

    public BusinessPartnerProfile(Long id, String nombre, String alias, Double rating) {
        super(id, nombre, alias);
        this.rating = rating;
    }

    public BusinessPartnerProfile() {
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BusinessPartnerProfile that)) return false;

        return getRating() != null ? getRating().equals(that.getRating()) : that.getRating() == null;
    }

    @Override
    public int hashCode() {
        return getRating() != null ? getRating().hashCode() : 0;
    }
}
