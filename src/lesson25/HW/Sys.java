package lesson25.HW;

public class Sys {
    private int filesCount;
    private String location;

    public Sys(int filesCount, String location) {
        this.filesCount = filesCount;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Sys{" +
                "filesCount=" + filesCount +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sys sys = (Sys) o;

        if (filesCount != sys.filesCount) return false;
        return location.equals(sys.location);
    }

    @Override
    public int hashCode() {
        int result = filesCount;
        result = 31 * result + location.hashCode();
        return result;
    }
}
