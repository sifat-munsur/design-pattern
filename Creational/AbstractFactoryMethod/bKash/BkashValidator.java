package Creational.AbstractFactoryMethod.bKash;

import Creational.AbstractFactoryMethod.Product.PaymentValidator;

public class BkashValidator implements PaymentValidator{

    @Override
    public boolean validate(String paymentDetails) {

        System.out.println(
                "Validating bKash payment details"
        );

        return true;
    }
    
}
