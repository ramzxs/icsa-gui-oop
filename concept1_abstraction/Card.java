import java.util.Date;

public abstract class Card {  // Abstraction
    int cardNumber;
    Date expiry;
    int security;

    // Abstraction
    public abstract void reportStolen();
    public abstract void block();

    @Override
    public String toString() {
        return "Card " + cardNumber;
    }
}
