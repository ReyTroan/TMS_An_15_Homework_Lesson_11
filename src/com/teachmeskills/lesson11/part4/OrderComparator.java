package com.teachmeskills.lesson11.part4;

import java.util.Comparator;

/**
 * Creating your own comparator for comparing order prices
 */
class OrderComparator implements Comparator<Orders> {

    public int compare(Orders o1, Orders o2){
        return Double.compare(o1.order_price, o2.order_price);
    }
}
