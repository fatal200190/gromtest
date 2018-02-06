package lesson33.HW;

import org.apache.commons.io.IOUtils;

import java.io.*;

public class WriteToFile {

    public void writeToFileFromConsole(String path) throws Exception {
        if (!new File(path).exists()) {
            System.err.println("File with path " + path + " not found");
            return;
        }
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        System.out.println("Enter file content to write in the file:");
        FileWriter writer = null;
        BufferedWriter bufferedWriter = null;

        StringBuffer res = new StringBuffer();

        String line;
        while (!(line = br.readLine()).equals("wr")) {
            res.append(line);
            res.append("\r\n");
        }
        if (res.length() > 0) {
            res.replace(res.length() - 1, res.length(), "");
        }
        try {
            writer = new FileWriter(path, true);
            bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.append("\r\n");
            bufferedWriter.append(res);

        } catch (IOException e) {
            System.err.println("Can't write to file with path" + path);
        } finally {
            IOUtils.closeQuietly(bufferedWriter);
            IOUtils.closeQuietly(writer);
            IOUtils.closeQuietly(reader);
            IOUtils.closeQuietly(br);
        }
    }
}
