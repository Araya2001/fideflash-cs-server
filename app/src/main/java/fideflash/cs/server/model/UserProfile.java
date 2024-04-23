package fideflash.cs.server.model;

public class UserProfile extends Profile {
    private String address;
    private String contactPhoneNumber;

    public UserProfile(Long id, String nombre, String alias, String address, String contactPhoneNumber) {
        super(id, nombre, alias);
        this.address = address;
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public UserProfile() {

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserProfile that)) return false;
        if (!super.equals(o)) return false;

        if (getAddress() != null ? !getAddress().equals(that.getAddress()) : that.getAddress() != null) return false;
        return getContactPhoneNumber() != null ? getContactPhoneNumber().equals(that.getContactPhoneNumber()) : that.getContactPhoneNumber() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getAddress() != null ? getAddress().hashCode() : 0);
        result = 31 * result + (getContactPhoneNumber() != null ? getContactPhoneNumber().hashCode() : 0);
        return result;
    }
}
