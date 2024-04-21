import java.util.Date;

public class MyApp {
    public static void main(String[] args) {
        // Card c = new Card(); - Invalid

        CreditCard c = new CreditCard();
        c.cardNumber = 1234;
        c.expiry = new Date(2000, 1, 1);

        System.out.println("Card 1 = " + c.toString());
        c.reportStolen();
        c.block();
    }
}
