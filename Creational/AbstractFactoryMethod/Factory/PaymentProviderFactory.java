package Creational.AbstractFactoryMethod.Factory;

import Creational.AbstractFactoryMethod.Product.Payment;
import Creational.AbstractFactoryMethod.Product.PaymentValidator;
import Creational.AbstractFactoryMethod.Product.Refund;

public interface PaymentProviderFactory {
    
    Payment createPayment();
    Refund createRefund();
    PaymentValidator createPaymentValidator();

}
