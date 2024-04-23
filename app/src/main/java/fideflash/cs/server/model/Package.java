package fideflash.cs.server.model;

public class Package extends Model {


    private UserProfile user;
    private String originAddress;
    private String destinyAddress;
    private String packageType;

    private String status;
    private Double deliveryRating;

    public Package(Long id, UserProfile user, String originAddress, String destinyAddress, String packageType,
                   String status, Double deliveryRating) {
        this.id = id;
        this.user = user;
        this.originAddress = originAddress;
        this.destinyAddress = destinyAddress;
        this.packageType = packageType;
        this.status = status;
        this.deliveryRating = deliveryRating;
    }

    public Package() {
    }


    public UserProfile getUser() {
        return user;
    }

    public void setUser(UserProfile user) {
        this.user = user;
    }

    public String getOriginAddress() {
        return originAddress;
    }

    public void setOriginAddress(String originAddress) {
        this.originAddress = originAddress;
    }

    public String getDestinyAddress() {
        return destinyAddress;
    }

    public void setDestinyAddress(String destinyAddress) {
        this.destinyAddress = destinyAddress;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getDeliveryRating() {
        return deliveryRating;
    }

    public void setDeliveryRating(Double deliveryRating) {
        this.deliveryRating = deliveryRating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Package aPackage)) return false;
        if (!super.equals(o)) return false;

        if (getUser() != null ? !getUser().equals(aPackage.getUser()) : aPackage.getUser() != null) return false;
        if (getOriginAddress() != null ? !getOriginAddress().equals(aPackage.getOriginAddress()) : aPackage.getOriginAddress() != null)
            return false;
        if (getDestinyAddress() != null ? !getDestinyAddress().equals(aPackage.getDestinyAddress()) : aPackage.getDestinyAddress() != null)
            return false;
        if (getPackageType() != null ? !getPackageType().equals(aPackage.getPackageType()) : aPackage.getPackageType() != null)
            return false;
        if (getStatus() != null ? !getStatus().equals(aPackage.getStatus()) : aPackage.getStatus() != null) return false;
        return getDeliveryRating() != null ? getDeliveryRating().equals(aPackage.getDeliveryRating()) : aPackage.getDeliveryRating() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getUser() != null ? getUser().hashCode() : 0);
        result = 31 * result + (getOriginAddress() != null ? getOriginAddress().hashCode() : 0);
        result = 31 * result + (getDestinyAddress() != null ? getDestinyAddress().hashCode() : 0);
        result = 31 * result + (getPackageType() != null ? getPackageType().hashCode() : 0);
        result = 31 * result + (getStatus() != null ? getStatus().hashCode() : 0);
        result = 31 * result + (getDeliveryRating() != null ? getDeliveryRating().hashCode() : 0);
        return result;
    }
}
