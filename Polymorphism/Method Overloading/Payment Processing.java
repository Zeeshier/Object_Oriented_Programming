abstract class Payment {
    void processPayment() {
        System.out.println("Processing payment...");
    }

    void processPayment(String paymentMethod) {
        System.out.println("Processing " + paymentMethod + " payment...");
    }

    void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + "...");
    }

    void processPayment(String paymentMethod, double amount) {
        System.out.println("Processing " + paymentMethod + " payment of $" + amount + "...");
    }
}

class CreditCard extends Payment {
    @Override
    void processPayment() {
        System.out.println("Processing credit card payment...");
    }

    @Override
    void processPayment(String paymentMethod) {
        System.out.println("Processing credit card " + paymentMethod + " payment...");
    }

    @Override
    void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount + "...");
    }

    @Override
    void processPayment(String paymentMethod, double amount) {
        System.out.println("Processing credit card " + paymentMethod + " payment of $" + amount + "...");
    }
}

class DebitCard extends Payment {
    @Override
    void processPayment() {
        System.out.println("Processing debit card payment...");
    }

    @Override
    void processPayment(String paymentMethod) {
        System.out.println("Processing debit card " + paymentMethod + " payment...");
    }

    @Override
    void processPayment(double amount) {
        System.out.println("Processing debit card payment of $" + amount + "...");
    }

    @Override
    void processPayment(String paymentMethod, double amount) {
        System.out.println("Processing debit card " + paymentMethod + " payment of $" + amount + "...");
    }
}

class Cash extends Payment {
    @Override
    void processPayment() {
        System.out.println("Processing cash payment...");
    }

    @Override
    void processPayment(String paymentMethod) {
        System.out.println("Processing cash " + paymentMethod + " payment...");
    }

    @Override
    void processPayment(double amount) {
        System.out.println("Processing cash payment of $" + amount + "...");
    }

    @Override
    void processPayment(String paymentMethod, double amount) {
        System.out.println("Processing cash " + paymentMethod + " payment of $" + amount + "...");
    }
}

public class PaymentProcessing {
    public static void main(String[] args) {
        Payment[] payments = new Payment[4];
        payments[0] = new CreditCard();
        payments[1] = new DebitCard();
        payments[2] = new Cash();
        payments[3] = new CreditCard();

        for (Payment payment : payments) {
            payment.processPayment();
            payment.processPayment("online");
            payment.processPayment(100.0);
            payment.processPayment("online", 100.0);
        }
    }
}
