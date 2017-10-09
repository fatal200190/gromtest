package Lesson11.biginterfaceexample;

/**
 * Created by Alex on 30.08.2017.
 */
public class Demo {
    public static void main(String[] args) {
        File file1 = new File("text", "C/user/home","txt",11 );
        File file2 = new File("text", "C/user/home","txt",11 );
        File file3 = new File("video", "C/user/home","txt",120 );
        //File file4 = new File("text", "C/user/home","txt",11 );
        File file5 = new File("myhome", "C/user/home","jpg",120 );

        File[] files = new File[]{file1,file2,file3, null,file5};
        Storage storage = new Storage(files);


        FileReader fileReader = new FileReader();
        SimpleReader simpleReader = new SimpleReader();

        //проверка найти файл макс размера+
        //макс файлі имеют однаковый размер+
        //пустой массив -


        read(storage,fileReader);

        read(storage,simpleReader);


    }

    private static void read(Storage storage, Readable readable){
        System.out.println("method is starting");
        readable.readFilesFromStorage(storage);
    }
}
