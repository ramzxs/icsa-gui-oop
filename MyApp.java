import javax.swing.*;
import java.util.Date;

public class MyApp extends JFrame {
    public static void main(String[] args) {
        new MyApp();
    }

    public MyApp() {
        Card c = new DebitCard();
        c.setCardNumber(1001);

        c.expiry = new Date(2000, 1, 1);

        System.out.println("Card 1 = " + c.toString());
        c.reportStolen();
    }
}
