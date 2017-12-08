package lesson28;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class DemoComparator {
    public static void main(String[] args) {
        Capability capability1 = new Capability(1001,"test4","rrrr",true, null);
        Capability capability2 = new Capability(1005,null,"rrrr3",false, new Date());
        Capability capability3 = new Capability(1004,"test1",null,true, new Date());
        Capability capability4 = new Capability(1002,"test2","rrrr2",false, null);
        Capability capability5 = new Capability(1006,"test3","abc",false, new Date());
        Capability capability6 = new Capability(1006,"test3","bcd",false, new Date());

        ArrayList<Capability>capabilities = new ArrayList<>();
        capabilities.add(capability1);
        capabilities.add(capability2);
        capabilities.add(capability3);
        capabilities.add(capability4);
        capabilities.add(capability5);
        capabilities.add(capability6);


        System.out.println(capabilities);

        capabilities.sort(new IsActiveComparator());

        System.out.println(capabilities);

        capabilities.sort(new FullComparator());
        System.out.println(capabilities);

        capabilities.sort(new DateComparator());
        System.out.println(capabilities);


    }
}
