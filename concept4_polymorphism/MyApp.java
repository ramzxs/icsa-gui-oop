public class MyApp {
    public static void main(String[] args) {
        CreditCard cc = new CreditCard();  // Normal object instantiation
        cc = new CreditCard();             // You can only store a CreditCard object here


        Card c1 = new CreditCard();  // Polymorphism
        System.out.println("Card 1 = " + c1.toString());

        // Polymorphism
        c1 = new Card();
        c1 = new CreditCard();
        c1 = new DebitCard();

        Card c2 = new DebitCard();  // Polymorphism
        System.out.println("Card 2 = " + c2.toString());

        // Polymorphism
        c2 = new Card();
        c2 = new CreditCard();
        c2 = new DebitCard();
    }
}
