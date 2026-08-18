package Creational.FactoryMethod.PaymentMethod;

public class PaymentService {
    public void processPayment(String paymentType, double amount){
        Payment payment = PaymentFactory.createPayment(paymentType);
        payment.pay(amount);
    }
}
