package lesson35.model;


import java.util.Date;

public class Room {
    private long id = getId();
    private int numberOfGuests;
    private double price;
    private boolean breakfastIncluded;
    private boolean petsAllowed;
    private Date dateAvailableFrom;
    private Hotel hotel;

    public Room(int numberOfGuests, double price, boolean breakfastIncluded, boolean petsAllowed, Date dateAvailableFrom, Hotel hotel) {
        this.numberOfGuests = numberOfGuests;
        this.price = price;
        this.breakfastIncluded = breakfastIncluded;
        this.petsAllowed = petsAllowed;
        this.dateAvailableFrom = dateAvailableFrom;
        this.hotel = hotel;
    }

    public Room() {
    }

    public long getId() {
        return id;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public double getPrice() {
        return price;
    }

    public boolean isBreakfastIncluded() {
        return breakfastIncluded;
    }

    public boolean isPetsAllowed() {
        return petsAllowed;
    }

    public Date getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBreakfastIncluded(boolean breakfastIncluded) {
        this.breakfastIncluded = breakfastIncluded;
    }

    public void setPetsAllowed(boolean petsAllowed) {
        this.petsAllowed = petsAllowed;
    }

    public void setDateAvailableFrom(Date dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room)) return false;

        Room room = (Room) o;

        if (getId() != room.getId()) return false;
        if (getNumberOfGuests() != room.getNumberOfGuests()) return false;
        if (Double.compare(room.getPrice(), getPrice()) != 0) return false;
        if (isBreakfastIncluded() != room.isBreakfastIncluded()) return false;
        if (isPetsAllowed() != room.isPetsAllowed()) return false;
        if (!getDateAvailableFrom().equals(room.getDateAvailableFrom())) return false;
        return getHotel().equals(room.getHotel());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + getNumberOfGuests();
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (isBreakfastIncluded() ? 1 : 0);
        result = 31 * result + (isPetsAllowed() ? 1 : 0);
        result = 31 * result + getDateAvailableFrom().hashCode();
        result = 31 * result + getHotel().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return id +
                ", " + numberOfGuests +
                ", " + price +
                ", " + breakfastIncluded +
                ", " + petsAllowed +
                ", " + dateAvailableFrom +
                ", " + hotel;
    }
}
