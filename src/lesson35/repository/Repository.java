package lesson35.repository;

import java.io.*;
import java.util.ArrayList;

public abstract class Repository {

    public void writeToFile(File file, Object object) throws Exception {
        if(!file.exists()){
            throw new Exception("File does not exist");
        }
        if (object == null){
            throw new Exception("Can not write empty info");
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file.getPath(), true))) {
            bufferedWriter.append(object.toString());
            bufferedWriter.append("\r\n");
        } catch (IOException e) {
            throw new IOException("Can't write to file");
        }
    }
    public ArrayList readObjectsFromFile(File file) throws Exception{
        ArrayList<Object>objects = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file.getPath()))){
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.isEmpty()) {
                    String[] fields = line.split(", ");
                    objects.add(lineToObjectFormat(fields));
                }
            }
        }catch (FileNotFoundException e) {
            throw new FileNotFoundException("File does not exist");
        } catch (IOException e) {
            throw new IOException("Reading from file failed");
        }
        return objects;
    }

    public Object lineToObjectFormat(String [] fields){
        return new Object();
    }
}
