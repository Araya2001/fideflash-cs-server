package fideflash.cs.server.model;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Objects;

public class Route extends Model {

    private BusinessPartnerProfile businessPartnerProfile;
    private Collection<Package> packageCollection;
    private String routeStatus;
    private LocalDateTime createDate;
    private LocalDateTime finishDate;

    private Collection<RouteLocation> routeLocationCollection;

    public Route(Long id, BusinessPartnerProfile businessPartnerProfile, Collection<Package> packageCollection, String routeStatus, LocalDateTime createDate, LocalDateTime finishDate, Collection<RouteLocation> routeLocationCollection) {
        this.id = id;
        this.businessPartnerProfile = businessPartnerProfile;
        this.packageCollection = packageCollection;
        this.routeStatus = routeStatus;
        this.createDate = createDate;
        this.finishDate = finishDate;
        this.routeLocationCollection = routeLocationCollection;
    }

    public Route() {
    }

    public BusinessPartnerProfile getBusinessPartnerProfile() {
        return businessPartnerProfile;
    }

    public void setBusinessPartnerProfile(BusinessPartnerProfile businessPartnerProfile) {
        this.businessPartnerProfile = businessPartnerProfile;
    }

    public Collection<Package> getPaquetes() {
        return packageCollection;
    }

    public void setPaquetes(Collection<Package> aPackages) {
        this.packageCollection = aPackages;
    }

    public String getRouteStatus() {
        return routeStatus;
    }

    public void setRouteStatus(String routeStatus) {
        this.routeStatus = routeStatus;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(LocalDateTime finishDate) {
        this.finishDate = finishDate;
    }

    public Collection<RouteLocation> getRouteUbicationCollection() {
        return routeLocationCollection;
    }

    public void setRouteUbicationCollection(Collection<RouteLocation> routeLocationCollection) {
        this.routeLocationCollection = routeLocationCollection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Route route)) return false;
        if (!super.equals(o)) return false;

        if (getBusinessPartnerProfile() != null ? !getBusinessPartnerProfile().equals(route.getBusinessPartnerProfile()) : route.getBusinessPartnerProfile() != null)
            return false;
        if (!Objects.equals(packageCollection, route.packageCollection)) return false;
        if (getRouteStatus() != null ? !getRouteStatus().equals(route.getRouteStatus()) : route.getRouteStatus() != null) return false;
        if (getCreateDate() != null ? !getCreateDate().equals(route.getCreateDate()) : route.getCreateDate() != null) return false;
        if (getFinishDate() != null ? !getFinishDate().equals(route.getFinishDate()) : route.getFinishDate() != null) return false;
        return Objects.equals(routeLocationCollection, route.routeLocationCollection);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getBusinessPartnerProfile() != null ? getBusinessPartnerProfile().hashCode() : 0);
        result = 31 * result + (packageCollection != null ? packageCollection.hashCode() : 0);
        result = 31 * result + (getRouteStatus() != null ? getRouteStatus().hashCode() : 0);
        result = 31 * result + (getCreateDate() != null ? getCreateDate().hashCode() : 0);
        result = 31 * result + (getFinishDate() != null ? getFinishDate().hashCode() : 0);
        result = 31 * result + (routeLocationCollection != null ? routeLocationCollection.hashCode() : 0);
        return result;
    }
}
