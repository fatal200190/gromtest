package lesson34.HW;

import org.apache.commons.io.FileUtils;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.OpenOption;

public class SolutionStandardMethods {
    public void copyFileContent(String fileFromPath, String fileToPath) throws Exception {
        File fileFrom = new File(fileFromPath);
        File fileTo = new File(fileToPath);
        validate(fileFrom,fileTo);
        Files.write(fileTo.toPath(),Files.readAllBytes(fileFrom.toPath()));

    }

    public void copyFileContentApacheIO(String fileFromPath, String fileToPath) throws Exception {
        File fileFrom = new File(fileFromPath);
        File fileTo = new File(fileToPath);
        validate(fileFrom,fileTo);
        FileUtils.copyFile(fileFrom,fileTo);
    }


    private void validate(File fileFrom, File fileTo) throws Exception {
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
