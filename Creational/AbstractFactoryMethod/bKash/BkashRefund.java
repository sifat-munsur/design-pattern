package Creational.AbstractFactoryMethod.bKash;

import Creational.AbstractFactoryMethod.Product.Refund;

public class BkashRefund implements Refund {

    @Override
    public void refund(String transactionId, double amount) {
        System.out.println(
                "Refunding ৳" + amount +
                " through bKash. Transaction: " +
                transactionId
        );
    }
}
