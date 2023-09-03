package com.teachmeskills.lesson11.part4;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        ArrayList<Orders> listOrder = new ArrayList<>();

        Orders orders1 = new Orders(111111, 111);
        Orders orders2 = new Orders(222222, 222);
        Orders orders3 = new Orders(333333, 333);

        listOrder.add(orders3);
        listOrder.add(orders1);
        listOrder.add(orders2);

        for (Orders order : listOrder){
            System.out.println(order);
        }

        listOrder.sort(new OrderComparator());

        for (Orders order : listOrder){
            System.out.println("Sorted " + order);
        }
    }
}
