public class MyApp {
    public static void main(String[] args) {
        Card c = new Card();
        System.out.println("Card 1 = " + c.toString()); // Card 1 = Card 0

        c.setCardNumber(999);                           // Invalid
        System.out.println("Card 1 = " + c.toString()); // Card 1 = Card 0

        c.setCardNumber(1234);
        System.out.println("Card 1 = " + c.toString());
    }
}
