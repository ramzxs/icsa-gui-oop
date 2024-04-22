public class MyApp {
    public static void main(String[] args) {
        Card c = new Card();                              // OK; Can be instantiated
        System.out.println("Card 1 = " + c.toString());   // Card 1 = Card 0

        CreditCard cc = new CreditCard();
        cc.cardNumber = 1234;
        System.out.println("Card 2 = " + cc.toString());  // Card 2 = Credit Card 1234

        DebitCard dc = new DebitCard();
        dc.cardNumber = 5678;
        System.out.println("Card 3 = " + dc.toString());  // Card 3 = Debit Card 5678  
    }
}
