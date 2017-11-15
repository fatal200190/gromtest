package lesson19.HW;

/**
 * Created by Alex on 06.11.2017.
 */
public class Controller {

    public void put(Storage storage, File file) throws Exception {
        validatePut(storage,file);

        int indexOfNull = 0;
        for (File tmp : storage.getFiles()){
            if (tmp == null) {
                storage.getFiles()[indexOfNull] = file;
                break;
            }
                indexOfNull++;
        }
    }


    public void delete(Storage storage, File file) throws Exception {

        validateDelete(storage, file);

        //удаление

        int index = 0;
        for (File tmp : storage.getFiles()) {
            if (tmp.getId() == file.getId() && tmp.getName().equals(file.getName())) {
                storage.getFiles()[index] = null;
            }
            index++;
        }
    }

    public void transferAll(Storage storageFrom, Storage storageTo) throws Exception {

        validateTransferAll(storageFrom, storageTo);

        //трансфер

        int index = 0;
        int i = 0;
        for (File tmp : storageTo.getFiles()) {
            if (tmp == null){
                storageTo.getFiles()[index] = storageFrom.getFiles()[i];
                i++;
            }
            index++;
        }
    }

    public void transferFile(Storage storageFrom, Storage storageTo, long id) throws Exception {
        if (findFile(storageFrom, id) == null) {
            throw new Exception("File id " + id + " is not found");
        }
        put(storageTo, findFile(storageFrom, id));
        delete(storageFrom, findFile(storageFrom, id));
    }


    private void validatePut(Storage storage, File file) throws Exception {
        //проверка айди
        if (findById(storage, file.getId())) {
            throw new Exception("file (id " + file.getId() + ") is already in the Storage id " + storage.getId());
        }
        //проверка формата
        int coincidence = 0;
        for (String format : storage.getFormatSupported()) {
            if (format != null && format.equals(file.getFormat())) {
                coincidence++;
            }
        }
        if (coincidence == 0) {
            throw new Exception("file (id " + file.getId() + ") format is not supported to Storage id " + storage.getId());
        }
        //проверка размера
        long sumSizesOfFiles = 0;
        for (File tmp : storage.getFiles())
            if (null != tmp) {
                sumSizesOfFiles += tmp.getSize();
            }
        if ((storage.getStorageSize() - (sumSizesOfFiles + file.getSize())) < 0) {
            throw new Exception("file (id " + file.getId() + ") size is bigger then Storage id " + storage.getId() + " size");
        }

        int count = 0;
        for (File tmp : storage.getFiles()){
            if (tmp == null)
                count++;
        }
        if (count == 0){
            throw new Exception("No place in Storage id "+ storage.getId());
        }

        if (storage.getFiles().length == 0){
            throw new Exception("Storage is empty");
        }
    }

    private void validateDelete(Storage storage, File file) throws Exception {
        //если сторедж пустой
        if (storage.getFiles().length == 0) {
            throw new Exception("Storage is empty");
        }

        //проверка айди
        if (!findByIdAndName(storage, file.getId(), file.getName())) {
            throw new Exception("there is no file with id " + file.getId() + " in the Storage " + storage.getId());
        }
    }

    private void validateTransferAll(Storage storageFrom, Storage storageTo) throws Exception {
        //проверка айди сторедж
        if (storageFrom.getId() == storageTo.getId()) {
            throw new Exception("Duplicate id " + storageFrom.getId() + " and " + storageTo.getId());
        }

        //проверка наличие одинаковых айди файлов
        for (File tmpFrom : storageFrom.getFiles()) {
            for (File tmpTo : storageTo.getFiles()) {
                if (tmpFrom != null && tmpTo != null && tmpFrom.getId() == tmpTo.getId())
                    throw new Exception("Storage " + storageFrom.getId() + " have file id " + tmpFrom.getId() +
                            " what id is already in the " + storageTo.getId() + " Storage");
            }
        }

        //проверка форматов
        for (File tmp : storageFrom.getFiles()) {
            if (tmp != null) {
                int count = 0;
                for (String format : storageTo.getFormatSupported()) {
                    if (format != null && format.equals(tmp.getFormat()))
                        count++;
                }
                if (count == 0) {
                    throw new Exception("Format of file id " + tmp.getId() + " is not supported to Storage id " + storageTo.getId());
                }
            }
        }
        //проверка размера
        long sumSizesOfFilesFrom = 0;
        for (File tmp : storageFrom.getFiles())
            if (null != tmp) {
                sumSizesOfFilesFrom += tmp.getSize();
            }
        long sumSizesOfFilesTo = 0;
        for (File tmp : storageTo.getFiles())
            if (null != tmp) {
                sumSizesOfFilesTo += tmp.getSize();
            }
        if (storageTo.getStorageSize() < (sumSizesOfFilesFrom + sumSizesOfFilesTo)) {
            throw new Exception("Storage id " + storageTo.getId() + " is out of size");
        }
        //проверка страны
        if (!storageFrom.getStorageCountry().equals(storageTo.getStorageCountry())) {
            throw new Exception("Invalid Storage id " + storageFrom.getId() + " country");
        }

        int count = 0;
        for(File tmp : storageTo.getFiles()){
            if(tmp == null)
                count++;
        }
        if (count < storageFrom.getFiles().length){
            throw new Exception("Out of place in Storage id "+ storageTo.getId());
        }
    }


    private boolean findById(Storage storage, long id) {
        for (File file : storage.getFiles()) {
            if (file != null && file.getId() == id)
                return true;
        }
        return false;
    }

    private boolean findByIdAndName(Storage storage, long id, String name) {
        for (File file : storage.getFiles()) {
            if (file != null && file.getId() == id && file.getName().equals(name))
                return true;
        }
        return false;
    }

    private File findFile(Storage storage, long id) {
        for (File file : storage.getFiles()) {
            if (file != null && file.getId() == id) {
                return file;
            }
        }
        return null;
    }

}
