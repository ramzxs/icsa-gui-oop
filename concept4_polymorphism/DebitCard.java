public class DebitCard extends Card {
    String type = "DEBIT CARD";
    float interestRate = 0;
    float transactionLimit = 1000;


    @Override
    public String toString() {
        return cardNumber + " [" + type + "]";
    }
}
