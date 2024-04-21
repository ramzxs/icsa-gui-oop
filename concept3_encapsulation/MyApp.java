public class MyApp {
    public static void main(String[] args) {
        Card c = new Card();
        System.out.println("Card 1 = " + c.toString());

        c.setCardNumber(999);
        System.out.println("Card 1 = " + c.toString());

        c.setCardNumber(1234);
        System.out.println("Card 1 = " + c.toString());
    }
}
