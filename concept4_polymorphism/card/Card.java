package card;
import java.util.Date;

public class Card {
    int cardNumber;
    Date expiry;
    int security;

    @Override
    public String toString() {
        return "Card " + cardNumber;
    }
}
