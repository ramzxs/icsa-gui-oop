public class DebitCard extends Card {  // Inheritance
    String type = "DEBIT CARD";
    float interestRate = 5;
    float transactionLimit = 1000;


    @Override
    public String toString() {
        return cardNumber + " [" + type + "]";
    }
}
