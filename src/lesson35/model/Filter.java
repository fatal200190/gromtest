package lesson35.model;

import java.util.Date;

public class Filter {
    private int numberOfGuests;
    private double price;
    private boolean breakfastIncluded;
    private boolean petsAllowed;
    private Date dateAvailableFrom;
    private String country;
    private String city;

    public Filter(int numberOfGuests, double price, boolean breakfastIncluded, boolean petsAllowed, Date dateAvailableFrom, String country, String city) {
        this.numberOfGuests = numberOfGuests;
        this.price = price;
        this.breakfastIncluded = breakfastIncluded;
        this.petsAllowed = petsAllowed;
        this.dateAvailableFrom = dateAvailableFrom;
        this.country = country;
        this.city = city;
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

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Filter)) return false;

        Filter filter = (Filter) o;

        if (getNumberOfGuests() != filter.getNumberOfGuests()) return false;
        if (Double.compare(filter.getPrice(), getPrice()) != 0) return false;
        if (isBreakfastIncluded() != filter.isBreakfastIncluded()) return false;
        if (isPetsAllowed() != filter.isPetsAllowed()) return false;
        if (!getDateAvailableFrom().equals(filter.getDateAvailableFrom())) return false;
        if (!getCountry().equals(filter.getCountry())) return false;
        return getCity().equals(filter.getCity());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getNumberOfGuests();
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (isBreakfastIncluded() ? 1 : 0);
        result = 31 * result + (isPetsAllowed() ? 1 : 0);
        result = 31 * result + getDateAvailableFrom().hashCode();
        result = 31 * result + getCountry().hashCode();
        result = 31 * result + getCity().hashCode();
        return result;
    }

}
