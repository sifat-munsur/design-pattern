package Creational.AbstractFactoryMethod.Stripe;

import Creational.AbstractFactoryMethod.Product.PaymentValidator;

public class StripeValidator implements PaymentValidator{
    
    @Override
    public boolean validate(String paymentDetails) {

        System.out.println(
                "Validating Stripe payment details"
        );

        return true;
    }

}
