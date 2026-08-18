package Creational.AbstractFactoryMethod.Factory;

import Creational.AbstractFactoryMethod.Product.Payment;
import Creational.AbstractFactoryMethod.Product.PaymentValidator;
import Creational.AbstractFactoryMethod.Product.Refund;
import Creational.AbstractFactoryMethod.bKash.BkashPayment;
import Creational.AbstractFactoryMethod.bKash.BkashRefund;
import Creational.AbstractFactoryMethod.bKash.BkashValidator;

public class BkashFactory implements PaymentProviderFactory{
    
    @Override
    public Payment createPayment() {
        return new BkashPayment();
    }

    @Override
    public Refund createRefund() {
        return new BkashRefund();
    }

    @Override
    public PaymentValidator createPaymentValidator() {
        return new BkashValidator();
    }

}
