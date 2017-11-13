package Lesson19.HW;

import java.util.Arrays;

/**
 * Created by Alex on 06.11.2017.
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        File file1 = new File(101,"Adam","html",200);
        File file2 = new File(102,"Bill","txt",500);
        File file3 = new File(103,"Cell","exe",200);
        File file4 = new File(104,"Den","jpg",100);
        File file5 = new File(105,"Evan","java",150);
        File file6 = new File(106,"Fan","php",300);
        File file7 = new File(107,"Glen","pdf",100);
        File file8 = new File(108,"Homer","xml",500);
        File file9 = new File(109,"Ivan","png",1000);
        File file10 = new File(110,"Jack","mp3",10000);


        File[]files1 = {file1, null, file2,file3, null, file4,file6};
        File[]files2 = {file5, file4, file6};
        File[]files3 = {file1,file2,file3};
        File[]files4 = {null};
        String[]formats1 = {null};
        String[]formats2 = {"html","txt","exe","jpg","java"};
        String[]formats3 = {"html","txt","exe","jpg","java","php","pdf","xml","png","mp3"};

        Storage storage1 = new Storage(1101,files1,formats3,"DE",10000);
        Storage storage2 = new Storage(1102,files2,formats3,"DE",15000);
        Storage storage3 = new Storage(1103,files3,formats1,"DE",1000);
        Storage storage4 = new Storage(1104,files4,formats3,"DE",12000);

        Controller controller = new Controller();
//        controller.put(storage1,file5);
//        System.out.println(Arrays.toString(storage1.getFiles()));
//        controller.put(storage1,file7);
//        System.out.println(Arrays.toString(storage1.getFiles()));
//        controller.put(storage1,file10);
//        System.out.println(Arrays.toString(storage1.getFiles()));
//
//        controller.delete(storage2,file4);
//        System.out.println(Arrays.toString(storage2.getFiles()));
//        controller.delete(storage2,file6);
//        System.out.println(Arrays.toString(storage2.getFiles()));
//        controller.delete(storage2,file5);
//        System.out.println(Arrays.toString(storage2.getFiles()));

        controller.transferAll(storage3,storage2);
        System.out.println(Arrays.toString(storage2.getFiles()));
        controller.transferAll(storage2,storage4);
        System.out.println(Arrays.toString(storage2.getFiles()));
//        controller.transferAll(storage4,storage1);
//        System.out.println(Arrays.toString(storage2.getFiles()));

        controller.transferFile(storage4,storage1,105);
        System.out.println(Arrays.toString(storage1.getFiles()));






    }
}
