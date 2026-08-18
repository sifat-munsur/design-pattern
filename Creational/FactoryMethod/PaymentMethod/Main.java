package Creational.FactoryMethod.PaymentMethod;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.processPayment(
                "bkash",
                500
        );

        paymentService.processPayment(
                "card",
                1200
        );

        paymentService.processPayment(
                "paypal",
                5000
        );
    }
}
