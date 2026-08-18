package Creational.FactoryMethod.PaymentMethod;

public class PaymentFactory {

    public static Payment createPayment(String type) {
        
        if (type.equalsIgnoreCase("card")) {
            return new CardPayment();
        }

        if (type.equalsIgnoreCase("bkash")) {
            return new BkashPayment();
        }

        if (type.equalsIgnoreCase("nagad")) {
            return new NagadPayment();
        }

        if (type.equalsIgnoreCase("paypal")) {
            return new PaypalPayment();
        }

        throw new IllegalArgumentException(
                "Unsupported payment method: " + type
        );
    }
}
