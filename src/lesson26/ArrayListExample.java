package lesson26;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        int[]test = new int[5];
        test[0] = 10;
        //...
        int[]test1 = {1,2,3};


        //arraylist
        ArrayList<Integer>list = new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(7);
        System.out.println(list.toString());

        list.remove(0);
        System.out.println(list.toString());

        list.add(11);
        list.add(11);
        System.out.println(list.toString());

        list.add(2,33);
        System.out.println(list.toString());

        ArrayList<Integer>list1 = new ArrayList<>();
        list1.add(0);
        list1.add(0);

        list.addAll(list1);
        System.out.println(list.toString());

        list.set(3,5555);
        System.out.println(list.toString());

        list.clear();
        System.out.println(list.toString());

    }

    private ArrayList useList(Order order1, Order order2, Order order3, Order order4, Order order5){
        ArrayList<Order> list0 = new ArrayList<>();
        list0.add(order1);
        list0.add(order2);
        list0.add(order3);
        list0.add(order4);
        list0.add(order5);
        ArrayList<Order> list3 = new ArrayList<>();
        list3.add(order1);
        list3.add(1,order2);
        list3.remove(1);
        list3.remove(order1);
        list0.subList(0,2);
        list0.set(0,order2);
        list0.contains(order2);
        list0.toArray();
        list3.clear();
        list3.addAll(list0);
        return list3;
    }
}
