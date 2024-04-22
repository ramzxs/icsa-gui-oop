import java.util.Date;

public abstract class Card {  // Abstraction
    int cardNumber;
    Date expiry;
    int security;


    @Override
    public String toString() {
        return "Card " + cardNumber;
    }


    // Abstraction
    public abstract void reportStolen();
    public abstract void block();
}
