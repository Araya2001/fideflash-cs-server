package fideflash.cs.server.model;

import java.util.Collection;

public class Conversation extends Model {
    private Collection<Message> messages;

    private UserProfile userProfile;
    private BusinessPartnerProfile businessPartnerProfile;

    private Collection<Long> idPackageOnRoute;

    public Conversation(Long id, Collection<Message> messages, UserProfile userProfile, BusinessPartnerProfile businessPartnerProfile, Collection<Long> idPackageOnRoute) {
        this.id = id;
        this.messages = messages;
        this.userProfile = userProfile;
        this.businessPartnerProfile = businessPartnerProfile;
        this.idPackageOnRoute = idPackageOnRoute;
    }

    public Conversation() {
    }

    public Collection<Message> getMessages() {
        return messages;
    }

    public void setMessages(Collection<Message> messages) {
        this.messages = messages;
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public BusinessPartnerProfile getBusinessPartnerProfile() {
        return businessPartnerProfile;
    }

    public void setBusinessPartnerProfile(BusinessPartnerProfile businessPartnerProfile) {
        this.businessPartnerProfile = businessPartnerProfile;
    }

    public Collection<Long> getIdPackageOnRoute() {
        return idPackageOnRoute;
    }

    public void setIdPackageOnRoute(Collection<Long> idPackageOnRoute) {
        this.idPackageOnRoute = idPackageOnRoute;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Conversation that)) return false;

        if (getMessages() != null ? !getMessages().equals(that.getMessages()) : that.getMessages() != null) return false;
        if (getUserProfile() != null ? !getUserProfile().equals(that.getUserProfile()) : that.getUserProfile() != null) return false;
        if (getBusinessPartnerProfile() != null ? !getBusinessPartnerProfile().equals(that.getBusinessPartnerProfile()) : that.getBusinessPartnerProfile() != null)
            return false;
        return getIdPackageOnRoute() != null ? getIdPackageOnRoute().equals(that.getIdPackageOnRoute()) : that.getIdPackageOnRoute() == null;
    }

    @Override
    public int hashCode() {
        int result = getMessages() != null ? getMessages().hashCode() : 0;
        result = 31 * result + (getUserProfile() != null ? getUserProfile().hashCode() : 0);
        result = 31 * result + (getBusinessPartnerProfile() != null ? getBusinessPartnerProfile().hashCode() : 0);
        result = 31 * result + (getIdPackageOnRoute() != null ? getIdPackageOnRoute().hashCode() : 0);
        return result;
    }
}