package lesson35.repository;

import lesson35.model.User;
import lesson35.model.UserType;

import java.io.*;
import java.util.ArrayList;

public class ReadWriteToFile {

    public void writeFile(String path, Object object) throws Exception {
        validate(path);
        if (object.equals(null)){
            throw new NullPointerException("Object can not be null");
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
            bufferedWriter.append(object.toString());
            bufferedWriter.append("\r\n");
        } catch (IOException e) {
            throw new IOException("Can't write to file");
        }
    }

    public  ArrayList<User> readFile(String path) throws Exception {
        ArrayList<User>users = new ArrayList<>();
        User user = new User(0,null,null,null,null);
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String [] fields = line.split(",");
                user.setId(Long.parseLong(fields[0]));
                user.setUserName(fields[1]);
                user.setPassword(fields[2]);
                user.setCountry(fields[3]);
                if (fields[4].equals(" USER")){
                    user.setUserType(UserType.USER);
                }else user.setUserType(UserType.ADMIN);
                users.add(user);
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File does not exist");
        } catch (IOException e) {
            throw new IOException("Reading from file" + path + "failed");
        }
        return users;
    }



    private static void validate(String Path) throws Exception {
        File file = new File(Path);
        if (!file.exists()) {
            throw new FileNotFoundException("File " + file + " does not exist");
        }

        if (!file.canRead()) {
            throw new Exception("File " + file + " does not have permission to be read");
        }

        if (!file.canWrite()) {
            throw new Exception("File " + file + " does not have permission to be written");
        }
    }



}
