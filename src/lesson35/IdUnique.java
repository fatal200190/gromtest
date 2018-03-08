package lesson35;

import java.util.UUID;

public class IdUnique {
//    static long current = System.currentTimeMillis();
//    static public synchronized long get(){
//        return current++;
//    }
private static long idCounter = 0;

    public static synchronized long get()
    {
        return idCounter++;
    }

}
