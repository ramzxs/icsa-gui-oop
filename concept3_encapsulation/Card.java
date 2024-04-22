import java.util.Date;

public class Card {
    private int cardNumber;  // Encapsulation
    Date expiry;
    int security;

    @Override
    public String toString() {
        return "Card " + cardNumber;
    }

    
    /* GETTERS & SETTERS */

    public int getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(int cn) {
        if (cn > 1000) {
            System.out.println("Valid Card Number (Saved)");
            this.cardNumber = cn;
        } else {
            System.out.println("Invalid Card Number (No Change Made)");
        }
    }
}
