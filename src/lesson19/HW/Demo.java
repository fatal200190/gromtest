package lesson19.HW;

import java.util.Arrays;

/**
 * Created by Alex on 06.11.2017.
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        File file1 = new File(101, "Adam", "html", 200);
        File file2 = new File(102, "Bill", "txt", 500);
        File file3 = new File(103, "Cell", "exe", 200);
        File file4 = new File(104, "Den", "jpg", 100);
        File file5 = new File(105, "Evan", "java", 150);
        File file6 = new File(106, "Fan", "php", 300);
        File file7 = new File(107, "Glen", "pdf", 100);
        File file8 = new File(108, "Homer", "xml", 500);
        File file9 = new File(109, "Ivan", "png", 1000);
        File file10 = new File(110, "Jack", "mp3", 1000);


        File[] files1 = {file4, null, null, file5, null};
        File[] files2 = {};
        File[] files3 = {file1, file2, file3};
        File[] files4 = {null};
        String[] formats1 = {null};
        String[] formats2 = {"html", "txt", "exe", "jpg", "java"};
        String[] formats3 = {"html", "txt", "exe", "jpg", "java", "php", "pdf", "xml", "png", "mp3"};

        Storage storage1 = new Storage(1101, files1, formats3, "DE", 1000000);
        Storage storage2 = new Storage(1102, files2, formats3, "DE", 15000);
        Storage storage3 = new Storage(1103, files3, formats3, "DE", 1000);
        Storage storage4 = new Storage(1104, files4, formats3, "DE", 120000);

        Controller controller = new Controller();
        controller.transferAll(storage3,storage1);
        System.out.println(Arrays.toString(storage1.getFiles()));
//        controller.put(storage1,file3);
//        Sys.out.println(Arrays.toString(storage1.getFiles()));

    }
}
