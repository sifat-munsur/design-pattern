package Creational.FactoryMethod.PaymentMethod;

public class PaypalPayment implements Payment {
    @Override
    public void pay(double amount){
            System.out.println("Paid " + amount + " using PayPal");

    }
}
