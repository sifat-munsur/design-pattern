package Creational.AbstractFactoryMethod.Stripe;

import Creational.AbstractFactoryMethod.Product.Payment;

public class StripePayment implements Payment {
    
    @Override
    public void pay(double amount) {
        System.out.println(
                "Processing Stripe payment: $" + amount
        );
    }

}
