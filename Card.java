import java.util.Date;

public abstract class Card {
    private int cardNumber;
    Date expiry;
    int security;

    public abstract void reportStolen();

    @Override
    public String toString() {
        return "Card " + cardNumber;
    }

    public void setCardNumber(int cn) {
        if (cn <= 1000) {
            System.out.println("INVALID");
        } else {
            this.cardNumber = cn;
        }
    }

    public int getCardNumber() {
        return cardNumber;
    }
}
