package lesson19.HW;

import java.util.Arrays;

/**
 * Created by Alex on 06.11.2017.
 */
public class Storage {
    private long id;
    private File[] files;
    private String[] formatSupported;
    private String storageCountry;
    private long storageSize;

    public Storage(long id, File[] files, String[] formatSupported, String storageCountry, long storageSize) {
        this.id = id;
        this.files = files;
        this.formatSupported = formatSupported;
        this.storageCountry = storageCountry;
        this.storageSize = storageSize;
    }

    public long getId() {
        return id;
    }

    public File[] getFiles() {
        return files;
    }

    public String[] getFormatSupported() {
        return formatSupported;
    }

    public String getStorageCountry() {
        return storageCountry;
    }

    public long getStorageSize() {
        return storageSize;
    }

    public void setFiles(File[] files) {
        this.files = files;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "id=" + id +
                ", files=" + Arrays.toString(files) +
                ", formatSupported=" + Arrays.toString(formatSupported) +
                ", storageCountry='" + storageCountry + '\'' +
                ", storageSize=" + storageSize +
                '}';
    }
}
