package fideflash.cs.server.model;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Objects;

public class Message extends Model {
    private Profile profile;
    private String body;
    private LocalDateTime deliveryTime;

    private Boolean isDeleted;

    public Message(Long id, Profile profile, String body, LocalDateTime deliveryTime, Boolean isDeleted) {
        this.id = id;
        this.profile = profile;
        this.body = body;
        this.deliveryTime = deliveryTime;
        this.isDeleted = isDeleted;
    }

    public Message() {
    }


    public Profile getPerfil() {
        return profile;
    }

    public void setPerfil(Profile profile) {
        this.profile = profile;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDateTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalDateTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message message)) return false;

        if (!Objects.equals(profile, message.profile)) return false;
        if (getBody() != null ? !getBody().equals(message.getBody()) : message.getBody() != null) return false;
        if (getDeliveryTime() != null ? !getDeliveryTime().equals(message.getDeliveryTime()) : message.getDeliveryTime() != null)
            return false;
        return getIsDeleted() != null ? getIsDeleted().equals(message.getIsDeleted()) : message.getIsDeleted() == null;
    }

    @Override
    public int hashCode() {
        int result = profile != null ? profile.hashCode() : 0;
        result = 31 * result + (getBody() != null ? getBody().hashCode() : 0);
        result = 31 * result + (getDeliveryTime() != null ? getDeliveryTime().hashCode() : 0);
        result = 31 * result + (getIsDeleted() != null ? getIsDeleted().hashCode() : 0);
        return result;
    }
}
