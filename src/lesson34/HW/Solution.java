package lesson34.HW;

import java.io.*;

public class Solution {

    private StringBuffer readFile(String path) throws Exception {
        StringBuffer res = new StringBuffer();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            res.append("\r\n");
            while ((line = br.readLine()) != null) {
                res.append(line);
                res.append("\r\n");
            }
            res.replace(res.length() - 1, res.length(), "");
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File does not exist");
        } catch (IOException e) {
            throw new IOException("Reading from file" + path + "failed");
        }
        return res;
    }

    private void writeFile(String path, StringBuffer contentToWrite) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
            bufferedWriter.append(contentToWrite);
        } catch (IOException e) {
            throw new IOException("Can't write to file");
        }
    }
    private void validate(String fileFromPath, String fileToPath) throws Exception {
        File fileFrom = new File(fileFromPath);
        File fileTo = new File(fileToPath);
        if (!fileFrom.exists()) {
            throw new FileNotFoundException("File " + fileFrom + " does not exist");
        }
        if (!fileTo.exists()) {
            throw new FileNotFoundException("File " + fileTo + " does not exist");
        }
        if (!fileFrom.canRead()) {
            throw new Exception("File " + fileFrom + " does not have permission to be read");
        }
        if (!fileFrom.canWrite()) {
            throw new Exception("File " + fileFrom + " does not have permission to be written");
        }
    }
}
