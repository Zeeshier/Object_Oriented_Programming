abstract class Payment {
    abstract void processPayment();
}

class CreditCard extends Payment {
    @Override
    void processPayment() {
        System.out.println("Processing credit card payment...");
    }
}

class DebitCard extends Payment {
    @Override
    void processPayment() {
        System.out.println("Processing debit card payment...");
    }
}

class Cash extends Payment {
    @Override
    void processPayment() {
        System.out.println("Processing cash payment...");
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
        }
    }
}
