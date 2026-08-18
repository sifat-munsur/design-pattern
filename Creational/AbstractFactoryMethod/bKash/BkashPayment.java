package Creational.AbstractFactoryMethod.bKash;

import Creational.AbstractFactoryMethod.Product.Payment;

public class BkashPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println(
                "Processing bKash payment: ৳" + amount
        );
    }
}
