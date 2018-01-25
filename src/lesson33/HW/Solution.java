package lesson33.HW;

import org.apache.commons.io.IOUtils;

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        writeToFileFromConsole("C:\\Users\\Alex\\Desktop\\test.txt");
    }

    public static void writeToFileFromConsole(String path) {
        if (!new File(path).exists()) {
            System.err.println("File with path " + path + " not found");
            return;
        }
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        System.out.println("Enter file content to write in the file:");
        FileWriter writer = null;
        BufferedWriter bufferedWriter = null;
        try {
            writer = new FileWriter(path, true);
            bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.append("\r\n");
            bufferedWriter.append(br.readLine());


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
