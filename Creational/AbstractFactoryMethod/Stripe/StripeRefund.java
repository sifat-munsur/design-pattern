package Creational.AbstractFactoryMethod.Stripe;

import java.sql.Ref;

import Creational.AbstractFactoryMethod.Product.Refund;

public class StripeRefund implements Refund {
    
    @Override
    public void refund(String transactionId, double amount) {
        System.out.println(
                "Refunding $" + amount +
                " through Stripe. Transaction: " +
                transactionId
        );
    }

}
