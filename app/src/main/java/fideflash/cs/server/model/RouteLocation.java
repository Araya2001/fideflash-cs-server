package fideflash.cs.server.model;

import java.time.LocalDateTime;

public class RouteLocation extends Model {

    private Double latitude;
    private Double longitude;

    private LocalDateTime recordDate;

    public RouteLocation(Long id, Double latitude, Double longitude, LocalDateTime recordDate) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.recordDate = recordDate;
    }

    public RouteLocation() {
    }


    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public LocalDateTime getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(LocalDateTime recordDate) {
        this.recordDate = recordDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RouteLocation that)) return false;
        if (!super.equals(o)) return false;

        if (getLatitude() != null ? !getLatitude().equals(that.getLatitude()) : that.getLatitude() != null) return false;
        if (getLongitude() != null ? !getLongitude().equals(that.getLongitude()) : that.getLongitude() != null) return false;
        return getRecordDate() != null ? getRecordDate().equals(that.getRecordDate()) : that.getRecordDate() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getLatitude() != null ? getLatitude().hashCode() : 0);
        result = 31 * result + (getLongitude() != null ? getLongitude().hashCode() : 0);
        result = 31 * result + (getRecordDate() != null ? getRecordDate().hashCode() : 0);
        return result;
    }
}
