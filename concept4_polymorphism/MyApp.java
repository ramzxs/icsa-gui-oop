public class MyApp {
    public static void main(String[] args) {
        Card c1 = new CreditCard();  // Polymorphism
        System.out.println("Card 1 = " + c1.toString());

        Card c2 = new DebitCard();  // Polymorphism
        System.out.println("Card 2 = " + c2.toString());
    }
}
