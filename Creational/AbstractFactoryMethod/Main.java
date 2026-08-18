package Creational.AbstractFactoryMethod;

import Creational.AbstractFactoryMethod.Factory.BkashFactory;
import Creational.AbstractFactoryMethod.Factory.PaymentProviderFactory;
import Creational.AbstractFactoryMethod.Product.Payment;
import Creational.AbstractFactoryMethod.Product.PaymentValidator;
import Creational.AbstractFactoryMethod.Product.Refund;

public class Main {

    public static void main(String[] args) {
        PaymentProviderFactory factory =
                new BkashFactory();

        Payment payment = factory.createPayment();

        PaymentValidator validator =
                factory.createPaymentValidator();

        Refund refund =
                factory.createRefund();

        if (validator.validate("017XXXXXXXX")) {

            payment.pay(500);

            refund.refund(
                    "TXN-1001",
                    200
            );
        }
    }
    
}