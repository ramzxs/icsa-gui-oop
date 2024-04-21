public class MyApp {
    public static void main(String[] args) {
        Card c = new Card(); // OK
        System.out.println("Card 1 = " + c.toString());

        CreditCard cc = new CreditCard();
        cc.cardNumber = 1234;
        System.out.println("Card 2 = " + cc.toString());

        DebitCard dc = new DebitCard();
        dc.cardNumber = 5678;
        System.out.println("Card 3 = " + dc.toString());        
    }
}
