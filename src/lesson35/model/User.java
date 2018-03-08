package lesson35.model;

import lesson35.IdUnique;

public class User {
    private long id = IdUnique.get();
    private String userName;
    private String password;
    private String country;
    private UserType userType;
    private UserStatus userStatus = UserStatus.OFFLINE;

    public User(String userName, String password, String country, UserType userType) {
        this.userName = userName;
        this.password = password;
        this.country = country;
        this.userType = userType;
    }

    public User() {
    }

    @Override
    public String toString() {
        return
                id +
                ", " + userName +
                ", " + password +
                ", " + country +
                ", " + userType +
                ", " + userStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (!userName.equals(user.userName)) return false;
        if (!password.equals(user.password)) return false;
        if (!country.equals(user.country)) return false;
        if (userType != user.userType) return false;
        return userStatus == user.userStatus;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + userName.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + country.hashCode();
        result = 31 * result + userType.hashCode();
        result = 31 * result + userStatus.hashCode();
        return result;
    }

    public UserStatus getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
