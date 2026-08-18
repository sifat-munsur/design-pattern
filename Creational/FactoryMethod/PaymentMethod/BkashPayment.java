package Creational.FactoryMethod.PaymentMethod;

public class BkashPayment implements Payment {

    public void pay(double amount){
        System.out.println("Paid " + amount + " using bKash");
    }    

}
