package lesson28;

import java.util.Date;

public class Capability implements Comparable<Capability> {
    private long id;
    private String channelName;
    private String fingerprint;
    private boolean isActive;
    private Date dateCreated;

    public Capability(long id, String channelName, String fingerprint, boolean isActive, Date dateCreated) {
        this.id = id;
        this.channelName = channelName;
        this.fingerprint = fingerprint;
        this.isActive = isActive;
        this.dateCreated = dateCreated;
    }

    public long getId() {
        return id;
    }

    public String getChannelName() {
        return channelName;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public boolean isActive() {
        return isActive;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Capability that = (Capability) o;

        if (id != that.id) return false;
        if (isActive != that.isActive) return false;
        if (!channelName.equals(that.channelName)) return false;
        if (!fingerprint.equals(that.fingerprint)) return false;
        return dateCreated.equals(that.dateCreated);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + channelName.hashCode();
        result = 31 * result + fingerprint.hashCode();
        result = 31 * result + (isActive ? 1 : 0);
        result = 31 * result + dateCreated.hashCode();
        return result;
    }

    @Override
    public int compareTo(Capability capability) {
        System.out.println("compareTo is used");
        return (int) (this.id - capability.getId());
    }

    @Override
    public String toString() {
        return "Capability{" +
                "id=" + id +
                ", channelName='" + channelName + '\'' +
                ", fingerprint='" + fingerprint + '\'' +
                ", isActive=" + isActive +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
