import java.util.Date;

public class MyApp {
    public static void main(String[] args) {
        // Card c = new Card();  // ERROR; Cannot be instantiated

        CreditCard cc = new CreditCard();
        cc.cardNumber = 1234;
        cc.expiry = new Date(2000, 1, 1);

        System.out.println("Card 1 = " + cc.toString());  // Card 1 = 1234 [CREDITCARD]
        cc.reportStolen();
        cc.block();
    }
}
