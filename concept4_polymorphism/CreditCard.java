public class CreditCard extends Card {
    String type = "CREDIT CARD";
    float interestRate = 5;
    float transactionLimit = 1000;


    @Override
    public String toString() {
        return cardNumber + " [" + type + "]";
    }
}
