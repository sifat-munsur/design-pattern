package Creational.AbstractFactoryMethod.Factory;

import Creational.AbstractFactoryMethod.Product.Payment;
import Creational.AbstractFactoryMethod.Product.PaymentValidator;
import Creational.AbstractFactoryMethod.Product.Refund;
import Creational.AbstractFactoryMethod.Stripe.StripePayment;
import Creational.AbstractFactoryMethod.Stripe.StripeRefund;
import Creational.AbstractFactoryMethod.Stripe.StripeValidator;

public class StripeFactory implements PaymentProviderFactory{
    @Override
    public Payment createPayment() {
        return new StripePayment();
    }

    @Override
    public Refund createRefund() {
        return new StripeRefund();
    }

    @Override
    public PaymentValidator createPaymentValidator() {
        return new StripeValidator();
    }
}
