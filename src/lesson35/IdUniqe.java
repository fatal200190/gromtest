package lesson35;

public class IdUniqe {
    static long current = System.currentTimeMillis();
    static public synchronized long get(){
        return current++;
    }
}
