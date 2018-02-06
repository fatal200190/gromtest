package lesson34.HW;


import java.io.*;

public class SolutionSentence {
    public void transferSentences(String fileFromPath, String fileToPath, String word) throws Exception {
        validate(fileFromPath,fileToPath);
        writeToFileSentences(fileToPath, findSentenceWithWord(readFile(fileFromPath), word));
        writeFileWithoutWord(fileFromPath,findSentenceWithoutWord(readFile(fileFromPath), word));
    }

    private StringBuffer readFile(String path) throws Exception {
        StringBuffer res = new StringBuffer();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                res.append(line);
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File does not exist");
        } catch (IOException e) {
            throw new IOException("Reading from file" + path + "failed");
        }
        return res;
    }

    private StringBuffer findSentenceWithWord(StringBuffer content, String wordToFind) {
        StringBuffer res = new StringBuffer();
        String text = content.toString();
        for (String sentence : text.split("\\.")) {
            if (sentence.length() > 10 && sentence.toLowerCase().contains(wordToFind)) {
                res.append(sentence.trim() + ".");
                res.append("\r\n");
            }
        }
        return res;
    }

    private void writeToFileSentences(String path, StringBuffer contentToWrite) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
            bufferedWriter.append(contentToWrite);
        } catch (IOException e) {
            throw new IOException("Can't write to file");
        }
    }

    private StringBuffer findSentenceWithoutWord(StringBuffer content, String wordToFind) {
        StringBuffer res = new StringBuffer();
        String text = content.toString();
        for (String sentence : text.split("\\.")) {
            if (sentence.length() < 10 || !sentence.toLowerCase().contains(wordToFind)) {
                res.append(sentence.trim() + ".");
                res.append("\r\n");
            }
        }
        return res;
    }

    private void writeFileWithoutWord(String path, StringBuffer contentToWrite) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, false))) {
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
