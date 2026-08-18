package Creational.FactoryMethod.PaymentMethod;

public class NagadPayment implements Payment {
    public void pay(double amount){
        System.out.println("Paid " + amount + " using Nagad");
    }
}
