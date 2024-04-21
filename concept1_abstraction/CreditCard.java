public class CreditCard extends Card {
    String type = "CREDITCARD";
    float interestRate = 5;
    float transactionLimit = 1000;

    @Override
    public void reportStolen() {
        System.out.println("Report Stolen @ Credit Card");
    }

    @Override
    public void block() {
        System.out.println("Block @ Credit Card");
    }


    @Override
    public String toString() {
        return cardNumber + " [" + type + "]";
    }
}
