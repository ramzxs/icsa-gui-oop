public class CreditCard extends Card {  // Inheritance
    String type = "CREDIT CARD";
    float interestRate = 5;
    float transactionLimit = 1000;


    @Override
    public String toString() {
        return "Credit Card " + cardNumber;
    }
}
