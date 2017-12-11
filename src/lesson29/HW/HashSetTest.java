package lesson29.HW;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static Set<Order> useHashSet(){
        Set<Order>orderSet = new HashSet<>();
        Set<Order>orderSet1 = new HashSet<>();
        Order order1 = new Order(101,1000,"USD","loop","QQQ");
        Order order2 = new Order(102,2000,"EUR","soup","WWW");
        Order order3 = new Order(103,3000,"GBP","toast","EEE");
        Order order4 = new Order(104,4000,"HUF","pick","RRR");
        Order order5 = new Order(105,5000,"UAH","card","TTT");
        orderSet.add(order1);
        orderSet.add(order2);
        orderSet.add(order3);
        orderSet.add(order4);
        orderSet.add(order5);
        orderSet1.add(order1);
        orderSet1.add(order2);
        orderSet1.add(order3);
        orderSet.retainAll(orderSet1);
        orderSet1.remove(order3);
        orderSet.toArray();
        orderSet.size();
        orderSet.addAll(orderSet1);
        return orderSet;
    }
}
