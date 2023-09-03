package com.teachmeskills.lesson11.part4;

/**
 * Implemented a constructor with the parameters of the number and cost of the order
 */
public class Orders {

    double order_number;
    double order_price;
    public Orders(int order_number, double order_price){
        this.order_number = order_number;
        this.order_price = order_price;
    }

    //redefining the toString method
    @Override
    public String toString() {
        return "Order: [" +
                "number = " + order_number +
                ", price = " + order_price +
                ']';
    }
}

