package lesson19.HW;

/**
 * Created by Alex on 06.11.2017.
 */
public class File {
    private long id;
    private String name;
    private String format;
    private long size;

    public File(long id, String name, String format, long size) throws Exception {
        this.id = id;
        this.name = name;
        if (name.length() > 10) {
            throw new Exception("invalid file name : size must be 10 symbols long ");
        }

        this.format = format;
        this.size = size;
    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFormat() {
        return format;
    }

    public long getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "File{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", format='" + format + '\'' +
                ", size=" + size +
                '}';
    }
}

