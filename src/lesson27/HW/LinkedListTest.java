package lesson27.HW;

import java.util.LinkedList;

public class LinkedListTest {
    private LinkedList useList(){
        LinkedList<Order>linkedList0 = new LinkedList<>();
        LinkedList<Order> linkedList = new LinkedList<>();
        Order order1 = new Order(101,100,"USD","tool","WWW");
        Order order2 = new Order(102,200,"USD","tool1","FFF");
        Order order3 = new Order(103,300,"USD","tool2","RRR");
        Order order4 = new Order(104,400,"USD","tool3","LLL");
        Order order5 = new Order(105,500,"USD","tool4","TTT");
        Order order6 = new Order(106,600,"EUR","hummer","UAR");
        linkedList0.add(order2);
        linkedList0.add(order3);
        linkedList0.add(order4);
        linkedList0.add(order5);
        linkedList0.add(order6);

        linkedList.add(order1);
        linkedList.add(1,order2);
        linkedList.remove(order2);
        linkedList.remove(0);
        linkedList0.subList(0,2);
        linkedList0.set(4,order1);
        linkedList0.contains(order1);
        linkedList0.toArray();
        linkedList.clear();
        linkedList.addAll(linkedList0);
        return linkedList;
    }
}
